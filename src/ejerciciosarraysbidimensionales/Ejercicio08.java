package ejerciciosarraysbidimensionales;

public class Ejercicio08 {
	public static void main(String[] args) {
		// Array que se comprobará si es simétrico
		int tabla[][] = { {1, 2, 3, 4},
						  {2, 2, 5, 6},
						  {3, 6, 3, 7},
						  {4, 6, 7, 4}};
		// Variable para que cuando llame a la función saber si es simétrica o no
		boolean simetrica = false;
		
		// Compruebo que la tabla sea simétrica y guardo lo devuelto en simetria
		simetrica = compruebaSimetria(tabla);
		
		// Muestro la tabla para que el usuario la pueda ver
		for(int i = 0; i < tabla.length; i++) {
			// Bucle para controlar las filas
			for(int j = 0; j < tabla.length; j++) {
				// Muestro cada elemento de la tabla
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de línea cuando termino de imprimir cada fila
			System.out.println();
		}
		
		// Compruebo simetrica para mostrar el mensaje adecujado
		if(simetrica) {
			// Si es verdadero muestro que la tabla es simétrica
			System.out.println("\nLa tabla es simétrica :D");
		}else {
			// Si es falso muestro que la tabla no es simétrica
			System.out.println("\nLa tabla no es simétrica :(");
		}
	}
	
	// Función que devolverá true si la matriz es simétrica
	public static boolean compruebaSimetria(int[][] tabla) {
		// Variabla para devolver como valor de la función
		boolean esSimetrica = true;
		
		// Bucle for para comprobar si la tabla es simétrica
		for(int i = 0; esSimetrica && i < tabla.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; esSimetrica && j < tabla[0].length; j++) {
				// En el momento en que las posiciones espejadas no sean iguales termino de iterar los bucles
				if(tabla[i][j] != tabla[j][i]) {
					esSimetrica = false;
				}
			}
		}
		
		// Devuevlo esSimetrica como valor de la función
		return esSimetrica;
	}

}
