package com.app.presentacion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;

public class Main {
	public static void main(String[] args) {

		Calendar cal1 = new GregorianCalendar(1972, Calendar.AUGUST, 9);
		Date fechaJuanes = cal1.getTime();

		Calendar cal2 = new GregorianCalendar(2009, Calendar.DECEMBER, 11);
		Date fechaChepe = cal2.getTime();

		ControladoraLogica conLog = new ControladoraLogica();
		try {
			// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES

			// INSTANCIAR DOS ARTISTAS
			Artista a1 = new Artista("Juanes", "Pop", "colombiano", 45, fechaJuanes);
			conLog.crearArtista(a1);

			Artista a2 = new Artista("Chepe", "Tango", "argentino", 17, fechaChepe);
			conLog.crearArtista(a2);

			// INSTANCIAR DOS CANCIONES
			Cancion C1 = new Cancion("Camisa Negra", 2.34f, 2000);
			conLog.crearCancion(C1);
			Cancion C2 = new Cancion("Rata Negra", 5.34f, 2014);
			conLog.crearCancion(C2);

		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

		// ----- LECTURA DE ARTISTAS -----
		System.out.println("=== TODOS LOS ARTISTAS ===");
		List<Artista> artistas = conLog.listarArtistas();
		for (Artista a : artistas) {
			System.out.println(a);
		}

		System.out.println("=== BUSCAR ARTISTA CON ID 1 ===");
		Artista encontrado = conLog.buscarUnArtista(1);
		if (encontrado != null) {
			System.out.println(encontrado);
		} else {
			System.out.println("No existe un artista con ese id");
		}

		System.out.println("=== BUSCAR ARTISTA CON ID 999 ===");
		Artista noExiste = conLog.buscarUnArtista(999);
		if (noExiste != null) {
			System.out.println(noExiste);
		} else {
			System.out.println("No existe un artista con ese id");
		}

		// ----- LECTURA DE CANCION -----
		System.out.println("=== TODOS LAS CANCIONES ===");
		List<Cancion> cancion = conLog.ListarCanciones();
		for (Cancion a : cancion) {
			System.out.println(a);
		}

		System.out.println("=== BUSCAR CANCION CON ID 1 ===");
		Cancion encontrado_C = conLog.BuscarUnaCancion(1);
		if (encontrado_C != null) {
			System.out.println(encontrado_C);
		} else {
			System.out.println("No existe un artista con ese id");
		}

		System.out.println("=== BUSCAR CANCION CON ID 999 ===");
		Cancion noExiste_C = conLog.BuscarUnaCancion(999);
		if (noExiste_C != null) {
			System.out.println(noExiste_C);
		} else {
			System.out.println("No existe un artista con ese id");
		}

	}
}
