package oopsday2;

public class Car implements CarIface {
	
	private double fuel;
	private double battery;
	private double kilometersRun;
	private boolean engineStatus;
	

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus=engineStatus;
	}
	
	
	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometersRun=" + kilometersRun + ", engineStatus="
				+ engineStatus + "]";
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
		if(engineStatus== false && fuel > 1000 && battery > 100){
	
		System.out.println("engine starting...");
		engineStatus=true;
		}
	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("pa...pa...pam...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(engineStatus) {
			for(int i=0;i<50;i++) {
				System.out.println("car is moving");
				fuel= fuel-10;
				battery= battery-2;
				kilometersRun++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	public Car(double fuel, double battery, double kilometersRun, boolean engineStatus) {
		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilometersRun = kilometersRun;
		this.engineStatus = engineStatus;
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car is stop");
		this.engineStatus= false;
	}

}
