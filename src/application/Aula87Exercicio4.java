package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quarto;

public class Aula87Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many roons will rent ? ");
		int qtde = sc.nextInt();
		int rent = 0;
		Quarto[] vect = new Quarto[10];
		
		for (int i=0; i<qtde; i++) {
			rent = i + 1;
			System.out.println("");
			System.out.println("Rent #" + rent);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
						
			vect[room] = new Quarto(name, email, room);
			
			
		}
		
		System.out.println("");
		System.out.println("Busy roons:");
		
		
		for (int i=0; i<vect.length; i++) {
			
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		
		sc.close();

	}

}
