package entities;

public class GerarEmprestimo {
	
	Pessoa pessoa;
	Emprestimo emprestimo;
	
	public double gerar() {
		
		double parcela = emprestimo.getPrestacoes() * 12;
		double valor_parcela = emprestimo.getValorCasa() / parcela;
		
		return valor_parcela;
		
	}
	
	public boolean verificarAprovacao() {
		
		double salario = pessoa.getSalario();
		
		if ((salario * 30/100) > gerar()) {
			return true;
		}

		return false;
		
	}

}
