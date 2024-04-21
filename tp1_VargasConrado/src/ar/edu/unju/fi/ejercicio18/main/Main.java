package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pais> paises = cargarPaises();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();

		int opcion;
		// Se crea un bucle do-while para mostrar el menu de opciones al usuario y que
		// este pueda elegir una opcion hasta que elija la opcion 9
		do {
			System.out.println("Menú de opciones:");
			System.out.println("1 - Alta de destino turístico");
			System.out.println("2 - Mostrar todos los destinos turísticos");
			System.out.println("3 - Modificar el país de un destino turístico");
			System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
			System.out.println("5 - Eliminar un destino turístico");
			System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
			System.out.println("7 - Mostrar todos los países");
			System.out.println("8 - Mostrar los destinos turísticos de un país");
			System.out.println("9 - Salir");
			System.out.print("Ingrese su opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				altaDestinoTuristico(destinos, paises, scanner);
				break;
			case 2:
				mostrarDestinosTuristicos(destinos);
				break;
			case 3:
				modificarPaisDestino(destinos, paises, scanner);
				break;
			case 4:
				destinos.clear();
				System.out.println("ArrayList de destinos turísticos limpiado.");
				break;
			case 5:
				eliminarDestinoTuristico(destinos, scanner);
				break;
			case 6:
				mostrarDestinosOrdenados(destinos);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosPorPais(destinos, scanner);
				break;
			case 9:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (opcion != 9);
		scanner.close();
	}

	// Se crea un metodo para cargar los paises en un ArrayList
	private static ArrayList<Pais> cargarPaises() {
		ArrayList<Pais> paises = new ArrayList<>();
		paises.add(new Pais("001", "Argentina"));
		paises.add(new Pais("002", "China"));
		paises.add(new Pais("003", "Estados Unidos"));
		paises.add(new Pais("002", "Rusia"));
		return paises;
	}

	// Se crean los metodos para cada una de las opciones del menu
	private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises,
			Scanner scanner) {
		// Se solicita al usuario que ingrese los detalles del destino turistico
		System.out.println("Ingrese los detalles del destino turistico:");
		System.out.print("Codigo: ");
		String codigo = scanner.next();
		System.out.print("Nombre: ");
		String nombre = scanner.next();
		System.out.print("Precio: ");
		double precio = scanner.nextDouble();
		// Se muestra la lista de paises disponibles
		System.out.println("Paises disponibles:");
		mostrarPaises(paises);
		System.out.print("Ingrese el codigo del pais: ");
		String codigoPais = scanner.next();
		Pais pais = null;
		// Se recorre la lista de paises para encontrar el pais ingresado por el usuario
		// y se guarda en la variable pais
		for (Pais p : paises) {
			if (p.getCodigo().equalsIgnoreCase(codigoPais)) {
				pais = p;
				break;
			}
		}
		if (pais == null) {
			System.out.println("Pais no encontrado.");
			return;
		}

		System.out.print("Cantidad de dias: ");
		int cantidadDias = scanner.nextInt();
		// Se crea un nuevo destino turistico con los datos ingresados por el usuario
		DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
		destinos.add(nuevoDestino);
		System.out.println("Destino turistico añadido correctamente.");
	}

	// Se crea un metodo para mostrar los destinos turisticos
	private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
			System.out.println("No hay destinos turisticos disponibles.");
		} else {
			System.out.println("Lista de destinos turisticos:");
			for (DestinoTuristico destino : destinos) {
				System.out.println(destino);
			}
		}
	}

	// Se crea un metodo para modificar el pais de un destino turistico
	private static void modificarPaisDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises,
			Scanner scanner) {
		System.out.print("Ingrese el codigo del destino turistico que quiere modificar: ");
		String codigoDestino = scanner.next();
		// Se recorre la lista de destinos turisticos para encontrar el destino
		// ingresado por el usuario
		DestinoTuristico destinoModificar = null;
		for (DestinoTuristico destino : destinos) {
			if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
				destinoModificar = destino;
				break;
			}
		}
		if (destinoModificar == null) {
			System.out.println("Destino turistico no encontrado.");
			return;
		}
		// Se muestra la lista de paises disponibles
		System.out.println("Paises disponibles:");
		mostrarPaises(paises);
		System.out.print("Ingrese el codigo del nuevo pais: ");
		String codigoPais = scanner.next();
		Pais nuevoPais = null;
		// Se recorre la lista de paises para encontrar el pais ingresado por el usuario
		for (Pais pais : paises) {
			if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
				nuevoPais = pais;
				break;
			}
		}
		if (nuevoPais == null) {
			System.out.println("Pais no encontrado.");
		} else {
			destinoModificar.setPais(nuevoPais);
			System.out.println("Pais del destino turistico modificado correctamente.");
		}
	}

	// Se crea un metodo para eliminar un destino turistico de la lista
	private static void eliminarDestinoTuristico(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
		System.out.print("Ingrese el código del destino turístico a eliminar: ");
		String codigoDestino = scanner.next();
		// Se recorre la lista de destinos turisticos para encontrar el destino
		// ingresado
		Iterator<DestinoTuristico> iter = destinos.iterator();
		while (iter.hasNext()) {
			DestinoTuristico destino = iter.next();
			if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
				iter.remove();
				System.out.println("Destino turistico eliminado correctamente.");
				return;
			}
		}

		System.out.println("Destino turistico no encontrado.");
	}

	// Se crea un metodo para mostrar los destinos turisticos ordenados por nombre
	// del destino
	private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
			System.out.println("No hay destinos turisticos disponibles.");
		} else {

			Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));

			System.out.println("Destinos turisticos ordenados por nombre:");
			for (DestinoTuristico destino : destinos) {
				System.out.println(destino);
			}
		}
	}

	// Se crea un metodo para mostrar los paises disponibles
	private static void mostrarPaises(ArrayList<Pais> paises) {
		if (paises.isEmpty()) {
			System.out.println("No hay paises disponibles.");
		} else {

			System.out.println("Lista de paises:");
			for (Pais pais : paises) {
				System.out.println(pais.getCodigo() + " - " + pais.getNombre());
			}
		}
	}

	// Se crea un metodo para mostrar los destinos turisticos de un pais
	private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
		System.out.print("Ingrese el código del país para mostrar su destino turisticos: ");
		String codigoPais = scanner.next();

		System.out.println("Destinos turisticos del pais con cidogo " + codigoPais + ":");

		boolean encontrado = false;
		for (DestinoTuristico destino : destinos) {
			if (destino.getPais().getCodigo().equalsIgnoreCase(codigoPais)) {
				System.out.println(destino);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontraron destinos turisticos para el pais con codigo " + codigoPais);
		}
	}
}