package learning.abstractclasses;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle vh = new Vehicle(); Cannot create object for abstract classes
		Vehicle v = new Jeep();
		v.drive();
	}

}
