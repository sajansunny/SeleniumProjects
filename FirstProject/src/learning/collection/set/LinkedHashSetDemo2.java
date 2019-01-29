package learning.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
	
	public static String removeDuplicates(String sent) {
		String sarr[]= sent.split(" ");
		LinkedHashSet lhs = new LinkedHashSet();
		for (String d:sarr) {
			lhs.add(d);
			
		}
		
		String newword="";
		Iterator it = lhs.iterator();
		boolean addSpace = false; 
		
		while(it.hasNext()) {
			if(!addSpace) {
				newword = newword + (String)it.next();
				addSpace = true;
			}
			else {
				newword = newword +" "+ (String)it.next();
			}
			
		}
		
		return newword;
	}

	public static void main(String[] args) {
		String dstr = removeDuplicates("the book is the bible");
		System.out.println(dstr);
		
	}

}
