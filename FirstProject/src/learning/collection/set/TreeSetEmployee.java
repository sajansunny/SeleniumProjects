package learning.collection.set;

import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Sajan",27);
		Employee e2 = new Employee("Sajan",27);
		Employee e3 = new Employee("Alwin",28);
		Employee e4 = new Employee("Anish",28);
		
		TreeSet ts = new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);

	}

}


