package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int qtdPairs = 0;
		
		int[] vect = new int[n];
		
		int[] vectPairs = new int[n];
		
		
		for (int i = 0; i < n; i ++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] %2 == 0) {
				vectPairs[i] = vect[i];
				qtdPairs++;
			}	
		}
		
		
		System.out.println("\nNUMEROS PARES: ");
		
		for (int i = 0; i < vectPairs.length; i++) {

			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vectPairs[i]);
			}

		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = " + qtdPairs);
		
		sc.close();
	}

}