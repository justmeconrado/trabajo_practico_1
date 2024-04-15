package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);

        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("La productoria es: " + calculadora.calcularProductoria());
        scanner.close();
    }
}
