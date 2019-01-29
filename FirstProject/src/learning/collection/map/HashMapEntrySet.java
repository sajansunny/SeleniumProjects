package learning.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Jaijo");
		hm.put(2, "Aromal");
		hm.put(3, "Sajan");
		hm.put(4, "Alwin");
		
		Set<Entry<Integer, String>> s = hm.entrySet();
		Iterator<Entry<Integer, String>> it = s.iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		

	}

}
