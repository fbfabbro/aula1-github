package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;




public class Program6 {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double qtd = sc.nextDouble();

		System.out.println("How many dollars will be bought? ");
		double valor = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.reais(valor, qtd));
		
		sc.close();
	}
	
}
