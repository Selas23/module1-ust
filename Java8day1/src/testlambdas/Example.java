package testlambdas;



public class Example {
	
	interface factorial{
		
		double fact(int n);
	}
	
@FunctionalInterface
	interface shape{
		
		double area();
//		double perimeter();
	}
	
	interface math{
		
		double power(int b, int c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = (int n) -> {
			
			int c =1;
			
			for (int i=1;i<=n;i++) {
				
				c*=i;
			}
			return c;
			
		};
		
//		double fc=f.fact(5);
//		System.out.println(fc);
		System.out.println(f.fact(5));
		
		
									// never call run method directly, if called it will run as a normal method not as a thread runnable method
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
							//runnable is a built in method
		Runnable r = () -> {
			
			for (int i=1;i<5;i++) {
				System.out.println("in run method");
				
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
									//any functionality is possible through lambda
		math m = (int b , int e) -> {
			
			int p=1;
			for(int i=1;i<=0;i++) {
				
				p*=b;
			}
			return p;
			
		};
		
		double p = m.power(2,3);
		System.out.println(p);
		
           				//lambda is a placeholder when area( is called
		shape s = () -> {
			
						return 0.0;
		};
		
		double result = s.area();
		System.out.println(result);
		
	}

}
