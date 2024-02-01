package ejerciciosarraysbidimensionales;

import java.util.Random;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Array para guardar el valor devuelto por la funci�n
		int sumas[][] = new int[4][5];
		
		// Llamo a la funci�n sumas y guardo el valor devuelto en sumas
		sumas = rellenar(sumas);
		
		// Bucles para mostrar el Array como una tabla, el primero es para controlar las filas
		
		/*
		 * MOSTRAR COLUMNAS Y FILAS SUMADAS M�S TOTAL
		 * */
		
	}
	
	public static int[][] rellenar(int[][] sumas) {
		// Array que devuelvo como valor de la funci�n
		int tablaRellena[][] = new int[sumas.length][sumas[0].length];
		// Objeto de la clase random para poder generar n�meros pseudoaleatorios
		Random rand = new Random();
		
		// Bucles para rellenar el Array con n�meros pseudoaleatorios, el primero controla las filas
		for(int i = 0; i < tablaRellena.length; i++) {
			// Bucle que controla las columnas
			for(int j = 0; j < tablaRellena[0].length; j++) {
				// Relleno cada elemento del Array con n�meros pseudoaleatorios entre 100 y 999
				tablaRellena[i][j] = rand.nextInt(100, 1000);
			}
		}
		
		// Devuelvo tablaRellena como valor de la funci�n
		return tablaRellena;
	}
	
}
