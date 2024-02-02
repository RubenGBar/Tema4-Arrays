package ejerciciosarraysbidimensionales;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Matriz que se va a girar
		int matrizNormal[][] = {{1, 2, 3, 4},
							   {5, 6, 7, 8},
							   {9, 10, 11, 12},
							   {13, 14, 15, 16}};
		// Matriz en la que se guarda la matriz girada al llamar la función
		int matrizReflejada[][] = new int [matrizNormal.length][matrizNormal[0].length];
		
		// Guardo la matriz girada
		matrizReflejada = gira90(matrizNormal);
		
		// Muestro la Matriz Original
		System.out.println("Matriz Original");
		for(int i = 0; i < matrizNormal.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < matrizNormal[0].length; j++) {
				// Muestro cada elemento de la matriz
				System.out.print(matrizNormal[i][j] + "\t"); 
			}
			// Salto de línea cuando termino de imprimir cada fila
			System.out.println();
		}

		// Muestro la Matriz Reflejada
		System.out.println("\nMatriz Reflejada");
		for (int i = 0; i < matrizReflejada.length; i++) {
			// Bucle para controlar las columnas
			for (int j = 0; j < matrizReflejada[0].length; j++) {
				// Muestro cada elemento de la matriz
				System.out.print(matrizReflejada[i][j] + "\t");
			}
			// Salto de línea cuando termino de imprimir cada fila
			System.out.println();
		}

	}
	
	public static int[][] gira90(int[][] matriz){
		// Matriz para devolver como valor de la función
		int matrizGirada[][] = new int[matriz[0].length][matriz.length];
		
		// Bucle para construir las filas matriz girada
		for(int i = 0; i < matriz.length; i++) {
			// Bucle para construir las columnas giradas
			for(int j = 0; j < matriz[0].length; j++) {
				// La posición de la matriz girada es la fila de la original y la longitud de la columna menos j
				matrizGirada[j][matriz.length - 1 - i] = matriz[i][j];
			}
		}
		
		// Devuelvo la matriz girada 90 grados como valor de la función
		return matrizGirada;
	}
}
