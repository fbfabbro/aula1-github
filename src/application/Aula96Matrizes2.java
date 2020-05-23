package application;

import java.util.Scanner;

public class Aula96Matrizes2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] tabela = new int [n][n];
		
		for (int linha = 0; linha < tabela.length; linha++) {
			for (int coluna = 0; coluna < tabela[linha].length; coluna++) {
				tabela[linha][coluna] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Main diagonal:");
		for (int linha=0; linha < tabela.length; linha++) {
			System.out.print(tabela[linha][linha] + " ");
			
		}
		
		System.out.println();
		int cont = 0;
		
		for (int linha =0;linha<tabela.length; linha++) {
			for (int coluna =0;coluna<tabela[linha].length; coluna++) {
				if (tabela[linha][coluna] < 0) {
					cont++;
				}
			}
			
			
		}
		System.out.println("Negative numbers: " + cont);
		sc.close();
	}

}
