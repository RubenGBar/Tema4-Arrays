package ejerciciosarraysbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
	public static void main(String[] args) {
		// Creo un objeto de la clase Random para rellenar la tabla
		Random rand = new Random();
		// Array bidimensionalr a rellenar
		int tablaBuscar[][] = new int[6][10];
		// Array para guardar los valores mínimos y máximos enocntrados
		int encontrados[] = new int[2];
		
		// Bucles para rellenar toda la tabla con valores, el primer bucle controla las filas
		for(int i = 0; i < tablaBuscar.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablaBuscar[0].length; j++) {
				// Relleno cada elemento de la tabla con valores aleatorios
				tablaBuscar[i][j] = rand.nextInt(0,1001);
			}
		}
		
		// Llamo a la función y guardo el valor devuelto en la tabla encontrados
		encontrados = buscador(tablaBuscar);
		
		// Bucles para mostrar la tabla bidimensional, el primero controla las filas
		for(int i = 0; i < tablaBuscar.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablaBuscar[0].length; j++) {
				// Muestro cada elemento por pantalla
				System.out.print(tablaBuscar[i][j] + "\t");
			}
			// Salto de línea para cuando termino de mostrar cada fila
			System.out.println();
		}
		// Muestro la tabla con los valores mínimos y máximos
		System.out.println("\nLa posición 0 corresponde al valor mínimo y la posición 1 al máximo\n" 
							+ Arrays.toString(encontrados));
		
	}

	/* Función que recibe una tabla bidimensional y devuelve una tabla unidimensional
	 * en la que se guardan los valores mínimos y máximos de la tabla bidimensional*/
	public static int[] buscador(int[][] tablaBuscar) {
		// Tabla para devolver como valor de la clase
		int minYMax[] = new int[2];
		// Variable para guardar el valor mínimo de toda la tabla
		int minTotal = Integer.MAX_VALUE;
		// Variable para guardar el valor máximo de toda la tabla
		int maxTotal = Integer.MIN_VALUE;

		/*
		 * Bucles para saber cuales son los valores mínimos y máximos de la tabla. 
		 * El primer bucle controla las filas
		 */
		for (int i = 0; i < tablaBuscar.length; i++) {
			// Bucle para controlar las columnas
			for (int j = 0; j < tablaBuscar[0].length; j++) {
				// Si el valor es menor al anterior lo guardo en minTotal
				if (tablaBuscar[i][j] < minTotal) {
					minTotal = tablaBuscar[i][j];
				// Si el valor es mayor al anterior lo guardo en maxTotal
				}else if (tablaBuscar[i][j] > maxTotal) {
					maxTotal = tablaBuscar[i][j];
				}
			}
		}
		
		// Le asigno a la posición 0 de minYMax el valor miníno encontrado
		minYMax[0] = minTotal;
		// Le asigno a la posición 1 de minYMax el valor máximo encontrado
		minYMax[1] = maxTotal;
		
		// Devuevlo minYMax como valor de la clase
		return minYMax;
	}
	
}
