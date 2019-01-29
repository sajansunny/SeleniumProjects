package learning.constructor.example;

public class Human {
	
	private int id;
	

	public Human(int id) {
		super();
		this.id = id;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Human() {
		
		System.out.println("Inside Human");
		
	}
	

}
