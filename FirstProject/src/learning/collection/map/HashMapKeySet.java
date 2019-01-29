package learning.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Jaijo");
		hm.put(2, "Aromal");
		hm.put(3, "Sajan");
		hm.put(3, "Vineeth");
		
		System.out.println(hm);
		
		Set<Integer> st = hm.keySet();		
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = hm.get(key);
			System.out.println(key + "=" + value);
		}
		

	}

}
