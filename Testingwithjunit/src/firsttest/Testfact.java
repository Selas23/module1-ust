package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testfact {

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
	public void testFact() {
		
		int n=5;
		int expectedno = 120;
		int actualno= calc.fact(n);
		assertEquals(expectedno,actualno);
		
		//fail("Not yet implemented");
	}
	
//	@Test
//	public void testFact1() {
//		fail("Not yet implemented");
//	}

}
