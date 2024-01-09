package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el número que se escribe por teclado
		double numero;
		// Creo el array con longitud 10
		double tabla[] = new double[10];
		// Variable para el contador del segundo bucle
		int cont = tabla.length;
		// Bucle for en el que solicito un número y lo guardo en cada posición del array
		for (int i = 0; i < tabla.length; i++) {
			// Pido que introduzca un número
			System.out.println("Introduzca un número con decimales: ");
			// Le el valor de numero del teclado
			numero = sc.nextDouble();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}

		for(double i = tabla.length; i < 0; i--) {
			
		}
		
		sc.close();
	}
}
