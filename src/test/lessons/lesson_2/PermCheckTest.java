package test.lessons.lesson_2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_2.PermCheck;

@RunWith(Parameterized.class)
public class PermCheckTest {

	private int[] A;
	private int expected;

	public PermCheckTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 4, 1, 3, 2 }, 1 },
			//Personalized tests
			{ new int[] { 5, 4, 3, 2, 1 }, 1 },
			{ new int[] { 4 }, 0 },
			{ new int[] { 2, 2, 2 }, 0 },
			{ new int[] { 4, 3, 2, 1, 1 }, 0 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		PermCheck tester = new PermCheck();
		assertEquals(expected, tester.solution(A));
	}

}
