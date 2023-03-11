package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car tuc = new Car("yellow",40000000,"toyota","innova");//tuc is a car type
		
		System.out.println(tuc.hashCode());
		System.out.println(Integer.toHexString(tuc.hashCode()));
		
		System.out.println(tuc);
		/*
		 * tuc.setColor("Red"); 
		 * tuc.setPrice(5000000); 
		 * tuc.setBrand("tucson");
		 * tuc.setModel("SUV");
		 */
		
		
		
		
		/*
		 * tuc.color = "Blue"; tuc.price = 4000000; tuc.brand = "Tucson"; tuc.model =
		 * "Sx";
		 * 
		 * System.out.println(tuc.color); System.out.println(tuc.price);
		 * System.out.println(tuc.brand); System.out.println(tuc.model);
		 */
		
		Car bmw = new Car("black",20000000,"bmw","sedan");
		
		System.out.println(bmw.hashCode());
		System.out.println(Integer.toHexString(bmw.hashCode()));
		
		System.out.println(bmw);
		
		/*
		 * bmw.setColor("white"); bmw.setPrice(10000000); bmw.setBrand("bmw");
		 * bmw.setModel("luxury sedan");
		 */
		
		
		
		
		/*
		 * bmw.color = "white"; bmw.price = 10000000; bmw.brand = "bmw"; bmw.model =
		 * "luxury sedan";
		 * 
		 * System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */
		
		// tuc = "Hello"; error
		// bmw = tuc;
		
	}

}
