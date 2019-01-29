package learning.variables;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person x = new Person();
		x.name = "Sajan";
		x.age = 27;
		
		Person y = new Person();
		y.name = "Anish";
		y.age = 28;
		
		x.displayProperties(x);
		y.displayProperties(y);
		

	}

}
