package application;

import entities.CalcularArea;

public class Program {

	public static void main(String[] args) {

		System.out.println("Area do quadrado: " + CalcularArea.area(3));
		System.out.println("Area do retangulo: " + CalcularArea.area(5d, 5d));
		System.out.println("Area do trapezio: " + CalcularArea.area(7, 8, 9));
		System.out.println("Area do losango: " + CalcularArea.area(5f, 5f));
		
	}

}
