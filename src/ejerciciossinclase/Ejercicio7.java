package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el número que se escribe por teclado
		int numero = 0;
		// Creo el array con longitud 12
		int tabla[] = new int[12];
		//Variable para saber cuál es el mes
		final String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		
		// Bucle for en el que solicito un número y lo guardo en cada posición del array
		for (int i = 0; i < tabla.length; i++) {
			
			// Pido que introduzca un número
			System.out.println("Introduzca la temperatura del mes de " + MES[i] + " : ");
			// Le el valor de numero del teclado
			numero = sc.nextInt();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		//Bucle para pintar el gráfico
		for (int i = 0; i < tabla.length; i++) {
			
			/*Condicional para que si el tamaño del elemento del array MES es mayor o igual a 9 que solo 
			 *lo imprima con 1 tabulador*/
			if (MES[i].length() >= 9) {
				System.out.print(MES[i] + "\t");
			} else {
				System.out.print(MES[i] + "\t\t");
			}
			
			//Bucle for para pintar los asteriscos según la temperatura introducida por el usuario
			for (int j = 1; j <= tabla[i]; j++) {
				
				System.out.print("*");
			}
			
			//Salto de línea
			System.out.println();
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
