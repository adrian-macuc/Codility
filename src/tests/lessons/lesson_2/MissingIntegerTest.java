package tests.lessons.lesson_2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_2.MissingInteger;

@RunWith(Parameterized.class)
public class MissingIntegerTest {

	private int[] A;
	private int expected;

	public MissingIntegerTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 1, 3, 6, 4, 1, 2 }, 5 },
			//Personalized tests
			{ new int[] { -1, -2, -3, -2, -4 }, 1 },
			{ new int[] { 2, 3, 1001 }, 1 },
			{ new int[] { 1, 2, 1001, 3, 5 }, 4 },
			{ new int[] { 1 }, 2 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		MissingInteger tester = new MissingInteger();
		assertEquals(expected, tester.solution(A));
	}

}
