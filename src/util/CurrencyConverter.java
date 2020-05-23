package util;

public class CurrencyConverter {

	public static final int IOF = 6;
	
	public static double reais(double valor, double qtd) {
		
		double adicional = valor * qtd * IOF / 100;
		double result = adicional + (valor * qtd);
		return result;
	}
	
	
}
