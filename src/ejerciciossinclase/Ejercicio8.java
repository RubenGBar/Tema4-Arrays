package ejerciciossinclase;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Creo el Array de 100 espacios
		int tablaAleatoria[] = new int[100];
		//Guardo el valor a buscar introducido por el usuario
		int numero = 0;
		
		//Bucle for para asignar números aleatorios a cada posición de la tabla
		for(int i = 0; i < tablaAleatoria.length; i++ ) {
			tablaAleatoria[i] = (int) (1 + Math.random()*10);
			System.out.println(Arrays.toString(tablaAleatoria));
		}
		
		//Pido el valor de número
		System.out.println("¿Qué número quiere buscar?");
		//Leo el valor de número del teclado
		numero = sc.nextInt();
		
		//Bucle para buscar en la tabla 
		for (int i = 0; i < tablaAleatoria.length; i++) {
			/*Si en una posición de la tabla se encunetra el número introducido por teclado muestro un 
			 *mensaje en el que indico que se ha encontrado ese número*/
			if (tablaAleatoria[i] == numero) {
				System.out.println("El número " + numero + " se encuentra en la posición: " + i);
			}
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
