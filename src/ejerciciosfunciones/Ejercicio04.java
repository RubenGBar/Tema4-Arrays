package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Creo un objeto de la clase random para rellenar la tabla
		Random rand = new Random();
		// Valor a buscar en el Array
		int numBuscar;
		// Guardo el Array en el que voy a buscar 
		int tabla[] = new int[100];
		// Variable para guardar el valor que me deveulve la función al llamarla
		int encontrado = 0;
		// Varibale que usaré de contador en el bucle para rellenar la tabla
		int i = 0;
		
		// Relleno la tabla con números aleatorios
		while(i < tabla.length) {
			tabla[i] = rand.nextInt(0 , 100);
			i++;
		}
		
		// Pido que introduzca un número a buscar
		System.out.println("¿Qué número quieres buscar?");
		// Guardo el valor introducido por teclado en buscar
		numBuscar = sc.nextInt();
		
		// Llamo a la variable y guardo el valor devuelto en la variable encontrado
		encontrado = buscar(tabla, numBuscar);
		// Muestro por pantalla que no se ha encontrado el número si la función me devuelve -1
		if(encontrado == -1) {
			System.out.println("El número " + numBuscar + " no se ha encontrado :(");
		}else {
		// En los demás casos muestro en que posición se ha encontrado el número
			System.out.println("El número " + numBuscar + " se encunetra en la posición " + encontrado);
		}
		
		// Cierro el Scanner
		sc.close();
	}
	
	// Clase para buscar secuencialmente el número introducido por el usuario
	public static int buscar(int[] tabla, int numBuscar) {
		/* Variable que devuelvo como valor de la clase y que servirá como contador del bucle 
		 * de la busqueda secuencial*/
		int indiceBusqueda = 0;
		
		/* Mientras no se haya encontradoe el valor y no se haya llegado al final de la tabla el valor del 
		 * contador seguirá incrementando */
		while(indiceBusqueda < tabla.length && numBuscar != tabla[indiceBusqueda]) {
			indiceBusqueda++;
		}
		
		// Si no se ha encontrado el número se devolverá -1
		if (indiceBusqueda >= tabla.length) indiceBusqueda = -1;
		
		// Devuelvo el valor de busc como valor de la clase
		return indiceBusqueda;
	}

}
