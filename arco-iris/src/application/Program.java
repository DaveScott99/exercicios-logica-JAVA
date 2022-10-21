package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) {
	
		Set<String> arco = new HashSet<>() {{
			add("Vermelho");
			add("Laranja");
			add("Amarelo");
			add("Verde");
			add("Azul");
			add("Anil");
			add("Violeta");
		}};
		
		System.out.println("Exiba todas as cores uma abaixo da outra: ");
		
		for (String a : arco) {
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("A quantidade de cores que o arco-íris tem: " + arco.size());
				
		System.out.println();
		
		System.out.println("Exiba as cores em ordem alfabética: ");
		
		Set<String> arco2 = new TreeSet<>(arco);
		
		for (String a : arco2) {
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("Exiba as cores na ordem inversa que foi informada: ");

		Set<String> arco3 = new LinkedHashSet<>() {{
			add("Vermelho");
			add("Laranja");
			add("Amarelo");
			add("Verde");
			add("Azul");
			add("Anil");
			add("Violeta");
		}};
		
		List<String> coresArcoInverso = new ArrayList<>(arco3); 
		Collections.reverse(coresArcoInverso);
		
		for (String a : coresArcoInverso) {
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("Exiba todas as cores que começam com a letra v: ");

		for (String cor : arco) {
			
			if (cor.startsWith("V")) {
				System.out.println(cor);
			}
			
		}
		
		System.out.println();
		
		System.out.println("Remova todas as cores que não começam com a letra V");
		
		Iterator<String> iterator = arco.iterator();
		
		while (iterator.hasNext()) {
			
			if (iterator.next().startsWith("V")) {
				iterator.remove();
			}
		}
		
		for (String cor : arco) {
			System.out.println(cor);
		}
		
		System.out.println();
		
		System.out.println("Limpe o conjunto");
		arco.clear();
		
		System.out.println();
		
		System.out.println("Confira se o conjunto está vazio");
		System.out.println(arco.isEmpty());

	}

}
