package com.app.persistencia;

import java.util.List;

import com.app.logica.Artista;
import com.app.logica.Cancion;

public class ControladoraPersistencia {
	// Artista: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	ArtistaJpaController artistaJpa = new ArtistaJpaController();

	// Cancion: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	// INSTANCIAR OBJETO DE CANCIONJPACONTROLER AL IGUAL QUE SE HIZO CON ARTISTA
	CancionJpaController cancionJpa = new CancionJpaController();

	// Este método es el que se usa desde otras capas para crear un ARTISTA
	public void crearArtista(Artista artista) {
		// Delegamos la tarea al controlador especializado
		artistaJpa.crear(artista);
	}

	// AL IGUAL QUE CON ARTISTA, GENERAR EL MÉTODO “crearCancion()”
	public void crearCancion(Cancion cancion) {
		cancionJpa.crear(cancion);
	}
	
	// BUSCAR UN ARTISTA
	public Artista buscarArtista(int id) {
	return artistaJpa.buscarUno(id);
	}
	// BUSCAR TODOS LOS ARTISTAS
	public List<Artista> buscarTodosLosArtistas() {
	return artistaJpa.buscarTodos();
	}
	
	public Cancion BuscarCancion(int id) {
	return cancionJpa.BuscarUno(id);
	}
	
	public List<Cancion> BuscarTodasLasCanciones() {
	return cancionJpa.BuscarTodos();
	}
	
}
