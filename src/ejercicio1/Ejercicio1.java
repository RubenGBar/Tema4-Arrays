package ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Variable que guarda el valor de cadad número aleatorio a generar*/
		int aleatorio;
		/*Creo el array*/
		int tabla[] = new int [10];
		/*Creo el objeto random*/
		Random rand = new Random();
		
		/*Bucle for para crear números aleatorios y asignarlos a cada posición de la tabla*/
		for(int i = 0; i < tabla.length; i++) {
			//Genero el número aleatorio
			aleatorio = rand.nextInt(1,101);
			//Asigno el valor de ese número aleatorio a cada celda de la tabla
			tabla[i] = aleatorio;
		}
		
		//Para comprobar si lo he hecho bien
		System.out.println(Arrays.toString(tabla));	
	}

}
