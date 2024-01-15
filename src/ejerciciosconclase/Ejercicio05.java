package ejerciciosconclase;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Creo el Array con la puntuaci�n de los jugadores
		int elo[] = new int[8];
		
		// Bucle for para introducir la puntuaci�n de los jugadores
		for(int i = 0; i < elo.length; i++) {
			// Pido que introduzca la puntuaci�n de cada jugador
			System.out.println("�Cu�l es la puntuaci�n del jugador " + i + " ? ");
			// Guardo el valor introducido en en cada posici�n del Array
			elo[i] = sc.nextInt();
		}
		
		// Ordeno el Array
		Arrays.sort(elo);
		
		// Bucle para mostrar la tabla de forma descendente
		for(int i = elo.length - 1; i >= 0; i--) {
			// Estructura de condicionales para imprimir el Array bonito (como la clase Arrays)
			if ( i == 7) {
				System.out.print("[ " + elo[i] + ", ");
			}else if ( i < 7 || i > 2) {
				System.out.print(" " + elo[i] + ", ");
			}else {
				System.out.print(elo[i] + " ]");
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
