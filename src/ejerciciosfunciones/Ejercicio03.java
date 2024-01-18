package ejerciciosfunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Variable que será el máximo de los números aleatorios a generar
		int fin = 0;
		// Variable que guardará el tamaño del Array
		int longitud = 0;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pido que introduzca un tamaño del Array
		System.out.println("¿Cuál será el tamño del Array?");
		// Leo el valor de tamaño del teclado y lo guardo
		longitud = sc.nextInt();
		// Creo el array a rellenar de números aleatorios pares
		int tabla[] = new int[longitud];
		// Pido que introduzca el límite máximo para generar los números aleatorios
		System.out.println("Cuál quieres que sea el valor máximo de los números aleatorios que van a rellenar la tabla?");
		
		// Cierro el Scanner
		sc.close();
	}
	
	// Clase para rellenar un Array con números aleatorios pares
	public static int[] rellenaPares(int longitud, int fin) {
		// Array que devuelvo como valor de la clase
		int[] tablaDevuelta = new int[longitud];
		// Variable para guardar el número par aleatorio
		int numeroRand = 0;
		// Creo un objeto de la clase Random para poder generar números pseudoaleatorios
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
