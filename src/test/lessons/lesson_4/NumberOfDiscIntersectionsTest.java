package test.lessons.lesson_4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.lessons.lesson_4.NumberOfDiscIntersections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumberOfDiscIntersectionsTest {

	private int[] A;
	private int expected;

	public NumberOfDiscIntersectionsTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 1, 5, 2, 1, 4, 0 }, 11 },
			//Personalized tests
			{ new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE-1, Integer.MAX_VALUE - 2 }, 3 },
			{ new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE-1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE -4 }, 6 },
			{ new int[] { Integer.MAX_VALUE }, 0 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		NumberOfDiscIntersections tester = new NumberOfDiscIntersections();
		assertEquals(expected, tester.solution(A));
	}

}
