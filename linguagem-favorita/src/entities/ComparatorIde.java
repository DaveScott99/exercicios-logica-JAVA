package entities;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita ide1, LinguagemFavorita ide2) {
		return ide1.getIde().compareToIgnoreCase(ide2.getIde());
	}

}
