package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		
		System.out.print("VALORES = ");
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf(" %.1f ", vect[i]);
		}
		
		double avg = sum/vect.length;
		
		System.out.println();
		
		System.out.println("SOMA = " + sum);
		
		System.out.println("MEDIA = " + avg);
		

		sc.close();
	}

}
