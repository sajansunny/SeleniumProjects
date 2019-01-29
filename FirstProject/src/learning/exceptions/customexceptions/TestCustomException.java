package learning.exceptions.customexceptions;

public class TestCustomException {
	static void validate(String userName) throws InvalidUserNameException{
		if (userName != "Sajan") {
			throw new InvalidUserNameException("Invalid Username");
		}
		else {
			System.out.println("Welcome Sajan");
		}
	}

	public static void main(String[] args) {
		try {
			validate("Sajan");
			System.out.println("Line of code after validate call");
		}
		catch (Exception e){
			System.out.println("Exception occurred: "+e);
		}
		
		System.out.println("Line of code after try block");

	}

}
