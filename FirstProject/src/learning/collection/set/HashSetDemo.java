package learning.collection.set;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Deepak");
		hs.add("Anish");
		hs.add("Sajan");

		
		//System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		


	}

}
