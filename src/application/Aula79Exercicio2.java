package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Aula79Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		ContaCorrente conta;
		
		System.out.print("Enter account number: ");
		int contaNumero = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String contaNome = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char deposito = sc.next().charAt(0);
		double valor = 0;
		
		if (deposito == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
			conta = new ContaCorrente(contaNumero, contaNome, valor);
		}
		else {
			conta = new ContaCorrente(contaNumero, contaNome);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		valor = sc.nextDouble();
		
		System.out.println("Updated account data:");
		conta.deposito(valor);
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();

		System.out.println("Updated account data:");
		conta.saque(valor);
		System.out.println(conta);
		
		sc.close();

	}

}
