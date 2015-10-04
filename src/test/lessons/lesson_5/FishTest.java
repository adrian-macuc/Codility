package test.lessons.lesson_5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_5.Fish;

@RunWith(Parameterized.class)
public class FishTest {

	private int[] A;
	private int[] B;
	private int expected;

	public FishTest(int[] A, int[] B, int expected) {
		this.A = A;
		this.B = B;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
				// Example test
				{ new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }, 2 },
				// Personalized tests
				{ new int[] { 4, 3, 2, 7, 5, 6, 8 }, new int[] { 0, 1, 0, 1, 0, 0, 0 }, 2 },
				{ new int[] { 4, 7, 5, 3, 2, 1 }, new int[] { 0, 1, 0, 1, 0, 0 }, 3 },				
				{ new int[] { 5, 3, 2, 4, 1, 6, 7 }, new int[] { 0, 1, 0, 1, 0, 0, 0, 1 }, 3 }				
		};

		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Fish tester = new Fish();
		assertEquals(expected, tester.solution(A, B));
	}

}
