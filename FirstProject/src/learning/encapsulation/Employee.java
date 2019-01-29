package learning.encapsulation;

public class Employee {
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;

	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public String getName() {
		return name;
	}


	/*public void setAge(int age) {
		this.age = age;
	}*/
	public int getAge() {
		return age;
	}
	
	

}
