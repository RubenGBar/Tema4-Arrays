package ejerciciossinclase;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Variable para el contador del segundo bucle
		int cont = 0;
		//Variable para guardar el n�mero que se escribe por teclado
		double numero;
		//Creo el array con longitud 5
		double tabla[] = new double [5];
		
		//Bucle for en el que solicito un n�mero y lo guardo en cada posici�n del array
		for(int i = 0; i < tabla.length; i++) {
			//Pido que introduzca un n�mero
			System.out.println("Introduzca un n�mero con decimales: ");
			//Le el valor de numero del teclado
			numero = sc.nextDouble();
			//Asigno el valor introducido por el teclado en cada casilla del array
			tabla[i] = numero;
		}
		
		//Bucle para mostar el valor de cada casilla de la tabla
		for(double numeros: tabla) {
			//Muestro el valor
			System.out.println("El valor de la posici�n " + cont + " de la tabla es: " + numeros);
			//Incremento el contador para saber en que posici�n estoy
			cont++;
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
