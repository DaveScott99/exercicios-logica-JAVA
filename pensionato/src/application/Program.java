package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] student = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println();
			
			System.out.println("Rent #" + (i+1) + ":");
			
			System.out.print("Name: ");
			String name = sc.next();
			
			sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
		
			student[room] = new Rent(name, email);

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			
			if(student[i] != null) {
				System.out.println(i + ": " + student[i]);
			}
			
		}
		
		sc.close();
	}

}