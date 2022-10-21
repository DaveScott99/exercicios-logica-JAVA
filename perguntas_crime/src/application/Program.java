package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("::: INTERROGATÓRIO :::");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
	
		List<String> respostas = new ArrayList<>();
		
		String[] perguntas = {
				"Telefonou para Vítima? ",
				"Esteve no local do crime? ",
				"Mora perto da vítima? ",
				"Devia para vítima? ",
				"Já trabalhou com a vítma? "
		};
		
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i]);
			System.out.print("Resposta: (Sim/Nao) ");
			String resp = sc.nextLine().toUpperCase();
			System.out.println();
			respostas.add(resp);
		}
		
		int contSim = 0;
		int contNao = 0;
		
		for (String r : respostas) {
			
			if (r.contains("SIM")) {
				contSim++;
			}
			else {
				contNao++;
			}
			
		}
		
		switch(contSim) {
			case 2:
				System.out.println("SUSPEITO!!");
				break;
			case 3, 4:
				System.out.println("CÚMPLICE!!");
				break;
			case 5:
				System.out.println("ASSASINO!!");
				break;
			default:
				System.out.println("INOCENTE!!");
				break;
		}
		
		sc.close();
	}

}
