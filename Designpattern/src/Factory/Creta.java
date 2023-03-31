package Factory;

public class Creta implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("started......."+getClass());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stopped......."+getClass());
	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("Palm Palm....."+getClass());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("it`s moving......"+getClass());
	}

}
