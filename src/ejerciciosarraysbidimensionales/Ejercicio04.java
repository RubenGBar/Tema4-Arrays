package ejerciciosarraysbidimensionales;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Array para guardar el valor de las tablas de multiplicar al llamar a la funci�n
		int tablaMultiplicar[][] = new int[10][10];
		
		// Llamo a la funci�n multiplicarTablas y guardo el valor en tablaMultiplicar
		tablaMultiplicar = multiplicarTablas(tablaMultiplicar);
		
		// Bucles para mostrar los Arrays como una tabla, en el primer bucle controlo las filas
		for(int i = 0; i < tablaMultiplicar.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablaMultiplicar.length; j++) {
				// Muestro el valor de cada elemento del Array de forma separada
				System.out.print(tablaMultiplicar[i][j] + "\t");
			}
			// Salto de l�nea cuando termino de imprimir una fila
			System.out.println();
		}
		
	}

	// Funci�n para rellenar con las tablas de multiplicar
	public static int[][] multiplicarTablas(int[][] tablaMultiplicar) {
		// Array para devolver como valor de la funci�n
		int[][] tablasMulptiplicadas = new int[10][10];
		// Bucles para calcular las tablas de multiplicar, con el primer bucle controlo las filas
		for(int i = 0; i < tablasMulptiplicadas.length; i++) {
			// Bucle para controlar las columnas
			for(int j = 0; j < tablasMulptiplicadas.length; j++) {
				/* 
				 * En cada elemento guardo el valor de multiplicar el contador de cada bucle m�s 1 cada uno 
				 * y as� obtener el valor de cada casilla de la tabla de multiplicar
				 * */
				tablasMulptiplicadas[i][j] = (i+1) * (j+1); 
			}
		}
		
		// Devuelvo tablasMulptiplicadas como valor de la funci�n
		return tablasMulptiplicadas;
	}
	
}
