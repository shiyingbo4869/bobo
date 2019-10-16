package tut4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalcTest {
	private Calc calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calc();
	}

	@Test
	void testAdd() {
		int a=1;
		int b=1;
		int result=calc.add(a,b);
		assertEquals(result,2);
	}
	@Test
	void testSub() {
		int a=1;
		int b=1;
		int result=calc.sub(a,b);
		assertEquals(result,0);
	}
}
