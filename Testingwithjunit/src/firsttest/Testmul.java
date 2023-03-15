package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testmul {

	static Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each class");
	}

	@Test
	public void testMul() {
		
		int n=5;
		int m=4;
		int expectedno = 20;
		int actualno= calc.mul(n,m);
		assertEquals(expectedno,actualno);
		
		//fail("Not yet implemented");
	}

}
