package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		double result = grossSalary - tax;
		return result;
	}

	public void increaseSalary(double percent) {
		
		grossSalary = grossSalary + (grossSalary * percent / 100);
		
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
				
	}
}
