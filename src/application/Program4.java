package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator2;


public class Program4 {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator2 calc = new Calculator2();

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circumference: %.2f\n", calc.circumference(radius));
		System.out.printf("Volume: %.2f\n", calc.volume(radius));
		System.out.printf("PI: %.2f\n", calc.PI);
		
		sc.close();
	}
	
}
