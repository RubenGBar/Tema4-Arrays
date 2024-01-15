package ejerciciosconclase;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Creo el Array con la puntuación de los jugadores
		int elo[] = new int[8];
		
		// Bucle for para introducir la puntuación de los jugadores
		for(int i = 0; i < elo.length; i++) {
			// Pido que introduzca la puntuación de cada jugador
			System.out.println("¿Cuál es la puntuación del jugador " + i + " ? ");
			// Guardo el valor introducido en en cada posición del Array
			elo[i] = sc.nextInt();
		}
		
		// Ordeno el Array
		Arrays.sort(elo);
		
		// Bucle para mostrar la tabla de forma descendente
		for(int i = 8; elo.length > i; i--) {
			
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
