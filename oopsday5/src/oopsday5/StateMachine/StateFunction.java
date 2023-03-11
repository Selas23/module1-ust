package oopsday5.StateMachine;

public class StateFunction {

	Atm A = new Atm();
	int note;

	public void withdraw100(int amount, int c100) {
		if (c100 <= A.getA100()) {
			note = c100 * 100;

			int i = A.getA100();
			A.setA100(i - c100);
			System.out.println(note);

			if (note == amount) {
				System.exit(0);
			}
		} else {
			System.out.println("Insufficient Fund");

		}

	}

	public void withdraw50(int amount, int c50) {

		if (c50 <= A.getA50()) {
			note += c50 * 50;
			int i = A.getA50();
			A.setA50(i - c50);
			System.out.println(note);

		} else {

			System.out.println("insufficient fund");
		}
	}

	public void withdraw20(int amount, int c20) {

		if (c20 <= A.getA20()) {
			note += c20 * 20;
			int i = A.getA20();
			A.setA20(i - c20);
			System.out.println(note);

		} else {

			System.out.println("insufficient fund");
		}
	}

	public void withdraw10(int amount, int c10) {

		if (c10 <= A.getA10()) {
			note += c10 * 10;
			int i = A.getA10();
			A.setA10(i - c10);
			System.out.println(note);

		} else {

			System.out.println("insufficient fund");
		}
	}

	public void withdraw5(int amount, int c5) {

		if (c5 <= A.getA5()) {
			note += c5 * 5;
			int i = A.getA5();
			A.setA5(i - c5);
			System.out.println(note);

		} else {

			System.out.println("insufficient fund");
		}
	}

}
