package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Dados funcionario = new Dados();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + funcionario);
		
		sc.close();
	}

}
