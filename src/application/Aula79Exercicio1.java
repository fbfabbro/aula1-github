package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Aula79Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter account number: ");
		int contaNumero = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String contaNome = sc.next();
		
		System.out.println("Is there na initial deposit (y/n)?");
		String deposito = sc.next();
		double valor = 0;
		
		if (deposito == "y") {
			System.out.println("Enter initial deposit value: ");
			valor = sc.nextDouble();
		}
		
		ContaCorrente conta = new ContaCorrente(contaNumero, contaNome, valor);
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println("Account " + conta.getContaNumero() + 
				           ", Holder "+ conta.getContaNome()   +
				           ", Balance " + conta.getContaSaldo());
		
		System.out.println("");
		System.out.println("Enter a deposit value: ");
		valor = sc.nextDouble();
		
		System.out.println("Updated account data:");
		conta.deposito(valor);
		System.out.println("Account data:");
		System.out.println("Account " + conta.getContaNumero() + 
				           ", Holder "+ conta.getContaNome()   +
				           ", Balance " + conta.getContaSaldo());
		
		System.out.println("");
		System.out.println("Enter a withdraw value: ");
		valor = sc.nextDouble();
		
		conta.saque(valor);
		System.out.println("Account data:");
		System.out.println("Account " + conta.getContaNumero() + 
				           ", Holder "+ conta.getContaNome()   +
				           ", Balance " + conta.getContaSaldo());
		
		
		
		
		sc.close();

	}

}
