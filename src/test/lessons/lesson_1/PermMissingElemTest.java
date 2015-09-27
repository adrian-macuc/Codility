package test.lessons.lesson_1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_1.PermMissingElem;

@RunWith(Parameterized.class)
public class PermMissingElemTest {

	private int[] input;
	private int expected;

	public PermMissingElemTest(int[] input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 2, 3, 1, 5 }, 4 },
			//Personalized tests
			{ new int[] { 1, 2, 4, 5 }, 3 },
			{ new int[] { 11, 9, 8, 7, 6, 5, 4, 3, 2, 1 }, 10}
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		PermMissingElem tester = new PermMissingElem();
		assertEquals(expected, tester.solution(input));
	}

}
