package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = sc.nextInt();
		
		double bigger = 0.0;
		int posBigger = 0;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if (vect[i] > bigger) {
				bigger = vect[i];
				posBigger = i;
			}
	
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", bigger);
		System.out.printf("POSICAO DE MAIOR VALOR = %d", posBigger);
		
		sc.close();
	}

}
