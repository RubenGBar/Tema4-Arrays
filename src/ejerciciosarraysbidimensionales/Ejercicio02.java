package ejerciciosarraysbidimensionales;

import java.util.Scanner;

public class Ejercicio02 {
	// Constante para saber cuantos alumnos hay y poder modificarlo
	public static final int NUMALUMNOS = 4;
	// Constante para saber cuantas asignaturas hay y poder modificarlo
	public static final int NUMASIGNATURAS = 5;

	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Array bidimensional para guardar los alumnos y las tablas
		int notas[][] = new int [NUMALUMNOS][NUMASIGNATURAS];
		// Variable para guardar la nota más alta
		int max = Integer.MIN_VALUE;
		// Variable para guardar la nota más baja
		int min = Integer.MAX_VALUE;
		// Variable donde sumo todas las notas de cada alumno para poder calcular la nota media
		int sumaNotas = 0;
		// Variable para guardar la nota media de cada alumno
		int notaMedia = 0;
		
		// Bucles para rellenar el Array Bidimensional
		// Bucle para controlar las filas
		for(int i = 0; i < NUMALUMNOS; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < NUMASIGNATURAS; j++) {
				// Pido que introduzca la nota cada asignatura de cada alumno 
				System.out.println("Introduzca la nota " + (j+1) + " del Alumno " + (i+1));
				// Leo el valor de cada posición del teclado
				notas[i][j] = sc.nextInt();
			}
		}
		
		// Bucles para mostrar todas las notas
		// Bucle para controlar las filas
		for(int i = 0; i < NUMALUMNOS; i++) {
			// Muestro un mensaje para identificar cada fila la cual sería cada alumno
			System.out.print("Alumno " + (i+1) + ": " + "\t");
			// Bucle para controlar las columnas
			for(int j = 0; j < NUMASIGNATURAS; j++) {
				// Bucle para mostrar las notas como una tabla
				System.out.print(notas[i][j] + "\t");
			}
			// Salto de línea para cuando se empieze a mostrar el siguiente alumno
			System.out.println();
		}
		
		// Salto de línea para separar la tabla de las notas mínimas, máximas y media
		System.out.println("\n");
		// Bucles para calcular las notas máximas, mínimas y media
		// Bucle con el que controlo las filas
		for(int i = 0; i < NUMALUMNOS; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < NUMASIGNATURAS; j++) {
				// Si el valor que se está comprobando es menor que el anterior lo guardo
				if (notas[i][j] < min) {
					min = notas[i][j];
				// Si el valor que se está comprobando es mayor que el anterior lo guardo
				}else if(notas[i][j] > max) {
					max = notas[i][j];
				}
				// Sumo todas las notas del Alumno
				sumaNotas += notas[i][j];
				// Divido esa nota entre el número de Asignaturas para calcular nota media
				notaMedia = sumaNotas / NUMASIGNATURAS;
			}
			// Muestro por pantalla la nota mínima, máxima y media de cada alumno y lo separo con 2 saltos de línea
			System.out.println("La nota máxima del Alumno " + (i+1) + " es: " + max);
			System.out.println("La nota mínima del Alumno " + (i+1) + " es: " + min);
			System.out.println("La nota media del Alumno " + (i+1) + "  es: " + notaMedia);
			System.out.println("\n");
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
