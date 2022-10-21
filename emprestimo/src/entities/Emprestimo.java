package entities;

public class Emprestimo {
	
	private double valorEmprestimo;
	private int taxa;
	
	public Emprestimo() {
	}

	public Emprestimo(double valorEmprestimo, int taxa) {
		this.valorEmprestimo = valorEmprestimo;
		this.taxa = taxa;
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	
	public double gerarEmprestimo() {
		return getValorEmprestimo() + getValorEmprestimo() * getTaxa()/100;
	}
	
	public void parcelarEmprestimo(int quantidadeDeParcelas) {
		
		double valorParcela = gerarEmprestimo() / quantidadeDeParcelas;
		
		for (int i = 0; i < quantidadeDeParcelas; i++) {
			System.out.println("Valor da " + (i+1) + "a parcela: R$ " + String.format("%.2f", valorParcela));
		}
		
	}
}

