package ejerciciosarraysbidimensionales;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Array para guardar el valor de las tablas de multiplicar al llamar a la función
		int tablaMultiplicar[][] = new int[10][10];
		
		// Llamo a la función multiplicarTablas y guardo el valor en tablaMultiplicar
		tablaMultiplicar = multiplicarTablas(tablaMultiplicar);
		
		// Bucles para mostrar los Arrays como una tabla, en el primer bucle controlo las filas
		for(int i = 0; i < tablaMultiplicar.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablaMultiplicar.length; j++) {
				// Muestro el valor de cada elemento del Array de forma separada
				System.out.print(tablaMultiplicar[i][j] + "\t");
			}
			// Salto de línea cuando termino de imprimir una fila
			System.out.println();
		}
		
	}

	// Función para rellenar con las tablas de multiplicar
	public static int[][] multiplicarTablas(int[][] tablaMultiplicar) {
		// Array para devolver como valor de la función
		int[][] tablasMulptiplicadas = new int[10][10];
		// Bucles para calcular las tablas de multiplicar, con el primer bucle controlo las filas
		for(int i = 0; i < tablasMulptiplicadas.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablasMulptiplicadas.length; j++) {
				/* 
				 * En cada elemento guardo el valor de multiplicar el contador de cada bucle más 1 cada uno 
				 * y así obtener el valor de cada casilla de la tabla de multiplicar
				 * */
				tablasMulptiplicadas[i][j] = (i+1) * (j+1); 
			}
		}
		
		// Devuelvo tablasMulptiplicadas como valor de la función
		return tablasMulptiplicadas;
	}
	
}
