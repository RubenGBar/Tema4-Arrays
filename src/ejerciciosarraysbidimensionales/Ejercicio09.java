package ejerciciosarraysbidimensionales;

public class Ejercicio09 {
	public static void main(String[] args) {
		// Array que se comprobará si es mágico
		int matriz[][] = {{11, 24, 7, 20, 3},
						  {4, 12, 25, 8, 16},
						  {17, 5, 13, 21, 9},
						  {10, 18, 1, 14, 22},
						  {23, 6, 19, 2, 15}};
		// Variable para saber si la matriz es mágica o no
		boolean serMagica = false;
		
		// Llamo a la funcion para comprobar que la matriz sea mágica y guardo el valor
		serMagica = comprobarMagia(matriz);
		
		// Le muestro la matriz al usuario
		System.out.println("La matriz:");
		for(int i = 0; i < matriz.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < matriz[0].length; j++) {
				// Muestro cada elemento de la matriz
				System.out.print(matriz[i][j] + "\t");
			}
			// Salto de línea cuando termino de imprimir una línea
			System.out.println();
		}
		
		// Muestro que la matriz es mágica o no según el valor de serMagica
		if(serMagica) {
			System.out.println("\nLa matriz es mágica :O");
		}else {
			System.out.println("\nLa matriz no es mágica :/");
		}
	}
	
	// Función para comprobar si la matriz es mágica o no
	public static boolean comprobarMagia(int[][] matriz) {
		// Variable para devolver como valor de la función
		boolean esMagica = true;
		// Variable para sumar las filas
		int sumaFilas = 0;
		// Variable para sumar las columnas
		int sumaColumnas = 0;
		// Variable para sumar la diagonal
		int sumaDiagonal = 0;
		// Variable para guardar la suma de la fila anterior
		int sumaFilaAnterior = 0;
		// Variable para guardar la suma de la columna anterior
		int sumaColumnaAnterior = 0;

		// Bucle para comprobar que la suma de las filas y columnas son iguales, además
		// reinicio las variables necesarias a 0
		for (int i = 0; esMagica && i < matriz.length; i++) {
			// Bucle para sumar las filas, columnas y diagonal y compruebo si son iguales
			for (int j = 0; esMagica && j < matriz[0].length; j++) {
				// Sumo las filas
				sumaFilas += matriz[i][j];
				// Sumo las columnas
				sumaColumnas += matriz[j][i];
				// Sumo la Diagonal
				if (i == j) {
					sumaDiagonal += matriz[i][j];
				}
			}
			/*
			 * Cuando la i es distinto de cero compruebo que la suma de las filas, la suma
			 * de las columnas, la suma de la fila anterior y la suma de la columna anterior
			 * son iguales para seguir iterando el bucle 
			 */
			if (i != 0) {
				if (sumaFilas == sumaColumnas && sumaFilas == sumaFilaAnterior && sumaFilas == sumaColumnaAnterior
						&& sumaColumnas == sumaFilaAnterior && sumaColumnas == sumaColumnaAnterior) {
					esMagica = true;
				} else {
					esMagica = false;
				}
			}

			// Guardo la última suma de las filas
			sumaFilaAnterior = sumaFilas;
			// Guardo la última suma de las columnas
			sumaColumnaAnterior = sumaColumnas;
			// Vuevlo a inicializar la suma de las filas en 0 para que no se acumulen
			sumaFilas = 0;
			// Vuevlo a inicializar la suma de las columnas en 0 para que no se acumulen
			sumaColumnas = 0;
		}

		/*
		 * Compruebo que la suma de las últimas filas y columnas sean iguales a la suma
		 * de la diagonal y si no es asi la matriz no sería mágica
		 */
		if (sumaFilaAnterior == sumaDiagonal && sumaColumnaAnterior == sumaDiagonal) {
			esMagica = true;
		} else {
			esMagica = false;
		}

		// Devuelvo esMagica como valor de la clase
		return esMagica;
	}

}
