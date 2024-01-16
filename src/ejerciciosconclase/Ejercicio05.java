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
			// Estructura de condicionales para imprimir el Array bonito (como la clase Arrays to String)
			if ( i == 7) {
				// En la primera iteraci�n me imprime una llave con el n�mero de esa posici�n m�s una coma
				System.out.print("[ " + elo[i] + ", ");
			}else if ( i == 0) {
				// En la �ltima iteraci�n me imprime el n�mero de esa posici�n m�s una llave
				System.out.print(elo[i] + " ]");
			}else {
				// En las dem�s iteraciones me imprime un espacio el n�mero y una coma con un espacio
				System.out.print(" " + elo[i] + ", ");
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
