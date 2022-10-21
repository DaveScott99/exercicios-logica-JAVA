package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Approved;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Approved[] student = new Approved[n];
		
		for(int i = 0; i < n; i++) {
			
			sc.nextLine();
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			String name = sc.nextLine();
			
			double note1 = sc.nextDouble();
			double note2 = sc.nextDouble();
			
			student[i] = new Approved(name, note1, note2);
			
		}
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < student.length; i++) {
			
			double avgApproved = (student[i].getNote1() + student[i].getNote2())/2;
			
			if(avgApproved >= 6.0) {
				System.out.println(student[i].getName());
			}
			
		}
		
		sc.close();
		
	}

}