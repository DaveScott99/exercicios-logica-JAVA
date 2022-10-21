import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora do dia: ");
		int hora = sc.nextInt();
		
		verificarHora(hora);
			
		sc.close();
	}

	public static void verificarHora(int hora) {
		
		if (hora >= 18 && hora <= 23) {
			System.out.println("Boa noite!");
		}
		else if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Bom dia!");
		}
		
	}
	
}
