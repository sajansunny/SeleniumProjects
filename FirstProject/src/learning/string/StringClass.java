package learning.string;

public class StringClass {
	public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = new String ("Hello");
	String s3 = "Hello";
	
	if(s1 == s2) {
		System.out.println("s1 & s2 is same");
		
	}
	else {
		System.out.println("s1 & s2 is different");
	}
	
	if (s1 == s3) {
		System.out.println("s1 & s3 is same");
		
	}
	else {
		System.out.println("s1 & s3 is different");
		
	}
	
	if (s1.equals(s2)) {
		System.out.println("Value of s1 & s2 is same");
		
	}
	else {
		System.out.println("Value of s1 & s2 is different");
	}
	
	s2 = s2.concat(" World");
	System.out.println(s2);
	
	System.out.println(s2.substring(2,5));
	 
	 String sarr [] = s2.split(" ");
	
	System.out.println(sarr[0]);
	System.out.println(sarr[1]);
	
	System.out.println(s2.length());
	
	//s2.equalsIgnoreCase(anotherString);
		
	for (String d:sarr) {
		System.out.println(d);
	}
	
	String s4 = "Hello John, How are you? Hello Sam!";
	String s4ar [] = s4.split(" ");
	int count = 0;
	for (String d:s4ar) {
		if (d == "Hello") {
			count++;
		}
		
	}
	System.out.println(count);
	
	

	}
}