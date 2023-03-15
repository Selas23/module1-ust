package testexception;

import static org.junit.Assert.*;


import org.junit.Test;

public class Tellertest {

	Teller teller = new Teller();
	
	
	
	@Test(expected= IllegalArgumentException.class)
		
	public void testValidateUnAcceptedCurrency() {
			
			Teller.validateTransaction("AUSD",100);
		}
		


	@Test(expected = InvalidTransactionAmountException.class)

	public void testValidateNegativeAmount() {
		Teller.validateTransaction("EUR",-100);
	}
}
