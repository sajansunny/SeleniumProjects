package learning.exceptions.throwsexample;

public class Executor {
	public static void main(String[] args) throws Exception{

		Display("Hello");
		System.out.println("Line of code after Display() call");
	}
	
	public static void Display (String s) throws Exception{
		
		Print(s);
		System.out.println("Line of code after Print() call");
	}
	
	public static void Print(String s) throws Exception {
		if (s == "Hello") {
		
				throw new Exception();
				
			}
		System.out.println("Line of code inside Print() after exception line");
		}
		
		
		}
		



