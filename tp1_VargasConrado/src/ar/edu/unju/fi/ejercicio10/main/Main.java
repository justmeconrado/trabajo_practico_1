package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int clasePizza = 1;
		// Se solicita el ingreso de 3 pizzas con sus respectivos datos y se calcula el
		// precio y el área de cada una de ellas.
		while (clasePizza <= 3) {
			System.out.println("Ingrese diámetro de pizza (entre 20, 30 o 40): ");
			int diametroPizza = scanner.nextInt();
			// Se valida que el diámetro de la pizza sea 20, 30 o 40.
			while (diametroPizza != 20 && diametroPizza != 30 && diametroPizza != 40) {
				System.out.println(
						"Error: solo puede ingresar los valores 20 (Pizza chica), 30 (Pizza mediana), y 40 (Pizza grande)");
				System.out.println("Intentelo nuevamente: ");
				diametroPizza = scanner.nextInt();
			}
			System.out.println("¿Desea Ingredientes Especiales? (responda true por sí y false por no):");
			// Se valida que la respuesta sea true o false.
			while (!scanner.hasNextBoolean()) {
				System.out.println("Error: solo puede ingresar true por sí, o false por no. Reinténtelo:");
				scanner.next();
			}
			boolean ingredientesEspecialesPizza = scanner.nextBoolean();
			// Se crea un objeto de la clase Pizza y se le asignan los valores ingresados
			// por el usuario.
			Pizza pizza = new Pizza();
			pizza.setDiametro(diametroPizza);
			pizza.setIngredientesEspeciales(ingredientesEspecialesPizza);
			pizza.calcularArea();
			pizza.calcularPrecio();
			System.out.println("*Pizza*");
			System.out.println("Diámetro: " + diametroPizza);
			System.out.println("Ingredientes Especiales: " + ingredientesEspecialesPizza);
			System.out.println("Precio pizza: " + pizza.calcularPrecio());
			System.out.println("Área de la pizza: " + pizza.calcularArea());
			clasePizza++;
		}
		scanner.close();
	}
}
