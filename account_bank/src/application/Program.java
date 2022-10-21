package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account person;
		
		System.out.print("Enter account number: ");
		int code = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
		
		sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char ask = sc.next().charAt(0);
		
		if (ask == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			person = new Account (code, name, value);
		} 
		else {
			person = new Account (code, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(person);
		System.out.println();
		
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		person.deposit(value);
		
		System.out.println("Account data:");
		System.out.println(person);
		System.out.println();
		
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		person.withdraw(value);
		System.out.println("Account data:");
		System.out.println(person);
		
		
		sc.close();
	}

}
