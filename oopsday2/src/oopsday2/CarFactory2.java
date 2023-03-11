package oopsday2;

public class CarFactory2 {
	
	public static void main (String [] args) {
		
		//CarIface car = new Cariface();
		
		//CarIface car; // ref-not refering to any object
		
		CarIface car = new Car (5000,500,0,false); //interface always on left, so they can call method but can`t see the method implementation
		
		System.out.println(car);
		
		car.start();
		car.honk();
		car.move();
		car.stop();
		
		System.out.println(car);
		
		
	}
}
