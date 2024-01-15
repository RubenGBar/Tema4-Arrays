package ejerciciosconclase;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Primer Array para guardar los 10 primeros valores
		int tabla1[] = new int[10];
		// Segundo Array para guardar los 10 últimos valores
		int tabla2[] = new int[10];
		
		// Bucle for para que introduzca los 20 valores
		for (int i = 0; i < tabla1.length; i++) {
			// Pido que introduzca un valor 
			System.out.println("Introduzca un número: ");
			// Guardo el valor introducido en la posición correspondiente de la tabla
			tabla1[i] = sc.nextInt();
		}
		
		// Bucle for para que introduzca los 20 valores
		for (int i = 0; i < tabla1.length; i++) {
			// Pido que introduzca un valor
			System.out.println("Introduzca un número: ");
			// Guardo el valor introducido en la posición correspondiente de la tabla
			tabla2[i] = sc.nextInt();
		}
		
		// Muestro por pantalla si son iguales o no
		System.out.println("¿Son iguales las Tablas? \n" + Arrays.equals(tabla1, tabla2));
		
		// Cierro el Scanner
		sc.close();
	}

}
