package application;

import java.util.Scanner;

public class Aula97Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a quantidade de linhas e colunas da matriz: ");
		int m = ler.nextInt();
		int n = ler.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite valores da matriz");
		
		for (int i=0; i<mat.length; i++ ) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = ler.nextInt();
			}
			
		}
		
		for (int i=0; i<mat.length; i++ ) {
			System.out.println();
			for (int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
		}
		
		System.out.println();
		System.out.print("Escolha um numero: ");
		int x = ler.nextInt();
		
		for (int i=0; i<mat.length; i++ ) {
			System.out.println();
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j + 1 < mat[i].length) {
						System.out.println("Rigth: " + mat[i][j+1]);
					}
					if (i - 1 >=0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i + 1 < mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
										
				}

			}
			
		}
		
		
		
		ler.close();

	}

}
