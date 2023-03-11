package oopsday3.atm.menu;
//data object
public class Account {
	
	private int actno;
	private String name;
	private String actType;
	private double balance;
	
	public Account() { //default constructor
		// TODO Auto-generated constructor stub
	}
	
	public int getActno() { //getters and setters
		return actno;
	}

	public void setActno(int actno) {
		this.actno = actno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int actno, String name, String actType, double balance) { //Constructor using fields
//		super();
		this.actno = actno;
		this.name = name;
		this.actType = actType;
		this.balance = balance;
	}
	
	
}
