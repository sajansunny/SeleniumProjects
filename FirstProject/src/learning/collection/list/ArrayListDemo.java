package learning.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajan");
		al.add("Anish");
		al.add("Anish");
		al.add("Vineeth");
		
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(s);
		}

	}

}
