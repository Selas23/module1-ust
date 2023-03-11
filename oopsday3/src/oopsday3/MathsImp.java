package oopsday3;

public class MathsImp implements MathIface {

	//private double number;

//	public double getNumber() {
//		return number;
//	}
//
//	public void setNumber(double number) {
//		this.number = number;
//	}
//
//	public MathsImp(double number) {
//		super();
//		this.number = number;
//	}
	public MathsImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void factorial(int number) {
		// TODO Auto-generated method stub
		int a=1;
		
		for(int i=1;i<=number;i++) {
			a *= i;						
		}
		System.out.println(a);
			
	}

	@Override
	public void prime(int number) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 2; i <= (number / 2); i++) {

			if (number % 2 == 0) {

				count++;
				break;
			}
			

		}
		if (count > 0)
			System.out.println("no. is not prime");
		else
			System.out.println("no. is prime");
	}
	
	public void mul(int i,int j) {
		int n;
		n=i*j;
		System.out.println(n);
	}



public void add(int i,int j) {
	int n;
	n=i+j;
	System.out.println(n);
}



}
