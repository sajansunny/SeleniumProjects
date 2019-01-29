package learning.stringclass;

public class Business {
	String businessName;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return businessName;
		
	}
	public Business(String bn) {
		businessName = bn;
	}

}
