package learning.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajan");
		al.add("Anish");
		al.add("Anish");
		al.add("Vineeth");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		String s = Collections.max(al);
		System.out.println(s);
		
		int a = Collections.frequency(al, "Anish");
		System.out.println(a);
		
		HashSet<String> hs = new HashSet<String>(al);
		System.out.println(hs);
		
		

	}

}
