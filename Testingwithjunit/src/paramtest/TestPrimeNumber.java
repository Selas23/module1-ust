package paramtest;

import static org.junit.Assert.*;
//import org.junit.
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;

@RunWith(Parameterized.class)

public class TestPrimeNumber {

	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber primeNumber;// object ref

	// fail("Not yet implemented");

	@Before
	public void initialize() {

		primeNumber = new PrimeNumber();

	}

	public TestPrimeNumber(Integer inputNumber, Boolean expectedResult) {
		// TODO Auto-generated constructor stub
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;

	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true },
				{ 24, false }, { 10, true } });
	}

	@Test
	public void testValidator() {

		System.out.println("Parameterized number is" + inputNumber);
		assertEquals(expectedResult, primeNumber.validate(inputNumber));
	}
}
