package ejerciciosfunciones;

import java.util.Arrays;
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
		int tabla[];
		// Pido que introduzca el l�mite m�ximo para generar los n�meros aleatorios
		System.out.println("Cu�l quieres que sea el valor m�ximo de los n�meros aleatorios que van a rellenar la tabla?");
		// Leo el valor de fin del teclado y lo guardo
		fin = sc.nextInt();
		// Llamo a la funci�n rellenaPares y lo guardo en la variable tabla
		tabla = rellenaPares(longitud, fin);
		//Muestro por pantalla la tabla
		System.out.println("La tabla genereada es la siguiente: ");
		System.out.println(Arrays.toString(tabla));
		
		// Cierro el Scanner
		sc.close();
	}
	
	// Clase para rellenar un Array con n�meros aleatorios pares
	public static int[] rellenaPares(int longitud, int fin) {
		// Array que devuelvo como valor de la funci�n
		int[] tablaDevuelta = new int[longitud];
		// Variable para guardar el n�mero par aleatorio
		int numeroRand = 0;
		// Contador del bucle while
		int i = 0;
		// Creo un objeto de la clase Random para poder generar n�meros pseudoaleatorios
		Random rand = new Random();
		
		// Bucle while para rellenar la tabla con valores pares aleatorios
		while(i < longitud) {
			// Genero el n�mero aleatorio
			numeroRand = rand.nextInt(2, fin + 1);
			/* Si ese n�mero es divisble entre 2, es decir, es par lo asigno a la posici�n de la 
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
