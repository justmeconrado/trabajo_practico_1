package ar.edu.unju.fi.ejercicio11;

public class Main {
	public static void main(String[] args) {
		int j = 40; // Inicialización de j
		int i = 2; // Inicialización de i
		int resultado; // Inicialización de resultado

		// Verificar si el valor de j es negativo
		for (; j >= 0; j--) {

			resultado = j * i;

			System.out.print(" " + resultado);
			i++;
		}
	}
}

// Resultado esperado:80 117 152 185 216 245 272 297 320 341 360 377 392 405 416
// 425 432 437 440 441 440 437 432 425 416 405 392 377 360 341 320 297 272 245
// 216 185 152 117 80 41
