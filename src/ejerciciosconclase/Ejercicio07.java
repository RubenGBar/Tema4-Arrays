package ejerciciosconclase;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Array en el que guardo la apuesta generada aleatoriamente
		int apuesta[] = new int[6];
		// Array con la combinaci�n ganadora de la primitiva
		int ganadora[] = {1, 2, 7, 9, 21, 42};
		// Guardo el n�mero de aciertos
		int aciertos = 0;
		
		// Bucle for para rellenar la apuesta con valores aleatorios
		for (int i = 0; i < apuesta.length; i++) {
			// Relleno cada posici�n del array
			apuesta[i] = (int) (1 + Math.random() * 49);
		}
		
		
		
	}

}
