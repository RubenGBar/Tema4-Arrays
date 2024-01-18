package ejerciciosfunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Variable que ser� el m�ximo de los n�meros aleatorios a generar
		int fin = 0;
		// Variable que guardar� el tama�o del Array
		int longitud = 0;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pido que introduzca un tama�o del Array
		System.out.println("�Cu�l ser� el tam�o del Array?");
		// Leo el valor de tama�o del teclado y lo guardo
		longitud = sc.nextInt();
		// Creo el array a rellenar de n�meros aleatorios pares
		int tabla[] = new int[longitud];
		// Pido que introduzca el l�mite m�ximo para generar los n�meros aleatorios
		System.out.println("Cu�l quieres que sea el valor m�ximo de los n�meros aleatorios que van a rellenar la tabla?");
		
		// Cierro el Scanner
		sc.close();
	}
	
	// Clase para rellenar un Array con n�meros aleatorios pares
	public static int[] rellenaPares(int longitud, int fin) {
		// Array que devuelvo como valor de la clase
		int[] tablaDevuelta = new int[longitud];
		// Variable para guardar el n�mero par aleatorio
		int numeroRand = 0;
		// Creo un objeto de la clase Random para poder generar n�meros pseudoaleatorios
		Random rand = new Random();
		
		
		for(int i = 0; i < longitud; i++) {
			numeroRand = rand.nextInt(2, fin + 1);
			if (numeroRand % 2 == 0) {
				tablaDevuelta[i] = numeroRand;
			}
		}
		
		// Devuelvo tabalaDevuelta como valor de la clase
		return tablaDevuelta;
	}

}
