package ar.edu.unju.fi.ejercicio6.Main;

import ar.edu.unju.fi.ejercicio6.Model.Persona;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creación del primer objeto Persona utilizando el constructor por defecto
        System.out.println("Objeto con constructor por defecto");
        Persona persona1 = new Persona();
        persona1.mostrarDatos();

        // Creación del primer objeto Persona utilizando el constructor parametrizado
        System.out.println("Objeto con constructor parametrizado");
        System.out.println("Ingrese DNI de la persona 1: ");
        persona1.setDni(sc.nextLine());
        System.out.println("Ingrese nombre de la persona 1: ");
        persona1.setNombre(sc.nextLine());
        System.out.println("Ingrese fecha de nacimiento de la persona 1 (yyyy-mm-dd): ");
        persona1.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
        System.out.println("Ingrese provincia de la persona 1: ");
        persona1.setProvincia(sc.nextLine());
        System.out.println("DNI de la persona 1: " + persona1.getDni());
        System.out.println("Nombre de la persona 1: " + persona1.getNombre());
        System.out.println("Fecha de nacimiento de la persona 1: " + persona1.getFechaNacimiento());
        persona1.mostrarDatos();
        System.out.println(); // Salto de línea para separar los datos de las personas

        // Creación del segundo objeto Persona utilizando el constructor con 1 parámetro
        System.out.println("Objeto con constructor parametrizado con 1 parámetro");
        System.out.println("Ingrese DNI de la persona 2: ");
        String dni2 = sc.nextLine();
        System.out.println("Ingrese nombre de la persona 2: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento de la persona 2 (yyyy-mm-dd): ");
        LocalDate fechaNacimiento2 = LocalDate.parse(sc.nextLine());
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2);
        System.out.println("DNI de la persona 2: " + persona2.getDni());
        System.out.println("Nombre de la persona 2: " + persona2.getNombre());
        System.out.println("Fecha de nacimiento de la persona 2: " + persona2.getFechaNacimiento());
        persona2.mostrarDatos();
        System.out.println(); 

        sc.close();
    }

}
