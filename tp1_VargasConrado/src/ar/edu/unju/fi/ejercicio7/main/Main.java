package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ingreso de datos del empleado por consola y creación del objeto empleado1.
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el legajo del empleado: ");
		int legajo = sc.nextInt();
		System.out.println("Ingrese el salario del empleado: ");
		double salario = sc.nextDouble();
		Empleado empleado1 = new Empleado(nombre, legajo, salario);
		// Mostrar los datos del empleado y aumentar el salario.
		empleado1.mostrarDatos();
		empleado1.aumentarSalario();
		// Mostrar los datos del empleado después de aumentar el salario.
		empleado1.mostrarDatos();
		sc.close();
	}
}
