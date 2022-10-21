package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emprestimo;
import entities.GerarEmprestimo;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o valor da casa: ");
		double valorCasa = sc.nextDouble();
		
		System.out.print("Em quantos anos voce quer pagar? ");
		int prestacoes = sc.nextInt();
		
		
		Pessoa p = new Pessoa(nome, salario, new Emprestimo(valorCasa, prestacoes));
		
		double emprestimo = GerarEmprestimo.gerar();
		
		if (GerarEmprestimo.verificarAprovacao() != true) {
			System.out.println("INFELIZMENTE o senhor(a) não poderá financiar esta casa.");
			System.out.println("Por que o valor da parcela é de " + String.format("%.2f", emprestimo));
			System.out.println("E excedeu 30% do seu salário de R$ " + String.format("%.2f", p.getSalario()));
		}
		else {
			System.out.println("PARABÉNS!! O seu emprestimo foi aprovado.");
			System.out.println("O senhor(a) deverá pagar R$ " + String.format("%.2f", emprestimo) + "por mes.");
			System.out.println("Em um total de " + p.getEmprestimo().getPrestacoes() + " parcelas." );
		}
		
		
		sc.close();
		
	}

}
