package oopsday4.composition;

public class B extends A {
	
//	B(){
//		
//		System.out.println(x+y); // 0
//	}

	public B() {
		// TODO Auto-generated constructor stub
		//super();//this will print the non parameterized constructor i.e. from A
		//System.out.println(); //not allowed because super() comes at first non-commented line
		super(10,20);//this will print parameterized constructor statement
	
	}
	
}
