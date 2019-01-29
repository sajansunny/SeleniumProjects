package learning.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Sajan",27);
		Employee e2 = new Employee("Sajan",27);
		Employee e3 = new Employee("Alwin",28);
		Employee e4 = new Employee("Anish",28);
		Employee e5=e4;
		
		ArrayList <Employee>al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		System.out.println(al);
		
		Collections.sort(al, new NameComparator());
		System.out.println(al);

	}

}
