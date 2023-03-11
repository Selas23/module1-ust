package source;

public class NonSubClass {
	
	public NonSubClass() { //access only through objects
		// TODO Auto-generated constructor stub
		Parent p = new Parent();
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
		
	}

}
