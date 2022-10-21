package entities;

import java.util.Comparator;

public class ComparatorAnoNomeIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {

		int ano = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
		
		if (ano != 0) {
			return ano;
		}
		
		int nome = ling1.getNome().compareToIgnoreCase(ling2.getNome());
		
		if (nome != 0) {
			return nome;
		}
		
		
		return ling1.getIde().compareToIgnoreCase(ling2.getIde());
	}

}
