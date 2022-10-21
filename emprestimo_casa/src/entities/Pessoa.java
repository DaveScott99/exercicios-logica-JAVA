package entities;

public class Pessoa {
	
	private String nome;
	private double salario;
	
	private Emprestimo emprestimo;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, double salario, Emprestimo emprestimo) {
		this.nome = nome;
		this.salario = salario;
		this.emprestimo = emprestimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	
}
