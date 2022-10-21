package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> containerVotos = new LinkedHashMap<>();
		
		// //Users//davisantos//Desktop//in.txt
		
		System.out.print("Digite o caminho completo do arquivo: ");
		String caminho = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] campos = line.split(",");
				String nome = campos[0];
				int votos = Integer.parseInt(campos[1]);
				
				if (containerVotos.containsKey(nome)){
					int votosAteAgora = containerVotos.get(nome);
					containerVotos.put(nome, votos + votosAteAgora);
				}
				else {
					containerVotos.put(nome, votos);
				}
			
				line = br.readLine();

			}
			
			for (String key : containerVotos.keySet()) {
				System.out.println(key + ": " + containerVotos.get(key));
			}
		
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
