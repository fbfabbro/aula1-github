package application;

import java.util.Locale;
import java.util.Scanner;


public class Program3 {

	public static double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		
		double result = 2.0 * PI * radius;
		return result;
	}
	
	public static double volume(double radius) {
	
		double result = 4.0 * PI * Math.pow(radius, 3) / 3.0;
		return result;
	}
}
