package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el número que se escribe por teclado
		int numero;
		// Creo el array con longitud 10
		int tabla[] = new int[8];
		//Variable para saber cuál es el mes
		String mes = "";
		
		// Bucle for en el que solicito un número y lo guardo en cada posición del array
		for (int i = 0; i < tabla.length; i++) {
			
			//Switch case para asignar a la variable mes el nombre mes correspondiente según el valor de i
			switch (i) {
			case 1 -> mes = "Enero";
			case 2 -> mes = "Febrero";
			case 3 -> mes = "Marzo";
			case 4 -> mes = "Abril";
			case 5 -> mes = "Mayo";
			case 6 -> mes = "Junio";
			case 7 -> mes = "Julio";
			case 8 -> mes = "Agosto";
			case 9 -> mes = "Septiembre";
			case 10 -> mes = "Octubre";
			case 11 -> mes = "Noviembre";
			case 12 -> mes = "Diciembre";
			}
			
			// Pido que introduzca un número
			System.out.println("Introduzca la temperatura del mes de " + mes + " : ");
			// Le el valor de numero del teclado
			numero = sc.nextInt();
			// Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		for(int i = 0; i < tabla.length; i++) {
			
			//Switch case para asignar a la variable mes el nombre mes correspondiente según el valor de i
			switch (i) {
			case 1 -> mes = "Enero";
			case 2 -> mes = "Febrero";
			case 3 -> mes = "Marzo";
			case 4 -> mes = "Abril";
			case 5 -> mes = "Mayo";
			case 6 -> mes = "Junio";
			case 7 -> mes = "Julio";
			case 8 -> mes = "Agosto";
			case 9 -> mes = "Septiembre";
			case 10 -> mes = "Octubre";
			case 11 -> mes = "Noviembre";
			case 12 -> mes = "Diciembre";
			}
			
			System.out.print("La temperatura de " + mes + " + aproximadamente es: ");
			for(int j = 0; j <= 100; j++) {
				
				if (j == 0) {
					System.out.print("0");
				}else if (j % 10 == 0) {
					
				}
				
			}
			
			System.out.println("");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
