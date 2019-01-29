package learning.finalvariable;

public class Person {
	
	//public final int id; - A final variable needs to be initialized at the time of declaration.
	public String name;
	public int age;
	public final int yob = 1991;
	
	
	public void setDetails (String s, int a, int y) {
		name = s;
		age = a;
		//yob = y; - - A final variable can only be initialized once.
	}
	

}
