package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Disciplina;
import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		cabecalho();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Disciplina> disciplinas = new ArrayList<>();
		
		System.out.print("Digite o nome do estudante: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o ano de ingresso do estudante: ");
		int anoIngresso = sc.nextInt();
		
		System.out.print("Este estudante é bolsista? (true/false) ");
		boolean bolsista = sc.nextBoolean();
		
		System.out.print("Digite o numero de disciplinas cursadas pelo estudadante: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome da disciplina: ");
			String nomeDisciplina = sc.next();
			
			System.out.print("Digite a carga horaria da disciplina: ");
			int cargaHoraria = sc.nextInt();
			
			System.out.print("Digite a nota final deste aluno: ");
			double notaFinal = sc.nextDouble();
			
			Disciplina disc = new Disciplina(nomeDisciplina, cargaHoraria, notaFinal);
			
			disciplinas.add(disc);
		}
		
		System.out.println();
		
		Estudante estudante = new Estudante(nome, anoIngresso, bolsista, disciplinas);
		
		estudante.mostrar();
		
		sc.close();
	}
	
	public static void cabecalho() {
		System.out.println("\n **************** SISTEMA ACADEMICO *****************\n\n ");
	}

}
