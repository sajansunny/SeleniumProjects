package learning.exceptions;

public class Executor {
	public static void main(String[] args) {

		Display("Hello");
		System.err.println("Line of code after Display() call");
	}
	
	public static void Display (String s) {
		
		Print(s);
		System.err.println("Line of code after Print() call");
	}
	
	public static void Print(String s) {
		if (s == "Hello") {
		
		
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.println("Line of code inside Print()");
		
		}
		

	}

