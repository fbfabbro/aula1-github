package util;

public class Calculator2 {

	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		
		double result = 2.0 * PI * radius;
		return result;
	}
	
	public double volume(double radius) {
	
		double result = 4.0 * PI * Math.pow(radius, 3) / 3.0;
		return result;
	}
}
