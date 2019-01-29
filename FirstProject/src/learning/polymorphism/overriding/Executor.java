package learning.polymorphism.overriding;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep jp = new Jeep();
		jp.display();
		
		Vehicle vh = new Vehicle();
		vh.display();
		
		Vehicle vh1 = new Jeep();
		//Drive method inside Jeep class won't be available while calling with 'vh1.' - Runtime polymorphism
	}

}
