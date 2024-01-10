package ejerciciossinclase;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Creo el Array de 12 posiciones
		int num[] = new int [12];
		//Asigno valores a las posiciones concretas
		num [0] = 39;
		num [1] = -2;
		num [4] = 0;
		num [6] = 14;
		num [8] = 5;
		num [9] = 120;
		
		//Variable que usaré como contador
		int cont = 0;
		
		//Bucle for-each para mostrar el valor de cada posición
		for (int numeros: num) {
			//Muestro el valor por pantalla
			System.out.println("El valor de la posición " + cont + " es: " + numeros);
			//Incremento el valor
			cont++;
		}
		
	}

}
