package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero entre 3 y 10
		System.out.print("Ingrese un número entero entre 3 y 10: ");
		int cantidadElementos = scanner.nextInt();

		// Validar que el número ingresado esté dentro del rango
		while (cantidadElementos < 3 || cantidadElementos > 10) {
			System.out.print("Error. Ingrese un número válido entre 3 y 10: ");
			cantidadElementos = scanner.nextInt();
		}

		// Crear un arreglo de enteros con la cantidad de elementos ingresados
		int arreglo[] = new int[cantidadElementos];
		System.out.println("Se creó un arreglo con " + cantidadElementos + " elementos.");

		// Solicitar al usuario que ingrese los valores de los elementos del arreglo
		for (int i = 0; i < cantidadElementos; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			arreglo[i] = scanner.nextInt();
		}

		// Mostrar los valores de los elementos junto con sus índices
		int suma = 0;
		for (int i = 0; i < cantidadElementos; i++) {
			System.out.println("Número " + (i + 1) + ": " + arreglo[i] + " (Índice: " + i + ")");
			suma += arreglo[i];
		}

		// Mostrar la suma de los valores de los elementos del arreglo
		System.out.println("La suma de los valores de los elementos del arreglo es: " + suma);

		scanner.close();
	}
}
