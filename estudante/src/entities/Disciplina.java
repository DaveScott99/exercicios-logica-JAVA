package entities;

public class Disciplina {
	
	private String nome;
	private int ch;
	private double nota;
	
	public Disciplina(String nome, int ch, double nota) {
		this.nome = nome;
		this.ch = ch;
		this.nota = nota;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("::: DISCIPLINAS :::");
		System.out.println("Nome.........: " + nome);
		System.out.println("CargaHoraria.: " + ch + "h");
		System.out.println("NotaFinal....: " + nota);
	}
	
	
}

