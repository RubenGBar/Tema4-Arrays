package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		int tabla[] = new int[10];
		int tablaSumada[];
		int numElementos = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número: ");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("¿De que longitud quieres que sean los grupos a sumar de la tabla?");
		numElementos = sc.nextInt();
			
		tablaSumada = suma(tabla, numElementos);
		System.out.println("La tabla que se genera sumando los elementos en grupos de " + numElementos + 
				" es la siguiente: ");
		System.out.println(Arrays.toString(tablaSumada));
		
		sc.close();
	}

	public static int[] suma(int[] tabla, int numElementos) {
		int elementosSumados[] = new int[tabla.length - numElementos + 1];
		
		for(int i = 0; i < elementosSumados.length; i++) {
			for(int j = i; j < numElementos + i; j++) {
				elementosSumados[i] += tabla[j];
			}
		} 
		
		return elementosSumados;
	}
}
