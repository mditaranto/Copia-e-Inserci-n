package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numeros [] = new int[10];    
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print("Introduzca un numero: ");
			numeros[i] = sca.nextInt();
			
			if(Primo.esPrimo(numeros[i])) {
				
			}
		}

	}

}
