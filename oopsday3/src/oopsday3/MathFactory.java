package oopsday3;

public class MathFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathIface no = new MathsImp();
		no.factorial(5);
		no.prime(7);
		no.mul(5, 10);
		no.add(3,4);
		
		
	}

}
