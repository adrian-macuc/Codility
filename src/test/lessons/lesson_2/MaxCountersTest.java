package test.lessons.lesson_2;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_2.MaxCounters;

@RunWith(Parameterized.class)
public class MaxCountersTest {

	private int N;
	private int[] A;
	private int[] expected;

	public MaxCountersTest(int N, int[] A, int[] expected) {
		this.N = N;
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
				// Example test
				{ 5, new int[] { 3, 4, 4, 6, 1, 4, 4 }, new int[] { 3, 2, 2, 4, 2 } },
				// Personalized tests
				{ 1, new int[] { 2, 2, 2, 2, 2, 2, 2 }, new int[] { 0 } },
				{ 3, new int[] { 1, 2, 2, 2, 2, 2, 2, 2, 4 }, new int[] { 7, 7, 7 } },
				{ 4, new int[] { 3, 2, 5, 2, 5, 4, 1, 6, 2, 3, 1 }, new int[] { 4, 4, 4, 3 } }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		MaxCounters tester = new MaxCounters();
		assertArrayEquals(expected, tester.solution(N, A));
	}
}
