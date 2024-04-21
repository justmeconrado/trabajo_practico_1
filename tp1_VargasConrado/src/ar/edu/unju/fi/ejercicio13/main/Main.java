package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese 8 números enteros.
		int[] numeros = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese un número para la posición " + i + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Mostrar los valores almacenados en el array.
		System.out.println("\nValores almacenados en el array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Índice " + i + ": " + numeros[i]);
		}

		scanner.close();
	}
}
