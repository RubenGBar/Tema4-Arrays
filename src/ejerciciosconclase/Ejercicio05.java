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
		for(int i = elo.length - 1; i >= 0; i--) {
			// Estructura de condicionales para imprimir el Array bonito (como la clase Arrays to String)
			if ( i == 7) {
				// En la primera iteración me imprime una llave con el número de esa posición más una coma
				System.out.print("[ " + elo[i] + ", ");
			}else if ( i == 0) {
				// En la última iteración me imprime el número de esa posición más una llave
				System.out.print(elo[i] + " ]");
			}else {
				// En las demás iteraciones me imprime un espacio el número y una coma con un espacio
				System.out.print(" " + elo[i] + ", ");
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
