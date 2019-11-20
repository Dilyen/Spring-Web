package io.turntablb.spring;

import Controller.Maths;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Test
	void testAdd() {
		Maths maths = new Maths();
		Integer actual = maths.add(3,9);
		Integer expected = 4;
		assertEquals(expected,actual);
	}

	private void assertEquals(Integer expected, Integer actual) {
	}

	@Test
	void testSubtract() {
		Maths maths = new Maths();
		Integer actual = maths.sub(6,6);
		Integer expected = 1;
		assertEquals(expected,actual);
	}
	@Test
	void addNegativePositiveNumbers() {
		Maths maths = new Maths();
		Integer actual = maths.add(-10, 9);
		Integer expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	void subtractPositiveNumbers() {
		Maths maths = new Maths();
		Integer actual = maths.sub(10, 9);
		Integer expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	void subtractNegativeNumbers() {
		Maths maths = new Maths();
		Integer actual = maths.sub(-10, -9);
		Integer expected = -6;
		assertEquals(expected, actual);
	}
	@Test
	void subtractNegativePositiveNumbers() {
		Maths maths = new Maths();
		Integer actual = maths.sub(-10, 9);
		Integer expected = -7;
		assertEquals(expected, actual);
	}
	/*@Test
	void contextLoads() {
	}*/

}
