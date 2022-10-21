package application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> listaEstado = new HashMap<>() {{
			
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			
		}};
		
		for (Map.Entry<String, Integer> estado : listaEstado.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		System.out.println("Substitua a população do estado do RN por 3.534.165");
		
		listaEstado.put("RN", 3534165);
		for (Map.Entry<String, Integer> estado : listaEstado.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		System.out.println();
		
		System.out.println("Confira se o estado PB está no dicionario, caso não adicione: PB - 4.039.227");
		
		System.out.println("PB está no dicionário: " + listaEstado.containsKey("PB"));
		
		System.out.println();
		
		System.out.println("Adicionando PB no dicionário: ");
		
		listaEstado.put("PB", 4039227);
		
		for (Map.Entry<String, Integer> estado : listaEstado.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		System.out.println("Exiba a população PE: " + listaEstado.get("PE"));
		
		System.out.println();
		
		System.out.println("Exiba todos os estados e suas populações na ordem que foi infomado: ");
		
		Map<String, Integer> listaEstado2 = new LinkedHashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			put("PB", 4039227);
		}};
		
		for (Map.Entry<String, Integer> estado : listaEstado2.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		System.out.println();
		
		System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
		
		Map<String, Integer> listaEstado3 = new TreeMap<>(listaEstado);
		
		for (Map.Entry<String, Integer> estado : listaEstado3.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		
		
		
		System.out.println();
		
		
		
		
		
		System.out.println("Exiba o estado com o menor população e sua quantidade: ");
		
		Integer menorPopulacao = Collections.min(listaEstado2.values());
		
		Set<Map.Entry<String, Integer>> entries = listaEstado2.entrySet();
		
		String estadoMenorPopulacao = "";
		
		for (Map.Entry<String, Integer> entry : entries) {
			
			if (entry.getValue().equals(menorPopulacao)) {
				estadoMenorPopulacao = entry.getKey();
				System.out.println("Estado com a menor população: " + estadoMenorPopulacao + " - " + menorPopulacao);
			}
			
		}
		
		
		
		
		System.out.println();
		
		
		
		
		System.out.println("Exiba o estado com a maior população e sua quantidade: ");
		
		Integer maiorPopulacao = Collections.max(listaEstado2.values());
		
		Set<Map.Entry<String, Integer>> entries2 = listaEstado2.entrySet();
		
		String estadoMaiorPopulacao = "";
		
		for (Map.Entry<String, Integer> entry : entries2) {
			
			if (entry.getValue().equals(maiorPopulacao)) {
				estadoMaiorPopulacao = entry.getKey();
				System.out.println("Estado com a maior população: " + estadoMaiorPopulacao + " - " + maiorPopulacao);
			}
			
		}
		

		
		
		
		System.out.println();
		
		
		

		Integer soma = 0;
		
		Iterator<Integer> iterator = listaEstado2.values().iterator();
		
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println("Exiba a soma da população desses estados: " + soma);
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		System.out.println("Exiba a média da população deste dicionário de estados: " + (soma/listaEstado2.size()));
	
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		System.out.println("Remova os estados com a população menor que 4.000.000: ");
		
		Iterator<Integer> iterator2 = listaEstado2.values().iterator();
		
		while (iterator2.hasNext()) {
			
			if (iterator2.next() < 4000000) {
				iterator2.remove();
			}
			
		}
		
		for (Map.Entry<String, Integer> estado : listaEstado2.entrySet()) {
			System.out.println("Estado = " + estado.getKey() + " - " + "População = " + estado.getValue());
		}
		
		
		
		
		System.out.println();
		
		
		
		
		System.out.println("Apague o dicionário de estados: ");
		
		listaEstado.clear();
		
		System.out.println("Confira se o dicionário está vazio: " + listaEstado.isEmpty());

	}

}
