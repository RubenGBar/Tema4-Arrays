package ejerciciosarraysbidimensionales;

import java.util.Random;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Array para guardar el valor devuelto por la función
		int sumas[][] = rellenar();
		// Variable para guardar la suma de las columnas
		int columnasSumadas = 0;
		// Variable para guardar la suma de las filas
		int filasSumadas = 0;
		// Variable para guardar la suma total
		int totalSumado = 0;
		
		// Bucles para sumar las filas, con el primer bucle controlo las filas
		for(int i = 0; i < sumas.length; i++) {
			// Inicio la variable de la suma de las filas para guardar el valor anterior
			filasSumadas = 0;
			// Bucle para controlar las columnas
			for(int j = 0; j < sumas[0].length; j++) {
				// Muestro cada elemento de la tabla
				System.out.print(sumas[i][j] + "\t");
				// Voy sumando cada elemento de la fila
				filasSumadas += sumas[i][j];
			}
			// Muestro la suma de cada fila
			System.out.println(filasSumadas);
		}
		
		// Bucles para sumar las columnas y el total, con el primer bucle controlo las columnas
		for(int j =  0; j < sumas[0].length; j++) {
			// Inicio la variable de la suma de las columnas para guardar el valor anterior
			columnasSumadas = 0;
			// Bucle para controlar las filas
			for(int i = 0; i < sumas.length; i++) {
				// Sumo todos los elementos de una columna
				columnasSumadas += sumas[i][j];
			}
			// Guardo el valor de la suma de cada columna para el total
			totalSumado += columnasSumadas;
			// Muestro cada columna sumada
			System.out.print(columnasSumadas + "\t");
		}
		// Muestro el total de las columnas sumadas
		System.out.println(totalSumado);
	}
	
	// Clase que deuvuelve una tabla rellena con valores aleatorios
	public static int[][] rellenar() {
		// Array que devuelvo como valor de la función
		int tablaRellena[][] = new int[4][5];
		// Objeto de la clase random para poder generar números pseudoaleatorios
		Random rand = new Random();
		
		// Bucles para rellenar el Array con números pseudoaleatorios, el primero controla las filas
		for(int i = 0; i < tablaRellena.length; i++) {
			// Bucle que controla las columnas
			for(int j = 0; j < tablaRellena[0].length; j++) {
				// Relleno cada elemento del Array con números pseudoaleatorios entre 100 y 999
				tablaRellena[i][j] = rand.nextInt(100, 1000);
			}
		}
		// Devuelvo tablaRellena como valor de la función
		return tablaRellena;
	}
}
