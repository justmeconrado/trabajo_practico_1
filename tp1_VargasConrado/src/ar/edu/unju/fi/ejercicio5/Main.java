package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Solicitud de ingreso de un número entero entre 1 y 9 para calcular su tabla
		// de multiplicar
		System.out.println("Ingrese un número entero entre 1 y 9 para ver su tabla de multiplicar:");
		int num = scanner.nextInt();
		// Verificación del número si está dentro del rango permitido (0 a 9) para el
		// cálculo de su tabla de multplicar
		if (num >= 1 && num <= 9) {
			System.out.println("Tabla de multiplicar del número " + num + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		} else {
			// Si el número está fuera del rango permitido, se muestra un mensaje de error
			System.out.println("El número ingresado está fuera de rango. Por favor introduce un número entre 1 y 9.");
		}
		scanner.close();
	}

}