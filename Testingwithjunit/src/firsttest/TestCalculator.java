package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator calc; 
	
	@Before
	public void setup() throws Exception {
		calc = new Calculator();
	}
	

	@Test
	public void testPowerZero() {
		int inputBase = 0;
		int exp = 0;
		int expectedValue = 0;
		int actualValue = calc.power(inputBase, exp);
		assertEquals(expectedValue, actualValue);

	}

	@Test
	public void testPower() {

		int inputBase = 2;
		int exp = 3;
		int expectedValue1 = 8;
		int actualValue1 = calc.power(inputBase, exp);
		// assertTrue(expectedValue == actualValue);

		assertEquals(expectedValue1, actualValue1);

		// fail("Not yet implemented");

//		int a = 2;
//		int b = 3;
//		int exp1=6;
//		//int act=a*b;
//		int act= calc.mul(a, b);
//		assertTrue(exp1==act);
//	
		
	}
	
	/*
	 * @Test public void Testfact() {
	 * 
	 * int inputno = 2; int expectedno = 2; double actualno = calc.fact(inputno);
	 * assertEquals(expectedno, actualno); }
	 */
}
