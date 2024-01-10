package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el n�mero que se escribe por teclado
		int numero;
		// Creo el array con longitud 10
		int tabla[] = new int[8];
		
		// Bucle for en el que solicito un n�mero y lo guardo en cada posici�n del array
		for (int i = 0; i < tabla.length; i++) {
			// Pido que introduzca un n�mero
			System.out.println("Introduzca un n�mero: ");
			// Le el valor de numero del teclado
			numero = sc.nextInt();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		//Bucle para ostrar cada valor del array e indicar si es par o impar
		for(int i = 0; i < tabla.length; i++) {
			
			//Si el resto del n�mero al dividirlo entre dos es 0 muestro que el n�mero es par
			if(tabla[i] % 2 == 0) {
				System.out.println(tabla[i] + " es par");
			}else {
			//En cualquier otro caso muestro que es impar
				System.out.println(tabla[i] + " es impar");
			}
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
