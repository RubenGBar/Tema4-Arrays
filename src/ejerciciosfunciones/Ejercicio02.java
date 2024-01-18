package ejerciciosfunciones;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Array en el que quiero saber cu�l es el mayor valor
		int tabla[] = new int[5];
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el resultado que devuelve la funci�n al llamarla a la funci�n
		int resultado = 0;
		
		// Bucle for para introducir los valores del Array
		for(int i = 0; i < tabla.length; i++) {
			// Pido que introduzca el valor de cada elemnto del Array
			System.out.println("Introduzca un n�mero: ");
			// Guardo lo introducido por el teclado como el valor de cada posici�n del Array
			tabla[i] = sc.nextInt();
		}
		
		// Llamo a la funci�n maxArrays para saber cual es el mayor de los valores del Array
		resultado = maxArrays(tabla);
		
		// Muestro por pantalla el resultado de la operaci�n
		System.out.println("El mayor valor del Array es: " + resultado);
		
	}
	
	// Funci�n que devolver� el m�ximo de un Array los Arrays
	public static int maxArrays(int[] tabla) {
		// Variable que se devolver� como valor de la funic�n
		int res = Integer.MIN_VALUE;
		
		// Bucle for para comparar los valores del Array con el de la varibale res
		for(int i = 0; i < tabla.length; i++) {
			// Si el valor de esa posic�n del Array es mayor al de la variable
			if(tabla[i] > res) {
				// Guardo ese valor en la variable res
				res = tabla[i];
			}
		}
		
		// Devuelvo res como valor de la funci�n
		return res;
	}
}
