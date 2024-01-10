package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el n�mero que se escribe por teclado
		double numero;
		// Creo el array con longitud 10
		double tabla[] = new double[10];
		// Variable para el contador del segundo bucle
		double cont = tabla.length;
		
		// Bucle for en el que solicito un n�mero y lo guardo en cada posici�n del array
		for (int i = 0; i < tabla.length; i++) {
			// Pido que introduzca un n�mero
			System.out.println("Introduzca un n�mero con decimales: ");
			// Le el valor de numero del teclado
			numero = sc.nextDouble();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}

		//Bucle for para mostrar la el valor de la posici�n de cada casilla de la tabla en orden inverso
		for(int i = tabla.length - 1; i >= 0 ; i--) {
			//Muestro el valor
			System.out.println("El valor de la posici�n " + i + " de la tabla es: " + tabla[i]);
		}
		
		//Cierro el Scanner
		sc.close();
	}
}
