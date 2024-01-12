package ejerciciosconclase;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		//Guardo el valor introducido por el usuario
		int num1 = 0;
		//Guardo el valor introducido por el usuario
		int num2 = 0;
		
		//Pido que introduzca un número por teclado para la longitud del Array
		System.out.println("¿De que tamaño será la tabla?");
		//Leo el valor del teclado y lo guardo
		num1 = sc.nextInt();
		//Pido que introduzca por teclado el valor de todas las casillas del Array
		System.out.println("¿Qé valor tendrán las casillas de la tabla?");
		//Leo el valor del teclado y lo guardo
		num2 = sc.nextInt();
		
		//Creo el Array sin determinar el tamaño
		int tabla[] = new int[num1];
		
		//Bucle for para asignarlae a cada casilla de la tabla el valor introducido por teclado
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = num2;
		}
		
		//Muestro el Array por pantalla
		System.out.println(Arrays.toString(tabla));
		
		//Cierro el Scanner
		sc.close();
	}

}
