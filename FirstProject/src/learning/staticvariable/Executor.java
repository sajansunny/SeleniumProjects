package learning.staticvariable;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name = "Sajan";
		e1.age = 27;
		e1.company = "Kott Software";
		System.out.println("Name: " +e1.name + " Age: "+e1.age+ " Company: "+e1.company);
		
		Employee e2 = new Employee();
		e2.name = "Alwin";
		e2.age = 27;
		e2.company = "Orion";
		System.out.println("Name: " +e2.name + " Age: "+e2.age+ " Company: "+e2.company);
		
		System.out.println("Name: " +e1.name + " Age: "+e1.age+ " Company: "+e1.company);
		
		//Correct way
		
		Employee e11 = new Employee();
		e1.name = "Sajan";
		e1.age = 27;
		Employee.company = "Kott Software";
		System.out.println("Name: " +e1.name + " Age: "+e1.age+ " Company: "+Employee.company);
		
		Employee e22 = new Employee();
		e2.name = "Alwin";
		e2.age = 27;
		Employee.company = "Orion";
		System.out.println("Name: " +e2.name + " Age: "+e2.age+ " Company: "+Employee.company);
		
		System.out.println("Name: " +e1.name + " Age: "+e1.age+ " Company: "+Employee.company);
		
		

	}

}
