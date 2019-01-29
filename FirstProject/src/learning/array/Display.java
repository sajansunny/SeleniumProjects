package learning.array;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name nm = new Name();
		for(int i=0; i<nm.name.length; i++) {
			System.out.println(nm.name[i]);
		}
		System.out.println("\n");
		for (String n: nm.name) {
			System.out.println(n);
		}

	}

}
