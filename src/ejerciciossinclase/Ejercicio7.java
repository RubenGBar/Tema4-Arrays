package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el número que se escribe por teclado
		int numero;
		// Creo el array con longitud 12
		int tabla[] = new int[12];
		//Variable para saber cuál es el mes
		String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		
		// Bucle for en el que solicito un número y lo guardo en cada posición del array
		for (int i = 0; i < tabla.length; i++) {
			
			
			// Pido que introduzca un número
			System.out.println("Introduzca la temperatura del mes de " + mes + " : ");
			// Le el valor de numero del teclado
			numero = sc.nextInt();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		for(int i = 0; i < tabla.length; i++) {
			
			System.out.print("La temperatura de " + mes + " + aproximadamente es: ");
			for(int j = 0; j <= 100; j++) {
				
				
				
			}
			
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
