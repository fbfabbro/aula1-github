package application;

import java.util.ArrayList;
import java.util.List;

public class Program12 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		System.out.println(list.size());

		list.remove("Anna");
		list.remove(1);
		
		int count = 0;
		for (String x : list) {
			System.out.println(count + " " + x);
			count++;
		}
		
	}

}
