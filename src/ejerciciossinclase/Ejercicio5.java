package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el número que se escribe por teclado
		int numero;
		// Creo el array con longitud 10
		int tabla[] = new int[10];
		//Variable en la que sumo el valor de cada posición de la tabla
		int sumaTabla = 0;
		//Variable que uso para guardar el valor más pequeño del Array
		int min = Integer.MAX_VALUE;
		//Variable que uso para guardar el valor más grande del Array
		int max = Integer.MIN_VALUE;

		// Bucle for en el que solicito un número y lo guardo en cada posición del array
		for (int i = 0; i < tabla.length; i++) {
			// Pido que introduzca un número
			System.out.println("Introduzca un número: ");
			// Le el valor de numero del teclado
			numero = sc.nextInt();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		//Bucle para sumar todos los valores del Array y saber cuál es el más grande y el más chico
		for (int i = 0; i < tabla.length; i++) {
			//Variqable a la que le voy sumando todos los valores del Array
			sumaTabla += tabla[i];
			
			if (tabla[i] < min) {
				//Si el valor del array es más pequeño que el anterior lo guardo en la variable min
				min = tabla[i];
			}else if (tabla[i] > max) {
				//Si el valor del array es más grande que el anterior lo guardo en la variable max
				max = tabla[i];
			}
			
		}
		
		//Muestro por pantalla la sumna de todos los valores del array y cual es más grande y más chico
		System.out.println("La suma de todos los valores del Array es: " + sumaTabla +
							"\nEl valor más grande del Array es: " + max + 
							"\nEl valor más pequeño del Array es: " + min);
		
		//Cierro el Scanner
		sc.close();
	}

}
