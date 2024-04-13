package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String nombre;
	private int legajo;
	private double salario;

	private static final double SALARIO_MINIMO = 210000.00;
	private static final double AUMENTO_POR_MERITOS = 20000.00;

	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;

		// Asignación de salario
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}

	// Método para mostrar los datos del empleado por consola.
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: " + salario);
		System.out.println("==================");
	}

	// Método para aumentar el salario
	public void aumentarSalario() {
		salario += AUMENTO_POR_MERITOS;
	}

	public double getSalario() {
		return salario;
	}

}
