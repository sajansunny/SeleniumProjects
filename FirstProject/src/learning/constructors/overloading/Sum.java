package learning.constructors.overloading;

public class Sum {
	public Sum (int a, int b){
		int c = a+b;
		System.out.println("The Sum is " + c);
	}
	public Sum (int a, int b, int c){
		int d = a+b+c;
		System.out.println("The Sum is " + d);
	}

}
