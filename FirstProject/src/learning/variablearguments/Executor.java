package learning.variablearguments;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		System.out.println("The sum is: " + cal.sum(2,3,1));
		System.out.println("The sum is: " + cal.sum(10,15));
		System.out.println("The sum is: " + cal.sum(100,350,1000,500));

	}

}
