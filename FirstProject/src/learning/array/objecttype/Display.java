package learning.array.objecttype;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Sajan", 20);
		Person p2 = new Person("Sajan", 20);
		Person p3 = new Person("Sajan", 20);
		Person p4 = new Person("Sajan", 20);

		Person[] pArray = new Person[] { p1, p2, p3, p4 };
		for (Person s : pArray) {
			System.out.println(s);
		}

	}
}
