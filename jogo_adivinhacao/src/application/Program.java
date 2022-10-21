package application;

import java.util.Scanner;

import entities.Jogo;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		exibirRotulo();
		
		int continuar = 1;
		
		do {
			int escolhaComputador = (int) (Math.random() * 5) + 1;
			System.out.println("Vou pensar em um número entre 0 e 5. Tente adivinhar...");
		
			System.out.println();
			
			System.out.print("Tente adivinhar qual numero o computador está pensando: ");
			int escolhaJogador = sc.nextInt();
			
			Jogo jogo = new Jogo(escolhaComputador, escolhaJogador);
			
			jogo.verificarGanhador();
			
			System.out.println();
			
			System.out.println("Deseja jogar novamente? (1) SIM / (2) NÃO ");
			continuar = sc.nextInt();
		} while (continuar == 1);
		
		
		
		sc.close();
	}
	
	public static void exibirRotulo() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("    JOGO DA ADIVINHAÇÃO   ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	

}
