package test.lessons.lesson_3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_3.MinAvgTwoSlice;

@RunWith(Parameterized.class)
public class MinAvgTwoSliceTest {

	private int[] A;
	private int expected;

	public MinAvgTwoSliceTest(int[] A,  int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 4, 2, 2, 5, 1, 5, 8 }, 1 },
			//Personalized tests
			{ new int[] { 2, 2, 2, 4, 0 }, 0 },
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		MinAvgTwoSlice tester = new MinAvgTwoSlice();
		assertEquals(expected, tester.solution(A));
	}
}
