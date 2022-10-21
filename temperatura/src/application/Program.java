package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<>();
		List<String> mes = new ArrayList<>() {{
			add("Janeiro");
			add("Fevereiro");
			add("Março");
			add("Abril");
			add("Maio");
			add("Junho");
		}};
		
		System.out.println("Insira a temperatura dos 6 primeiros meses: ");
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Temperatura " + (i+ 1) + "º mes: ");
			double temp = sc.nextDouble();
			temperaturas.add(temp);
		}
		
		double mediaTemperatura = 0.0;
		
		for (Double t : temperaturas) {
			mediaTemperatura += t / temperaturas.size();
		}
		
		System.out.println();
		System.out.println("Média de temperatura: " + String.format("%.1f", mediaTemperatura));
		System.out.println();
		System.out.println("Meses acima da média: ");
		
		for (int i = 0; i < temperaturas.size(); i++) {
			if (temperaturas.get(i) > mediaTemperatura) {
				System.out.println(mes.get(i) + " - " + temperaturas.get(i));
			}
		}

		sc.close();
	}

}
