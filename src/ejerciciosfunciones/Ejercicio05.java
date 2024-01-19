package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Creo un objeto de la clase random para rellenar la tabla
		Random rand = new Random();
		// Valor a buscar en el Array
		int buscado;
		// Guardo el Array en el que voy a buscar
		int tabla[] = new int[100];
		// Arrays para guardar el valor que me deveulve la función al llamarla
		int indicesEncontrado[];
		// Varibale que usaré de contador en el bucle para rellenar la tabla
		int i = 0;

		// Relleno la tabla con números aleatorios
		while (i < tabla.length) {
			tabla[i] = rand.nextInt(0, 100);
			i++;
		}

		// Pido que introduzca un número a buscar
		System.out.println("¿Qué número quieres buscar?");
		// Guardo el valor introducido por teclado en buscar
		buscado = sc.nextInt();
		
		// Llamo a la función buscarTodos y guardo lo que me devuelve en la tabla indicesEcontrados
		indicesEncontrado = buscarTodos(tabla, buscado);
		// Muestro por pantalla en que posiciones se encuentra el número que se quiere buscar
		System.out.println("El número " + buscado + " se encunetra en las posiciones rellenas de la siguiente tabla: ");
		System.out.println(Arrays.toString(indicesEncontrado));
		
		// Cierro el Scanner
		sc.close();
	}
	
	public static int[] buscarTodos(int[] tabla, int buscado) {
		// Array que devuelvo como valor de la tabla 
		int tablaConIndicesEncontrados[] = new int[10];
		/* Variable que devuelvo como valor de la clase y que servirá como contador del bucle 
		 * de la busqueda secuencial*/
		int indiceBusqueda = 0;
		// Variable para guardar los números en orden en la tabla devuelta
		int contadorSegundaTabla = 0;
		
		/* Bucle para recorrer toda la tabla */
		while(indiceBusqueda < tabla.length) {
			/* Si el valor de esa posición de la tabla es igual al numero a encontrar se guarda 
			 * ese valor en otra tabla*/
			if(tabla[indiceBusqueda] == buscado) {
				tablaConIndicesEncontrados[contadorSegundaTabla] = indiceBusqueda;
				// Incremento el contador para guardar los valores en orden
				contadorSegundaTabla++;
			}
			// Incremento el contador
			indiceBusqueda++;
		}
		
		// Devuelvo el valor de busc como valor de la clase
		return tablaConIndicesEncontrados;
	}

}
