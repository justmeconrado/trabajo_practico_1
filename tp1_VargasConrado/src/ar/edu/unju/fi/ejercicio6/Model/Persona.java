package ar.edu.unju.fi.ejercicio6.Model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

	public Persona() {
		super();
		this.dni = "00000000";
		this.nombre = "Sin nombre";
		this.fechaNacimiento = LocalDate.now();
		this.provincia = "Sin provincia";
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear() - fechaNacimiento.getYear();

		if (hoy.getMonthValue() < fechaNacimiento.getMonthValue()
				|| (hoy.getMonthValue() == fechaNacimiento.getMonthValue()
						&& hoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
			edad--;
		}
		return edad;
	}

	public boolean esMayorDeEdad() {
		return calcularEdad() >= 18;
	}

	public void mostrarDatos() {
		int edad = calcularEdad(); 
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("Provincia: " + provincia);
		System.out.println("Edad: " + edad); 
		if (esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}

}