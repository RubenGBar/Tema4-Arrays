package ejerciciosarraysbidimensionales;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Array al que se le hará la transposición
		int tablaNormal[][] = {{1, 2, 3, 4},
								{5, 6, 7, 8},
								{9, 10, 11, 12},
								{13, 14, 15, 16}};
		// Arraya para guardar la tabla tranpuesta
		int tablaFinal[][] = new int[4][4];
		// Llamo a la función transponedor para transponer la tabla y lo guardo en tabla Final
		tablaFinal = transponedor(tablaNormal);
		
		// Mensaje para inidicar que es la tabla original
		System.out.println("Tabla Normal: ");
		// Bucles para monstrar la tabla normal, el primero controla las filas
		for(int i = 0; i < tablaNormal.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablaNormal[0].length; j++) {
				// Muestro cada elemento de la tabla
				System.out.print(tablaNormal[i][j] + "\t");
			}
			// Salto de línea cada vez que termino de imprimir una fila
			System.out.println();
		}

		// Mensaje para inidicar que es la tabla transpuesta
		System.out.println("\nTabla Transpuesta: ");
		// Bucles para monstrar la tabla transpuesta, el primero controla las filas
		for (int i = 0; i < tablaFinal.length; i++) {
			// Bucle para controlar las columnas
			for (int j = 0; j < tablaFinal[0].length; j++) {
				// Muestro cada elemento de la tabla
				System.out.print(tablaFinal[i][j] + "\t");
			}
			// Salto de línea cada vez que termino de imprimir una fila
			System.out.println();
		}

	}

	// Función que recibe una tabla y devuelve la transpuesta
	public static int[][] transponedor(int[][] tablaNormal){
		// Tabla transpuesta que devuelvo como valor de la función
		int[][] tablaTranspuesta = new int[tablaNormal.length][tablaNormal[0].length];
		
		// Bucles para tranponer las tablas, el primero controla las filas
		for(int i = 0; i < tablaTranspuesta.length; i++) {
			// Bucle que controla las columnas
			for(int j = 0; j < tablaTranspuesta[0].length; j++) {
				/* Transpongo la tabla asignandole el elemento j i de la tabla normal
				 * al elemento i j  de la transpuesta*/
				tablaTranspuesta[i][j] = tablaNormal[j][i];
			}
		}
		
		// Devuelvo tablaTranspuesta como valor de la función
		return tablaTranspuesta;
	}
	
}
