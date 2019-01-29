package learning.methods;

public class GetSetDetails {

	public static void main(String[] args) {
		UserDetails ud1 = new UserDetails();
		ud1.setUserDetails("Sajan",26,"Thrissur");
		System.out.println(ud1.getUserDetails());
		
		UserDetails ud2 = new UserDetails();
		ud2.setUserDetails("Anish",27,"Kottayam");
		System.out.println(ud2.getUserDetails());
	}

}
