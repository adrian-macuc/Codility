package test.lessons.lesson_4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_4.Triangle;

@RunWith(Parameterized.class)
public class TriangleTest {

	private int[] A;
	private int expected;

	public TriangleTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 10, 2, 5, 1, 8, 20 }, 1 },
			{ new int[] { 10, 50, 5, 1 }, 0 },
			//Personalized tests
			{new  int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE }, 1}
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Triangle tester = new Triangle();
		assertEquals(expected, tester.solution(A));
	}

}
