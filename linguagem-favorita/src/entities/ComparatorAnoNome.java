package entities;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		
		int ano = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
		
		if (ano != 0) {
			return ano;
		}
		
		return ling1.getNome().compareToIgnoreCase(ling2.getNome());
		
	}

}
