package learning.methods;

public class UserDetails {
	String Name;
	int Age;
	static String Place;
		
	public void setUserDetails(String x, int y, String z) {
		Name = x;
		Age = y;
		UserDetails.Place = z;
	}
	
	public String getUserDetails() {
		String Det = "User " + Name + " is " + Age + " years old now." + " And he's from " + UserDetails.Place;
		return Det;
	}

}
