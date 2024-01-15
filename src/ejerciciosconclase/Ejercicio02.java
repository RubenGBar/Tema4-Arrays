package ejerciciosconclase;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Array para guardar la tabla con todos los valores
		int tabla[] = new int[55];
		// Variable para saber en que posici�n empezar a rellenar
		int desde = 0;
		// Variable para saber en que posici�n terminar de rellenar
		int hasta = 1;

		// Bucle for para rellenar la tabla
		for (int i = 1; i <= 10; i++) {
			// Relleno el Array con el algoritmo apropiado
			Arrays.fill(tabla, desde, hasta, i);
			/*
			 * Asigno a la variable desde el valor m�ximo anterior, porque ese ser� la
			 * primera posici�n del siguiente
			 */
			desde = hasta;
			/*
			 * Asigno a la variable hasta el valor desde m�s el contador porque ese es el
			 * rango a rellenar y le sumo uno ya que es un l�mite excluyente
			 */
			hasta = desde + i + 1;
		}
		
		// Muestro el Array por pantalla
		System.out.println(Arrays.toString(tabla));
		
	}

}
