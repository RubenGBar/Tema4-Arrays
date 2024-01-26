package ejerciciosarraysbidimensionales;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Array bidimensional para guardar los alumnos y las tablas
		int notas[][] = new int [4][5];
		
		// Bucle para controlar las filas
		for(int i = 0; i < notas.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < notas[0].length; j++) {
				// Pido que introduzca la nota cada asignatura de cada alumno 
				System.out.println("Introduzca la nota " + j + " del Alumno " + i);
				// Leo el valor de cada posición del teclado
				notas[i][j] = sc.nextInt();
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
