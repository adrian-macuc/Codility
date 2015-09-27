package tests.lessons.lesson_2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_2.FrogRiverOne;

@RunWith(Parameterized.class)
public class FrogRiverOneTest {

	private int[] A;
	private int X;
	private int expected;

	public FrogRiverOneTest(int[] A, int X, int expected) {
		this.A = A;
		this.X = X;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 5, 6 },
			//Personalized tests
			{ new int[] { 1 }, 1, 0 },
			{ new int[] { 2, 2, 2, 2}, 3, -1 },
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		FrogRiverOne tester = new FrogRiverOne();
		assertEquals(expected, tester.solution(A, X));
	}
}
