package oopsday5;

public class TestFinal {
	
	int a = b;// b is forward reference, if only b=10 given in next line 
	static int b=10;
	final double pie = 3.14; //final means compile time constants
	
	public TestFinal() {
		// TODO Auto-generated constructor stub
		System.out.println();
	}
		
	public static void main(String[] args) {
		
	}
}
