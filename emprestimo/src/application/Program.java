package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emprestimo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do emprestimo: R$ ");
		double valorEmprestimo = sc.nextDouble();
		
		System.out.print("Digite a taxa de pagamento: % ");
		int taxa = sc.nextInt();
		
		Emprestimo emprestimo = new Emprestimo(valorEmprestimo, taxa);
		
		System.out.print("Deseja parcelar? (s/n) ");
		char respParcela = sc.next().charAt(0);
		
		if (respParcela == 's') {
			System.out.print("Quantas parcelas: ");
			int quantidadeDeParcelas = sc.nextInt();
			emprestimo.parcelarEmprestimo(quantidadeDeParcelas);
		}
		else {
			double totalEmprestimo = emprestimo.gerarEmprestimo();
			System.out.println("Valor do emprestimo: R$ " + String.format("%.2f", totalEmprestimo));
		}
		
		sc.close();
	}
	
}
