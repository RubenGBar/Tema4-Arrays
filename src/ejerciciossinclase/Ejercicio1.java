package ejerciciossinclase;

import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Variable que guarda el valor de cadad n�mero aleatorio a generar*/
		int aleatorio;
		/*Creo el array*/
		int tabla[] = new int [10];
		/*Creo el objeto random*/
		Random rand = new Random();
		//Variable que usar� como contador
		int cont = 0;
		
		/*Bucle for para crear n�meros aleatorios y asignarlos a cada posici�n de la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			//Genero el n�mero aleatorio
			aleatorio = rand.nextInt(1,101);
			//Asigno el valor de ese n�mero aleatorio a cada celda de la tabla
			tabla[i] = aleatorio;
		}
		
		for(int numeros: tabla) {
			//Muestro el valor
			System.out.println("El valor de la posici�n " + cont + " de la tabla es: " + numeros);
			//Incremento el contador para saber en que posici�n estoy
			cont++;
		}
		
	}

}
