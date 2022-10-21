package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonData;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		PersonData[] person = new PersonData[n];
		
		double shorterHeight = 0.0;
		double greatestHeight = 0.0;
		
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double height = sc.nextDouble();
			
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char sex = sc.next().charAt(0);
			
			person[i] = new PersonData(height, sex);
			
			if(greatestHeight < height) {
				
				shorterHeight = height;
			}
			
			if(height < shorterHeight) {
				
				greatestHeight = height;
			}
			
	
			
		}
		
		System.out.println(shorterHeight);
		System.out.println(greatestHeight);
		
			
		sc.close();
			
	}

}
