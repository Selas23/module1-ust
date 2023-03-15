package firsttest;

public class Calculator {

//	public int power(int b, int e) {
//
//		return b * e;
//
//	}

//	public int power(int b, int e) {
//
//		return b * b * b;
//
//	}

	// bug- unexpected output, may have never repeated,may work or may not work

	public int power(int b, int e) {

		// return Math.pow(b, e);
		// refactoring-rewriting the code to pass the test
		int p = 1;
		int i = 1;
		if (b == 0 || e == 0) {
			return 0;
		}

		else
			while (i <= e) {
				p *= b;
			}

		return p;
	}

	public int mul(int b, int e) {

		return b * e;

	}

//	public int fib(int n) {
//		
//		int a=0;
//		int b=1;
//		System.out.println(a+" "+b+" ");
//		for(int i=2;i<n;i++){
//	     int c=a+b;
//	    return  c;
//	     a=b;
//	     b=c;
//		}
//		
//		
//	}

	public int fact(int n) {
		int a = 1;
		if (n == 0 || n == 1) {
			return 1;
		} else {
			for (int i = 2; i <= n; i++) {
				a*=i;
			}
			return a;
		}
	}

}
