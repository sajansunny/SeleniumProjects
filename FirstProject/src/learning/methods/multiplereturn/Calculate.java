package learning.methods.multiplereturn;

public class Calculate {
	
	public Result findSumProduct (int x, int y) {
		float Sum = x+y;
		float Product = x*y;
		
		Result obj = new Result();
		obj.setSum(Sum);
		obj.setProduct(Product);
		return obj;
		
		
	}

}
