package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;

	// Constructor sin parámetros.
	public Persona() {
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(int dia, int mes, int anio) {
		fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(anio, mes - 1, dia);
	}

	public String getFechaNacimiento() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
		int anio = fechaNacimiento.get(Calendar.YEAR);
		return String.format("%02d/%02d/%04d", dia, mes, anio);
	}

	// Método que calcula la edad de la persona.
	public int calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int anioActual = fechaActual.get(Calendar.YEAR);
		int mesActual = fechaActual.get(Calendar.MONTH) + 1;
		int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

		int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
		int mesNacimiento = fechaNacimiento.get(Calendar.MONTH) + 1;
		int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

		int edad = anioActual - anioNacimiento;

		// Ajuste para considerar el mes y día actual
		if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
			edad--;
		}

		return edad;
	}

	// Método que retorna el signo zodiacal de la persona.
	public String obtenerSignoZodiacal() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		if ((mes == 0 && dia >= 21) || (mes == 1 && dia <= 19)) {
			return "Acuario";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 20)) {
			return "Piscis";
		} else if ((mes == 2 && dia >= 21) || (mes == 3 && dia <= 20)) {
			return "Aries";
		} else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
			return "Tauro";
		} else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
			return "Géminis";
		} else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 22)) {
			return "Cáncer";
		} else if ((mes == 6 && dia >= 23) || (mes == 7 && dia <= 23)) {
			return "Leo";
		} else if ((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23)) {
			return "Virgo";
		} else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
			return "Libra";
		} else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 22)) {
			return "Escorpio";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Sagitario";
		} else {
			return "Capricornio";
		}
	}

	// Método que retorna la estación del año en la que nació la persona.
	public String obtenerEstacion() {
		int mes = fechaNacimiento.get(Calendar.MONTH);
		if (mes == 0 || mes == 1 || mes == 11) {
			return "Verano";
		} else if (mes == 2 || mes == 3 || mes == 4) {
			return "Otoño";
		} else if (mes == 5 || mes == 6 || mes == 7) {
			return "Invierno";
		} else {
			return "Primavera";
		}
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}