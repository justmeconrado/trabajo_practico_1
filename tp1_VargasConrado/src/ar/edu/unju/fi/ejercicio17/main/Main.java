package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	// Se crea un ArrayList de Jugadores
	private static ArrayList<Jugador> jugadores = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		// Se crea un bucle do-while para mostrar el menu de opciones al usuario y que
		// este pueda elegir una opcion hasta que elija la opcion 8
		do {
			mostrarMenu(jugadores, scanner);
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				altaJugador(jugadores, scanner);
				break;
			case 2:
				mostrarDatosJugador(jugadores, scanner);
				break;
			case 3:
				mostrarJugadoresOrdenados(jugadores);
				break;
			case 4:
				modificarJugador(jugadores, scanner);
				break;
			case 5:
				eliminarJugador(jugadores, scanner);
				break;
			case 6:
				mostrarCantidadTotalJugadores(jugadores);
				break;
			case 7:
				mostrarCantidadPorNacionalidad(jugadores, scanner);
				break;
			case 8:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opcion invalida, por favor intente de nuevo.");
				break;
			}
		} while (opcion != 8);
	}

	// Se crean los metodos para cada una de las opciones del menu
	private static void mostrarMenu(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("MENU");
		System.out.println("1 - Alta de jugador");
		System.out.println("2 - Mostrar los datos del jugador");
		System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
		System.out.println("4 - Modificar los datos de un jugador");
		System.out.println("5 - Eliminar un jugador");
		System.out.println("6 - Mostrar la cantidad total de jugadores");
		System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8 - Salir");
		System.out.print("Ingrese una opcion: ");
	}

	// Se crea el metodo para dar de alta un jugador
	private static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("Ingrese los datos del jugador:");
		// generamos la excepcion en caso de que el formato de fecha no sea bien
		// ingresado.
		try {
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.print("Apellido: ");
			String apellido = scanner.nextLine();
			System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
			LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
			System.out.print("Nacionalidad: ");
			String nacionalidad = scanner.nextLine();
			System.out.print("Peso (en kg): ");
			double peso = scanner.nextDouble();
			System.out.print("Estatura (en metros): ");
			double estatura = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Posicion (delantero, medio, defensa, arquero): ");
			String posicion = scanner.nextLine();
			Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
			jugadores.add(jugador);
		} catch (DateTimeParseException e) {
			System.out.println("Error: Formato de fecha incorrecto. Debe ser YYYY-MM-DD.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Formato de número incorrecto.");
		}
		System.out.println("Jugador agregado correctamente.");
	}

	// Se crea el metodo para mostrar los datos de un jugador
	private static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("Ingrese el nombre y apellido del jugador:");
		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Apellido: ");
		String apellido = scanner.nextLine();

		boolean jugadorEncontrado = false;
		// buscamos en el array si el jugador existe.
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				System.out.println("Datos del Jugador");
				System.out.println("Nombre: " + jugador.getNombre());
				System.out.println("Apellido: " + jugador.getApellido());
				System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
				System.out.println("Nacionalidad: " + jugador.getNacionalidad());
				System.out.println("Estatura: " + jugador.getEstatura() + "m");
				System.out.println("Peso: " + jugador.getPeso() + "kg");
				System.out.println("Posicion: " + jugador.getPosicion());
				System.out.println("Edad: " + jugador.calcularEdad() + " años");
				jugadorEncontrado = true;
				break;// salimos del bucle para evitar que siga buscando jugadores restantes en el
						// arreglo.
			}
		}
		// en caso de que no existiese ese jugador se muestra el mensaje por consola.
		if (!jugadorEncontrado) {
			System.out.println("No se encontro ningun jugador con el nombre y apellido ingresados.");
		}
	}

	private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
		// en caso de elejir la op mostrar jugadores y aun no se haya guardado ninguno
		// se muestra el mensaje por pantalla
		if (jugadores.isEmpty()) {
			System.out.println("No hay jugadores para mostrar.");
			return;
		}
		// ordenamos a los jugadores por apellido y luego los mostramos por pantalla.
		Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));
		System.out.println("Jugadores ordenados por apellido:");
		for (Jugador jugador : jugadores) {
			System.out.println("Nombre: " + jugador.getApellido() + " " + jugador.getNombre());
		}
	}

	// Se crea el metodo para modificar los datos de un jugador
	private static void modificarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.print("Ingrese nombre del jugador a modificar: ");
		String nombre = scanner.next();
		System.out.print("Ingrese apellido del jugador a modificar: ");
		String apellido = scanner.next();
		// recorremos el array de jugadores y si el jugador existe se modifican los
		// datos
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				System.out.println("Ingrese nuevos datos del jugador:");
				System.out.print("Nombre: ");
				jugador.setNombre(scanner.next());
				System.out.print("Apellido: ");
				jugador.setApellido(scanner.next());
				System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
				jugador.setFechaNacimiento(LocalDate.parse(scanner.next()));
				System.out.print("Nacionalidad: ");
				jugador.setNacionalidad(scanner.next());
				System.out.print("Estatura: ");
				jugador.setEstatura(scanner.nextDouble());
				System.out.print("Peso: ");
				jugador.setPeso(scanner.nextDouble());
				System.out.print("Posición: ");
				jugador.setPosicion(scanner.next());
				System.out.println("Datos del jugador modificados correctamente.");
				return;
			} else {
				System.out.println("Jugador no encontrado.");
			}
		}

	}

	// Se crea el metodo para eliminar un jugador.
	private static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.print("Ingrese nombre del jugador a eliminar: ");
		String nombre = scanner.next();
		System.out.print("Ingrese apellido del jugador a eliminar: ");
		String apellido = scanner.next();
		// recorremos el array de jugadores y si el jugador existe se elimina del array.
		Iterator<Jugador> iter = jugadores.iterator();
		while (iter.hasNext()) {
			Jugador jugador = iter.next();
			if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				iter.remove();
				System.out.println("Jugador eliminado correctamente.");
				return;// salimos del bucle para evitar que siga buscando jugadores restantes en el
						// arreglo.
			}
		}
		System.out.println("Jugador no encontrado.");
	}

	// Se crea el metodo para mostrar la cantidad total de jugadores
	private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
		int cantidadJugadores = jugadores.size();
		System.out.println("Cantidad total de jugadores: " + cantidadJugadores);
	}

	// Se crea el metodo para mostrar la cantidad de jugadores por nacionalidad
	private static void mostrarCantidadPorNacionalidad(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.print("Ingrese la nacionalidad a buscar: ");
		String nacionalidadBuscar = scanner.next();
		int contadorJugadores = 0;
		for (Jugador jugador : jugadores) {
			if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar)) {
				contadorJugadores++;
			}
		}

		System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidadBuscar + ": " + contadorJugadores);
	}

}