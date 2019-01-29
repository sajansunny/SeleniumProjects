package learning.collection.set;

import java.util.HashSet;

public class HashSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Sajan",27);
		Employee e2 = new Employee("Sajan",27);
		Employee e3 = new Employee("Alwin",28);
		Employee e4 = new Employee("Anish",28);
		Employee e5=e4;
		Human h = new Human();
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		
		System.out.println(hs);
		

	}

}
