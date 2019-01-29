package learning.methods.multiplereturn;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		Result rs = obj.findSumProduct(100, 200);
		System.out.println("Product = "+ rs.getProduct());
		System.out.println("Sum = "+ rs.getSum());

	}

}
