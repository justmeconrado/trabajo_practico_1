package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitud de ingreso de un número para calcular su factorial al usuario
		System.out.println("Ingrese un número entre 0 y 10 para calcular su factorial: ");
		int num = scanner.nextInt();

		// Verificación del número si está dentro del rango permitido (0 a 10) para el
		// cálculo de su factorial
		if (num >= 0 && num <= 10) {
			int factorial = 1;
			int i = 1;

			while (i <= num) {
				factorial *= i;
				i++;
			}
			System.out.println("El factorial de " + num + " es: " + factorial);
		} else {
			// Si el número está fuera del rango permitido, se muestra un mensaje de error
			System.out.println("Número fuera del rango solicitado. Por favor, ingrese un número entre 0 y 10.");
		}

		scanner.close();

	}

}
