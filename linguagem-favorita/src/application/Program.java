package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entities.ComparatorAnoNome;
import entities.ComparatorAnoNomeIde;
import entities.ComparatorIde;
import entities.LinguagemFavorita;

public class Program {

	public static void main(String[] args) {
		
		Set<LinguagemFavorita> ling = new LinkedHashSet<>() {{
			
			add(new LinguagemFavorita("Java", 1991, "Eclipse"));
			add(new LinguagemFavorita("JavaScipt", 1995, "VScode"));
			add(new LinguagemFavorita("Python", 1989, "PyCharm"));
			
		}};

		
		System.out.println("--\tOrdem de Inserção\t--");
		
		for (LinguagemFavorita l : ling) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("--\tOrdem Natural (nome)\t--");
		Set<LinguagemFavorita> ling2 = new TreeSet<>(ling);
		for (LinguagemFavorita l : ling2) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("--\tOrdem Natural (IDE)\t--");
		
		List<LinguagemFavorita> listaLing = new ArrayList<>(ling);
		Collections.sort(listaLing, new ComparatorIde());
		for (LinguagemFavorita l : listaLing) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("--\tOrdem Natural (Nome/AnoDeCriação)\t--");
		
		listaLing.sort(new ComparatorAnoNome());
		for (LinguagemFavorita l : listaLing) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("--\tOrdem Natural (Nome/AnoDeCriação/Ide)\t--");
		
		listaLing.sort(new ComparatorAnoNomeIde());
		for (LinguagemFavorita l : listaLing) {
			System.out.println(l);
		}
			
	}

}
