import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

	@org.junit.jupiter.api.Test
	void isLeap() {
		assertTrue(new LeapYearCalculator().isLeap(2000));
	}
}