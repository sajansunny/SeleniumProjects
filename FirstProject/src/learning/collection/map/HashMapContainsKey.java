package learning.collection.map;

import java.util.HashMap;

public class HashMapContainsKey {

	public static HashMap<String, Integer> stringOccurrence(String sent) {
		
		HashMap <String,Integer>hm = new HashMap <String, Integer>();
		
		String []sarr = sent.split(" ");
		for(String s:sarr) {
			if(hm.containsKey(s)) {
				Integer value= hm.get(s);
				hm.put(s, value+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm1 =  stringOccurrence("the book is the dawn");
		System.out.println(hm1);
	}

}
