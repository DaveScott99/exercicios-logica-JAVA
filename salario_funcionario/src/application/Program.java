package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			System.out.println();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			funcionarios.add(func);
		}
		
		System.out.print("Entre com o id do funcionario que irá ter o aumento: ");
		int idAumento = sc.nextInt();
		
		Integer pos = posicaoId(funcionarios, idAumento);
		
		if (pos == null) {
			System.out.println("Id não encontrado!!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			
			funcionarios.get(pos).aumentoSalario(porcentagem);;
		}
		
		System.out.println();
		System.out.println("::: Lista de funcioários :::");
		System.out.println();
		
		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}

		sc.close();
	}
	
	public static Integer posicaoId(List<Funcionario> funcionario, int id) {
		for (int i = 0; i < funcionario.size(); i++) {
			if (funcionario.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
