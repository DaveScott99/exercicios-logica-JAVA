package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		double sum = 0.0;
		
		int nMinors = 0;
		
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vect[i] = new Person(name, age, height);
			
			sum += vect[i].getHeight();

		}
		
		String[] vectName = new String[vect.length];
		
		
		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i].getAge() < 16) {
			 	nMinors++;
			}

		}
		
		
		double avg = sum/vect.length;
		
		double avgAge = ((double)nMinors / n) * 100.0;
		
		System.out.println();
		
		System.out.printf("Altura média: %.2f%n", avg);
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", avgAge);
		
		
		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i].getAge() < 16) {
			 	vectName[i] = vect[i].getName();
			 	System.out.println(vectName[i]);
			}

		}
		
		sc.close();

	}

}
