package learning.constructor.example;

public class Employee extends Human {
	
	private String name;
	private int age;
	
	public Employee() {
		System.out.println("Inside Employee");
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age) {
		super(age+1);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", getId()=" + getId() + "]";
	}
	


}
