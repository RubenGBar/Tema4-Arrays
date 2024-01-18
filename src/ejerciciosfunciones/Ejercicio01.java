package ejerciciosfunciones;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Guardo los valores a sumar del Array
		int tabla[] = new int[5];
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el resultado de llamar a la función
		int resultado = 0;
		
		// Bucle for para introducir los valores del Array
		for(int i = 0; i < tabla.length; i++) {
			// Pido que introduzca el valor de cada elemnto del Array
			System.out.println("Introduzca un número: ");
			// Guardo lo introducido por el teclado como el valor de cada posición del Array
			tabla[i] = sc.nextInt();
		}
		
		// Llamo a la función sumaArrays para sumar los valores del Array
		resultado = sumaArrays(tabla);
		
		// Muestro por pantalla el resultado de la operación
		System.out.println("El resultado de la suma es: " + resultado);
		
	}

	// Función que sumará los Arrays
	public static int sumaArrays(int[] tabla) {
		// Variable que se devolverá como valor de la funicón
		int res = 0;
		
		// Bucle for para sumar los valores del Array
		for(int i = 0; i < tabla.length; i++) {
			// En cada iteración sumo y asigno a la variable res cada elemento del Array
			res += tabla[i];
		}
		
		// Devuelvo res como valor de la función
		return res;
	}
}
