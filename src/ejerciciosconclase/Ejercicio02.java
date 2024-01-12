package ejerciciosconclase;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		int tabla[] = new int[55];
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				Arrays.fill(tabla, j);
			}
			
		}
		
		System.out.println(Arrays.toString(tabla));
		
	}

}
