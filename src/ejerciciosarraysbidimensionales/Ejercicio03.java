package ejerciciosarraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Guardo el ancho de la tabla para poder construirla según lo introducido por teclado
		int ancho = 0;
		// Guardo el largo de la tabla para poder construirla según lo introducido por teclado
		int largo = 0;
		
		// Pido que introduzca un valor para el ancho de la tabla
		System.out.println("Introduzca un ancho para la tabla");
		// Leo el valor de ancho dle teclado
		ancho = sc.nextInt();
		// Pido que introduzca un valor para el largo de la tabla
		System.out.println("Introduzca un largo para la tabla");
		// Leo el valor de largo dle teclado
		largo = sc.nextInt();
		// Array bidimensional que recibirá la función mostrarTabla
		int tabla[][] = new int [ancho][largo];
		
		//Llamo a la función para rellenarla y después poder mostrarla
		mostrarTabla(tabla);
		
		//Muestro el tabla TO DO
		
		//Cierro el Scanner
		sc.close();
	}

	// COMENTAR TO DO
	public static void mostrarTabla(int[][] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = 10 * (i+j);
			}
		}
	}
}
