package application;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees2;

public class Aula94Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Employees2> list = new ArrayList<Employees2>();
				
		
		System.out.print("How many employees will be registered ? ");
		int qtd = ler.nextInt();
		
		for (int i=0; i<qtd ; i++) {
			
			System.out.println("");			
			System.out.println("Employee #" + (i+1));
			
			System.out.print("Id: ");
			int id = ler.nextInt();
			ler.nextLine();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = ler.nextInt();
				ler.nextLine();
			}
			
			
			
			System.out.print("Name: ");
			String name = ler.nextLine();

			System.out.print("Salary: ");
			Double salary = ler.nextDouble();
			
			list.add(new Employees2(id, name, salary));
					
		}
		
		System.out.println("");
		System.out.println("Enter the emplyoee id that will have salary increase: ");
		int id = ler.nextInt();
		Employees2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = ler.nextDouble();
			emp.increaseSalary(percentage);
		}
			
		System.out.println();
		System.out.println("List of employees:");
		for (Employees2 obj : list) {
			
//			System.out.println(obj.toString());
			System.out.println(obj);
		}

		
		
		
		ler.close();
		
	}

	public static boolean hasId(List<Employees2> list, int id) {
		Employees2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	
}
