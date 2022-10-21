package entities;

public class Emprestimo {
	
	private double valorCasa;
	private int prestacoes;

	public Emprestimo() {
	}

	public Emprestimo(double valorCasa, int prestacoes) {
		this.valorCasa = valorCasa;
		this.prestacoes = prestacoes;
	}

	public double getValorCasa() {
		return valorCasa;
	}

	public void setValorCasa(double valorCasa) {
		this.valorCasa = valorCasa;
	}

	public int getPrestacoes() {
		return prestacoes;
	}

	public void setPrestacoes(int prestacoes) {
		this.prestacoes = prestacoes;
	}
	
}
