package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero entre 5 y 10
		System.out.print("Ingrese un número entre 5 y 10: ");
		int cantidadElementos = scanner.nextInt();

		// Validar que el número ingresado esté dentro del rango
		while (cantidadElementos < 5 || cantidadElementos > 10) {
			System.out.print("Error. Ingrese un número válido entre 5 y 10: ");
			cantidadElementos = scanner.nextInt();
		}

		// Crear un arreglo de cadenas con la cantidad de elementos ingresados
		String arreglo[] = new String[cantidadElementos];
		System.out.println("Se creó un arreglo de cadenas con " + cantidadElementos + " elementos.");

		// Solicitar al usuario que ingrese los valores de los elementos del arreglo
		scanner.nextLine(); // Consumir el salto de línea pendiente
		for (int i = 0; i < cantidadElementos; i++) {
			System.out.print("Ingrese la cadena " + (i + 1) + ": ");
			arreglo[i] = scanner.nextLine();
		}

		// Mostrar los valores de los elementos en orden inverso
		for (int i = cantidadElementos - 1; i >= 0; i--) {
			System.out.println("Cadena " + (i + 1) + " del arreglo: " + arreglo[i]);
		}

		scanner.close();
	}
}
