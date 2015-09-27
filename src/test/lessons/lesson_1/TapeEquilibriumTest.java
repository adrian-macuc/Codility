package test.lessons.lesson_1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_1.TapeEquilibrium;


@RunWith(Parameterized.class)
public class TapeEquilibriumTest {

	private int[] input;
	private int expected;

	public TapeEquilibriumTest(int[] input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 3, 1, 2, 4, 3 }, 1 },
			//Personalized tests
			{ new int[] { 4, 7, 10, 4, 5, 8, 3, 4 }, 3 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void testSolution() {
		TapeEquilibrium tester = new TapeEquilibrium();
		assertEquals(expected, tester.solution(input));
	}

}
