package entities;

import java.util.Scanner;

public class Jogo {
	
	private int escolhaComputador;
	private int escolhaJogador;
	
	public static Scanner sc;
	
	public Jogo() {
	}
	
	public Jogo(int escolhaComputador, int escolhaJogador) {
		this.escolhaComputador = escolhaComputador;
		this.escolhaJogador = escolhaJogador;
	}

	public int getEscolhaComputador() {
		return escolhaComputador;
	}

	public void setEscolhaComputador(int escolhaComputador) {
		this.escolhaComputador = escolhaComputador;
	}

	public int getEscolhaJogador() {
		return escolhaJogador;
	}

	public void setEscolhaJogador(int escolhaJogador) {
		this.escolhaJogador = escolhaJogador;
	}

	public void verificarGanhador() {
		
		if (getEscolhaJogador() == getEscolhaComputador()) {
			System.out.println();
			vitoriaJogador();
		}
		else {
			System.out.println();
			vitoriaComputador();
		}
		
	}
	
	public void vitoriaJogador() {
		System.out.println("PARABÉNS! voce consegui me vencer!!");
	}
	
	public void vitoriaComputador() {
		System.out.println("GANHEI! Eu pensei no número " + escolhaComputador + " e não no " + escolhaJogador );
	}
	
	
	
}
