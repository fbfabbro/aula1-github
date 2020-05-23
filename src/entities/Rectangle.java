package entities;

public class Rectangle {

	public double width;
	public double heigth;
	
	public double area() {
		
		double result = width * heigth;
		return result;
	}

	public double perimeter() {
		
		double result = 2 * (width + heigth);
		return result;
	}
	
	public double diagonal() {
		
		double result = Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
		return result;
	}
}
