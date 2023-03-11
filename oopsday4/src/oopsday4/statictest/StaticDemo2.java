package oopsday4.statictest;

public class StaticDemo2 {
	
static int a;
	
	public static void method() {
		
		System.out.println("from method "+ a); //Cannot make a static reference to the non-static field a
		//method() is non-static
		
	}
	
	public void method2() {
		System.out.println(a);
		method();
	}
	
}
