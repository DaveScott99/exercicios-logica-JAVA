package util;

public class CurrencyConverter {

	public static double convert(double price, double dollars) {
		
		double convert = price * dollars; 
		double percentage = convert * 6/100;
		
		return convert + percentage;
	}
	
}
