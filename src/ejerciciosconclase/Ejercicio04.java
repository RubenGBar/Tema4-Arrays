package ejerciciosconclase;

import java.util.Arrays;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Array para guardar los valores aleatorios
		int tabla[] = new int[30];
		
		// Bucle for para rellenar el Array 
		for(int i = 0; i < tabla.length; i++) {
			// Le asigno a cada posición de la tabla un valor aleatorio entre 0 y 9
			tabla[i] = (int) (Math.random()*10);
		}
		
		// Ordeno el Array
		Arrays.sort(tabla);
		// Muestro el Array
		System.out.println(Arrays.toString(tabla));
	}

}
