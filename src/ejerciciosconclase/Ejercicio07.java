package ejerciciosconclase;

import java.util.Arrays;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Array en el que guardo la apuesta generada aleatoriamente
		int apuesta[] = new int[6];
		// Array con la combinación ganadora de la primitiva
		int ganadora[] = {1, 2, 7, 9, 21, 42};
		// Guardo el número de aciertos
		int aciertos = 0;
		int numero = 0;
		int i = 0;
		int res = 0;
		
		// Bucle for para rellenar la apuesta con valores aleatorios y que no se repiten
		while (i < apuesta.length) {
			// Genero el número aleatorio y lo asigno a una variable
			numero = (int) (Math.random()*49+1);
			/* Compruebo que el nuevo número aleatorio sea distinto de los ya generado y lo asigno a una nueva 
			 * posición de la tabla, además aumento el contador solo en este caso para seguir rellenando el 
			 * array. Esto depende de que el valor devuelto por la clase busqueda sea menor que cero*/
			if (busqueda(apuesta, numero) < 0) {
				apuesta[i] = numero;
				i++;
			}
		}
		
		// Bucle for each para comprobar que los valores de la apuesta y la tabla ganadora son iguales
		for(int valor : apuesta) {
			// Si la tabla ganadora y la apuesta tienen valores iguales aumento el número de aciertos
			if(Arrays.binarySearch(ganadora, valor) >= 0) {
				aciertos++;
			}
		}
		
		// Muestro por pantalla la combinación de números ganadora, la apuesta genereda y el número de aciertos
		System.out.println("La combinación ganadora de la primitiva es");
		System.out.println(Arrays.toString(ganadora));
		System.out.println("Tu apuesta");
		System.out.println(Arrays.toString(apuesta));
		System.out.println("Tiene " + aciertos + " acierto(s)");
		
	}
	
	// Clase para comprobar que los números aleatorios sean distintos a los ya existentes
	public static int busqueda(int tabla[], int valor) {
		// Variable que devuelvo como valor de la función
		int indice = 0;
		
		/* Bucle while que devuelve un número mayor que la longitud de la tabla si el nuevo número aleatorio 
		 * es igual que otro del array */
		while (indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}
		
		/* Si el número devuelto por el bucle anterior es igual que el tamaño de la tabla devuelvo un número 
		 * meor que cero para que en el main se asigne el número aleatorio a la posición del array ya que es
		 * distinto de los otros*/
		if(indice == tabla.length) {
			indice = -1;
		}
		
		// Devuelvo inidice como valor de la clase
		return indice;
	}

}
