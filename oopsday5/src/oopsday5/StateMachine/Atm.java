package oopsday5.StateMachine;

public class Atm {

	private int a100 = 100;
	private int a50 = 100;
	private int a20 = 100;
	private int a10 = 100;
	private int a5 = 100;

	public Atm() {
		// TODO Auto-generated constructor stub
	}

	public Atm(int a100, int a50, int a20, int a10, int a5) {
		super();
		this.a100 = a100;
		this.a50 = a50;
		this.a20 = a20;
		this.a10 = a10;
		this.a5 = a5;
	}

	public int getA100() {
		return a100;
	}

	public void setA100(int a100) {
		this.a100 = a100;
	}

	public int getA50() {
		return a50;
	}

	public void setA50(int a50) {
		this.a50 = a50;
	}

	public int getA20() {
		return a20;
	}

	public void setA20(int a20) {
		this.a20 = a20;
	}

	public int getA10() {
		return a10;
	}

	public void setA10(int a10) {
		this.a10 = a10;
	}

	public int getA5() {
		return a5;
	}

	public void setA5(int a5) {
		this.a5 = a5;
	}

}
