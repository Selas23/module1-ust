package oopsday3.atm.menu;

import oopsday3.atm.exceptions.*;

public class BankOfAmerica2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankOfAmerica2() { // default constructor
		// TODO Auto-generated constructor stub
	}

	public BankOfAmerica2(Account[] accounts) { // constructor created from source
		super();
		this.accounts = accounts;
	}

	public void addAccount(Account account) {

		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed ");

		// accounts[this.accountIndex++]=account;

	}

//	public Account transactionAccount(Account account) {
//		
//		return account;
//		
//	}

	@Override // created when the class created in connection with interface
	public double withdraw(double amount, int actno) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getActno() == actno) {
				
				if(accounts[i].getBalance()<amount) {
					
					throw new InsufficientFundsException("Insufficient fund");
				}

				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}

		}

		return tempBal;
	}

	@Override
	public double deposit(double amount, int acctno) throws NegativeAmountException {
		// TODO Auto-generated method stub
		double tempBal = 0;
		if (amount < 0) {
			throw new NegativeAmountException("Negativenum");
		}
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getActno() == acctno) {

				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}

		}

		return tempBal;
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		double tempBal=0;
		for(int i=0;i<accounts.length;i++) {
			
			if(accounts[i].getActno() == actno) {
				
				tempBal = accounts[i].getBalance();
				break;
			}
			
		}

	return tempBal;
	}
	public void displayAccount(int actno) {
for(int i=0;i<accounts.length;i++) {
			
			if(accounts[i].getActno() == actno) {
				
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
				break;
			}
			
		}
	}
}
