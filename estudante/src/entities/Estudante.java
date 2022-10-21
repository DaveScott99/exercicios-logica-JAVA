package entities;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

	private String nome;
	private String matricula;
	private int anoIngresso;
	private boolean ehBolsista;
	
	List<Disciplina> disciplinas = new ArrayList<>();

	public Estudante() {
	}
	
	public Estudante(String nome, int anoIngresso, boolean bolsista, List<Disciplina> disciplinas) {
		this.nome = nome;
		this.anoIngresso = anoIngresso;
		this.ehBolsista = bolsista;
		
		this.disciplinas = disciplinas;
		
		matricular();
	}
	
	public Estudante(boolean bolsista) {
		this.ehBolsista = bolsista;
	}
	
	public void matricular() {
		
		System.out.println("Matricula do estudante " + nome + " realizada com sucesso.");
		
		matricula = gerarMatricula();
		
		System.out.println("Numero de matricula: " + matricula);
		
	}
	
	public String gerarMatricula() {
		
		matricula = anoIngresso + "" + (int) (Math.random() * Math.pow(10, 7));
		
		return matricula;
	}
	
	public double calculoMensalidade() {
		
		if (ehBolsista) {
			return 0.0;
		}
		else {
			return 1000.00;
		}
		
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("::: CADASTRO ALUNO :::");
		System.out.println("ESTUDANTE: " + nome);
		System.out.println("MATRICULA: " + matricula);
		System.out.println("ANO DE INGRESSO: " + anoIngresso);
		System.out.println("BOLSISTA? " + ehBolsista);
		
		for (Disciplina d : disciplinas) {
			d.mostrar();
		}
	}
	
	
}
