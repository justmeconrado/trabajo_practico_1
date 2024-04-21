package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crear un arreglo de cadenas con 5 elementos.
		String cadenas[] = new String[5];
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese los valores de los elementos del arreglo.
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese la cadena " + (i + 1) + ": ");
			cadenas[i] = scanner.nextLine();
		}

		// Mostrar el tamaño del array.
		System.out.println("Tamaño del array: " + cadenas.length);

		// Recorrer el arreglo y mostrar el valor de cada elemento junto con su índice.
		for (int i = 0; i < 5; i++) {
			System.out.println("========================");
			System.out.println("Cadena: " + cadenas[i]);
			System.out.println("Índice: " + i);
		}

		// Solicitar al usuario que ingrese el índice de la cadena que desea eliminar.
		byte indiceEliminar;
		do {
			System.out.println("Ingrese el índice (número entre 0 y 4) de la cadena que desea eliminar del array: ");
			indiceEliminar = scanner.nextByte();
		} while (indiceEliminar < 0 || indiceEliminar > 4);
		scanner.close();

		// Eliminar la cadena del arreglo.
		for (int i = indiceEliminar; i < 4; i++) {
			cadenas[i] = cadenas[i + 1];
		}
		cadenas[4] = ""; // o simplemente cadenas[cadenas.length - 1]

		// Mostrar el arreglo actualizado.
		for (int i = 0; i < 5; i++) {
			System.out.println("========================");
			System.out.println("Cadena: " + cadenas[i]);
			System.out.println("Índice: " + i);
		}
	}
}
