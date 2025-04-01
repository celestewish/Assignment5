import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintPrimesTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsDivisible() {
		
	}

	@Test
	void testPrintPrimes() {
		String myString = PrintPrimes.printPrimes(0);
		assertEquals("", myString);
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
