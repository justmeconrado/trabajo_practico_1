package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private Boolean ingredientesEspeciales;
	private static final int INGREDIENTES_ESPECIALES_20 = 500;
	private static final int INGREDIENTES_ESPECIALES_30 = 750;
	private static final int INGREDIENTES_ESPECIALES_40 = 1000;

	// Constructor sin parámetros.
	public Pizza() {
	}

	// Getters y Setters
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public static int getIngredientesEspeciales20() {
		return INGREDIENTES_ESPECIALES_20;
	}

	public static int getIngredientesEspeciales30() {
		return INGREDIENTES_ESPECIALES_30;
	}

	public static int getIngredientesEspeciales40() {
		return INGREDIENTES_ESPECIALES_40;
	}

	// Métodos de la clase Pizza para calcular el área y el precio de la pizza.
	public double calcularArea() {
		double PI = 3.141592;
		return PI * (Math.pow((diametro / 2), 2.00));
	}

	public double calcularPrecio() {
		switch (diametro) {
		case 20:
			if (ingredientesEspeciales == false) {
				precio = 4500;
			} else {
				precio = 4500 + INGREDIENTES_ESPECIALES_20;
			}
			break;
		case 30:
			if (ingredientesEspeciales == false) {
				precio = 4800;
			} else {
				precio = 4800 + INGREDIENTES_ESPECIALES_30;
			}
			break;
		case 40:
			if (ingredientesEspeciales == false) {
				precio = 5500;
			} else {
				precio = 5500 + INGREDIENTES_ESPECIALES_40;
			}
			break;
		}
		return precio;
	}
}
