package ejerciciosfunciones;

import java.util.Arrays;
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
		int tabla[];
		// Pido que introduzca el límite máximo para generar los números aleatorios
		System.out.println("Cuál quieres que sea el valor máximo de los números aleatorios que van a rellenar la tabla?");
		// Leo el valor de fin del teclado y lo guardo
		fin = sc.nextInt();
		// Llamo a la función rellenaPares y lo guardo en la variable tabla
		tabla = rellenaPares(longitud, fin);
		//Muestro por pantalla la tabla
		System.out.println("La tabla genereada es la siguiente: ");
		System.out.println(Arrays.toString(tabla));
		
		// Cierro el Scanner
		sc.close();
	}
	
	// Clase para rellenar un Array con números aleatorios pares
	public static int[] rellenaPares(int longitud, int fin) {
		// Array que devuelvo como valor de la función
		int[] tablaDevuelta = new int[longitud];
		// Variable para guardar el número par aleatorio
		int numeroRand = 0;
		// Contador del bucle while
		int i = 0;
		// Creo un objeto de la clase Random para poder generar números pseudoaleatorios
		Random rand = new Random();
		
		// Bucle while para rellenar la tabla con valores pares aleatorios
		while(i < longitud) {
			// Genero el número aleatorio
			numeroRand = rand.nextInt(2, fin + 1);
			/* Si ese número es divisble entre 2, es decir, es par lo asigno a la posición de la 
			 * tabla y aumento el contador */
			if (numeroRand % 2 == 0) {
				tablaDevuelta[i] = numeroRand;
				i++;
			}
		}
		
		// Ordeno la tabla
		Arrays.sort(tablaDevuelta);
		// Devuelvo tabalaDevuelta como valor de la clase
		return tablaDevuelta;
	}

}
