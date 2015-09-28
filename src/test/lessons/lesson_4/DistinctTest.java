package test.lessons.lesson_4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.lessons.lesson_4.Distinct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DistinctTest {

	private int[] A;
	private int expected;

	public DistinctTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 2, 1, 1, 2, 3, 1 }, 3 },
			//Personalized tests
			{ new int[] { 1, 1, 1, 1, 1, 1 }, 1 },
			{ new int[] { 5 }, 1 },
			{ new int[] {  }, 0 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Distinct tester = new Distinct();
		assertEquals(expected, tester.solution(A));
	}

}
