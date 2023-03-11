package source;

public class Subclass extends Parent {
	
	public Subclass() {//subclass can access the super/parent class
		// TODO Auto-generated constructor stub
		//System.out.println(a); Parent.a not visible
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
