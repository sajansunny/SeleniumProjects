package learning.interfacesample;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Jeep();
		v1.display();
		v1.drive();
		
		Vehicle v2 = new Car();
		v2.display();
		v2.drive();

	}

}
