package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas vai digitar? ");
		int n = sc.nextInt();
		
		
		Person[] person = new Person[n];
		
		int older = 0;
		
		String nameOlder = "";
		
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			person[i] = new Person(name,age);
			
			if(age > older) {
				older = age;
				nameOlder = person[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nameOlder);
		
		sc.close();
		
	}

}
