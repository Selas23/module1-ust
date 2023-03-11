package testlambdas;

public interface TextInterface { //explicitly making it an interface

	
	public double method(); // n no. of default methods are possible
	// default methods and static methods
	
	public default void method2() {
		System.out.println("from methods");
	}
	public static void method3() {
		
		System.out.println("from static method");
	}
}
