package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car tuc = new Car("yellow",40000000,"toyota","innova");//tuc is a car type
		
		tuc.start();
		tuc.changeGear(1);
		tuc.stop();
		
		Car bmw = new Car("black",20000000,"bmw","sedan");
		
		bmw.start();
		bmw.changeGear(1);
		bmw.stop();
		
	}

}
