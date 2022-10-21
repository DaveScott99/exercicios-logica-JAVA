package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int sumPairs = 0;
		int contPairs = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] %2 == 0 ) {
				sumPairs += vect[i];
				contPairs++;
			}
		}

		if(sumPairs > 0) {
			double avgPairs = sumPairs / contPairs;
			System.out.printf("MEDIA DOS PARES: %.1f%n ", avgPairs);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
		
	}

}
