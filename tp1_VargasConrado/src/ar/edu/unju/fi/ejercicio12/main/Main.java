package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		// Se solicita el nombre de la persona.
		System.out.println("Ingrese su nombre: ");
		persona.setNombre(sc.nextLine());
		// Se solicita la fecha de nacimiento en formato dd/mm/aaaa.
		System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
		String fecha = sc.nextLine();
		// Se separa la fecha en día, mes y año. Se convierten a enteros.
		String[] partes = fecha.split("/");
		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int anio = Integer.parseInt(partes[2]);
		persona.setFechaNacimiento(dia, mes, anio);
		// Se muestran los datos de la persona.
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
		System.out.println("Edad: " + persona.calcularEdad() + " años");
		System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiacal());

		sc.close();
	}

}
