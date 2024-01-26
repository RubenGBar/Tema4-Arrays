package ejerciciosarraysbidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Array bidimensional a rellenar
		int tabla[][] = new int [3] [6];
		
		// Relleno los valores de la tabla que me pedien con los valores concretos
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
		
		// Bucle for para controlar las filas
		for(int i = 0; i < tabla.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tabla[0].length; j++) {
				// Muestro el elemento en el que me encuentro
				System.out.print(tabla[i][j] + " \t");
			}
			// Salto de línea cuando haya terminado de mostrar una fila
			System.out.println();
		}
		
	}

}
