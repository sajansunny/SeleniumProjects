package learning.stringoperations;

public class StringClass {
	
	public int count = 0;
	
	public int stringCompare (String s1, String s2) {
		String sarr [] = s1.split(" ");
		for (String d:sarr) {
			if (d.equalsIgnoreCase(s2)) {
				count++;
			}
		}
		
		return count;
		
	}

}
