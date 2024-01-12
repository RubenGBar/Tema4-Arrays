package ejerciciosconclase;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		int tabla[] = new int[55];
		int primero = 0;
		int ultimo = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			Arrays.fill(tabla, primero, ultimo + 1, i);
			primero = i + 1;
			ultimo = i;
		}
		
		System.out.println(Arrays.toString(tabla));
		
	}

}
