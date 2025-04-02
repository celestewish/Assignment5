import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintPrimesTest {

	//tests the first path I included by not going inside of the loop
	@Test
	void testPrintPrimes1() {
		String myString = PrintPrimes.printPrimes(0);
		assertEquals(" 2", myString);
	}
	//runs through every edge, but doesn't touch every path
	@Test
	void testPrintPrimes2() {
		String myString = PrintPrimes.printPrimes(2);
		assertEquals(" 2 3", myString);
	}
}
