package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número: ");
		int b =sc.nextInt();
		
		System.out.println("Qual operacao voce quer fazer? ");
		System.out.println("\n [1] Soma \n [2] Subtracao \n [3] Multiplicacao \n [4] Divisao \n");
		
		System.out.print("Escolha: ");
		int resp = sc.nextInt();
		
		switch (resp) {
		case 1:
			System.out.println("A soma é: " + Calculadora.soma(a, b));
			break;
		case 2:
			System.out.println("A subtracao é: " + Calculadora.subtracao(a, b));
			break;
		case 3:
			System.out.println("A multiplicacao é: " + Calculadora.multiplicacao(a, b));
			break;
		case 4:
			System.out.println("A divisao é: " + Calculadora.divisao(a, b));
			break;
		default:
			System.out.println("Opção invalida!");
		}
		
		sc.close();
	}

}
