package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car tuc = new Car();//tuc is a car type tuc is object
		tuc.color = "Blue";
		tuc.price = 4000000;
		tuc.brand = "Tucson";
		tuc.model = "Sx";
		
		System.out.println(tuc.color);
		System.out.println(tuc.price);
		System.out.println(tuc.brand);
		System.out.println(tuc.model);
		
		Car bmw = new Car();
		bmw.color = "white";
		bmw.price = 10000000;
		bmw.brand = "bmw";
		bmw.model = "luxury sedan";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		// tuc = "Hello"; error
		// bmw = tuc;
		
	}

}
