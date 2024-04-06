package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitud de ingreso de un número entero al usuario
		System.out.println("Ingrese un número entero: ");

		// Se lee el número entero ingresado por el usuario y se guarda en la variable
		int num = scanner.nextInt();

		// Verificación del número ingresado por el usuario para saber si es par o impar
		if (num % 2 == 0) {
			System.out.println("El Número es par y el triple es " + (num * 3));
		} else {
			System.out.println("El Número es impar y el doble es " + (num * 2));
		}

		scanner.close();
	}

}
