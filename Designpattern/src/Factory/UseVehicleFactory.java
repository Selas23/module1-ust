package Factory;

public class UseVehicleFactory {

	public static void main(String[] args) {
		
		Vehicle creta = VehicleFactory.newInstance("Creta");
		creta.start();
		
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		seltos.start();
		
		Vehicle xcross = VehicleFactory.newInstance("Xcross");
		xcross.start();
	}
	
}
