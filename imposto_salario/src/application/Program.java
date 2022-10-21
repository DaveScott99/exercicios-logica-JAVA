package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + func);
		System.out.println();
		
		System.out.println();
		System.out.print("Qual a porcentagem de aumento de salario? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + func);
		System.out.println();
		
		sc.close();
	}

}
