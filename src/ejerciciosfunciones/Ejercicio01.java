package ejerciciosfunciones;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Guardo los valores a sumar del Array
		int tabla[] = new int[5];
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el resultado de llamar a la funci�n
		int resultado = 0;
		
		// Bucle for para introducir los valores del Array
		for(int i = 0; i < tabla.length; i++) {
			// Pido que introduzca el valor de cada elemnto del Array
			System.out.println("Introduzca un n�mero: ");
			// Guardo lo introducido por el teclado como el valor de cada posici�n del Array
			tabla[i] = sc.nextInt();
		}
		
		// Llamo a la funci�n sumaArrays para sumar los valores del Array
		resultado = sumaArrays(tabla);
		
		// Muestro por pantalla el resultado de la operaci�n
		System.out.println("El resultado de la suma es: " + resultado);
		
	}

	// Funci�n que sumar� los Arrays
	public static int sumaArrays(int[] tabla) {
		// Variable que se devolver� como valor de la funic�n
		int res = 0;
		
		// Bucle for para sumar los valores del Array
		for(int i = 0; i < tabla.length; i++) {
			// En cada iteraci�n sumo y asigno a la variable res cada elemento del Array
			res += tabla[i];
		}
		
		// Devuelvo res como valor de la funci�n
		return res;
	}
}
