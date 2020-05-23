package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;



public class Aula68Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		double media = aluno.mediaFinal();
		
		System.out.println();
		System.out.printf("Final grade= %.2f\n", media);
		System.out.println(aluno.status(media));
		
		if (media < 60.0) {
			System.out.printf("Missing %.2f points", aluno.difNota(media));
		}
		
		
		
		sc.close();
		
	}

}
