package learning.typecasting;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Jeep();
		Jeep j1 = (Jeep) v1;
		//This is called explicit casting
		
		Vehicle v2 = new Vehicle();
		Jeep j2 = (Jeep) v2;
		//Above line of code will throw a 'Class Cast Exception'
		
		Jeep j3 = new Jeep();
		Vehicle v3 = j3;
		//This is called implicit casting
		
	}

}
