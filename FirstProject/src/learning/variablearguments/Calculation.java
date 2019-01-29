package learning.variablearguments;

public class Calculation {
	private int result = 0;
	
	public int sum(int...n) {
		result = 0;
		for (int a:n) {
			result = result+a;
		}
		return result;
	}

}
