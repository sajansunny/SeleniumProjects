package learning.exceptions.finallyexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Executor {
	public static void main(String[] args) {

		Display("E:\\hello\\a.txt");
	}
	
	public static void Display (String s) {
		
		try {
			Print(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Check another file");
			e.printStackTrace();
		}
		catch(Exception e) {
			
		}
finally {
		System.err.println("After Exception");
}
	}
	
	public static void Print(String s) throws FileNotFoundException {
		
		
	FileInputStream f = new FileInputStream(s);
	
	String s1 = null;
	if(s1.equals("Hello")) {
		
	}
		
		
		}
		

	}

