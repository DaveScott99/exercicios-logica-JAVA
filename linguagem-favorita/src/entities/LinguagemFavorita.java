package entities;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

	private String nome;
	private int anoDeCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return anoDeCriacao == other.anoDeCriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(LinguagemFavorita n) {
		return this.getNome().compareToIgnoreCase(n.getNome());
	}
	
	public String toString() {
		return nome + " - " + anoDeCriacao + " - " + ide;
	}
}
