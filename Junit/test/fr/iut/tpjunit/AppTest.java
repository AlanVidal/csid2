package fr.iut.tpjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.iut.tpjunit.App;

public class AppTest {

	private App app = new App();

	@Test
	public void testSum_1_plus1() {
		doTestSum(2, 1, 1);
	}

	@Test
	public void testSum_2_plus_2_equals_4() {
		doTestSum(10, 5, 5);
	}

	private void doTestSum(int expected, int param1, int param2) {
		// Given
		// When
		int result = app.sum(param1, param2);
		// Then
		assertEquals(expected, result);
	}

}