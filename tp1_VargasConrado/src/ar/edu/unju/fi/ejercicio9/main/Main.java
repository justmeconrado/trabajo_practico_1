package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int contador = 1;
		// Mientras el contador sea menor o igual a 3 se pedira los datos del producto.
		while (contador <= 3) {
			System.out.println("Ingrese el nombre del producto " + contador + " : ");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese el codigo del producto " + contador + " : ");
			Long codigo = scanner.nextLong();
			System.out.println("Ingrese el precio del producto " + contador + " : ");
			double precio = scanner.nextDouble();
			System.out.println("Ingrese el descuento del producto " + contador + " : ");
			int descuento = scanner.nextInt();

			scanner.nextLine();
			// Se crea un objeto de la clase Producto.
			Producto producto = new Producto();

			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			// Se llama al metodo CalcularDescuento.
			producto.CalcularDescuento();
			// Se muestran los datos del producto.
			System.out.println("Producto" + contador + ": ");
			System.out.println("Nombre del producto: " + nombre);
			System.out.println("Codigo del producto: " + codigo);
			System.out.println("Precio del producto: " + precio);
			System.out.println("Descuento del producto: " + descuento + "%");
			System.out.println("Precio del producto con el descuento ya realizado: " + producto.CalcularDescuento());

			contador++;
		}
		scanner.close();
	}

}