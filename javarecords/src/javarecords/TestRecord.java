package javarecords;

public class TestRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person John = new Person ("John", 30);
		Person Sarah = new Person ("Sarah",25);
		System.out.println(John.name()); //prints John
		System.out.println(Sarah.age());// prints 25
		
	}

}
