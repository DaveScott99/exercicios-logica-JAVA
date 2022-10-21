package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String caminho = "//Users//davisantos//Desktop//produtos.txt";
		
		List<Product> lista = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			
			while (linha != null) {
				
				String[] campos = linha.split(",");
				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1]);
				Integer quantidade = Integer.parseInt(campos[2]);

				Product prod = new Product(nome, preco, quantidade);
				lista.add(prod);
				
				linha = br.readLine();
			}
			
			System.out.println("PRODUTOS:");
			for (Product p : lista) {
				System.out.println(p);
			}
			
		}
		catch(IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		

	}

}
