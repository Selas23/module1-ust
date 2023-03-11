package oopsday3_compare;

public class Compare {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		Triangle t1 = new Triangle ();
		Triangle t2 = new Triangle ();
		
		// comparing primitives
		
		int a=10;
		int b=35;
		boolean result = a==b; //are they same/ are they equal
		
		// comparing objects: 1. comparing references 2. comparing members
		
		result = r1==r2;
		
		System.out.println(result);//false
		
		result = t1==t2;
		
		System.out.println(result);//false
		
	//	result = r1 == t1; //incompatible types
		
		Rectangle r3=r1;
		result = r3==r1;
		
		System.out.println(result);//true
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		
		System.out.println(r2.hashCode());
		
		result = r1.equals(r2);// equals() not applicable for primitives but for objects
		System.out.println(result);//false
		result= r1.equals(r3);
		System.out.println(result);//true
		
		r1.setLenghth(35.5);
		r1.setBreadth(75.45);
		
		r2.setLenghth(35.5);
		r2.setBreadth(75.45);
		
		if(r1.getBreadth() == r2.getBreadth() && r1.getLenghth() == r2.getLenghth())
			System.out.println("they have same length and breadth");
		
		else
			
			System.out.println("they don`t have same length and breadth");
		
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS3(65.5);
		
		//we are not comparing objects r1 and t1
		//we are comparing data members of 2 objects 
		
		if(r1.getLenghth() == t1.getS1()) 
			System.out.println("length and s1 are same");
		else 
			System.out.println("length and s1 are not same");
		
	}
	
}
