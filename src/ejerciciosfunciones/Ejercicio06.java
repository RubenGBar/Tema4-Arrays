package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		// Guardo el Array introducido por el usuario
		int tabla[] = new int[10];
		// Guardo el Array devuleto por la función Suma
		int tablaSumada[];
		// Guardo el número de elementos a sumar en cada grupo
		int numElementos = 0;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Bucle para rellenar el Array
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			tabla[i] = sc.nextInt();
		}
		
		// Pido que introduzca para la longitud de los grupos a sumar
		System.out.println("¿De que longitud quieres que sean los grupos a sumar de la tabla?");
		// Leo el valor de numElementos del teclado
		numElementos = sc.nextInt();
		
		// Llamo a la función suma y guardo el valor en tablaSumada
		tablaSumada = suma(tabla, numElementos);
		// Muestro el resultado y la nueva tabla con los elementos sumados
		System.out.println("La tabla que se genera sumando los elementos en grupos de " + numElementos + 
				" es la siguiente: ");
		System.out.println(Arrays.toString(tablaSumada));
		
		//Cierro el Scanner
		sc.close();
	}

	// Función para sumar los elementos en grupos 
	public static int[] suma(int[] tabla, int numElementos) {
		// Array para devolver como valor de la función
		int elementosSumados[] = new int[tabla.length - numElementos + 1];
		
		// Recorro el Array teniendo en cuenta la longitud de la nueva tabla
		for(int i = 0; i < elementosSumados.length; i++) {
			// Bucle para sumar los número según la longitud del grupo introducida por teclado
			for(int j = i; j < numElementos + i; j++) {
				// Sumo los elementos en grupo según lo introducido por teclado
				elementosSumados[i] += tabla[j];
			}
		}
		
		// Devuelvo elementosSumados como valor de la clase
		return elementosSumados;
	}
}
