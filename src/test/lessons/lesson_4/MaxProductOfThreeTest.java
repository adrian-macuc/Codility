package test.lessons.lesson_4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_4.MaxProductOfThree;

@RunWith(Parameterized.class)
public class MaxProductOfThreeTest {
	
	private int[] A;
	private int expected;

	public MaxProductOfThreeTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { -3, 1, 2, 2, 5, 6 }, 60 },
			//Personalized tests
			{ new int[] { -7, -4, 1, 2, 6 }, 168 },
			{ new int[] { -2, -2, 1, 1, 1, 1, 1 }, 4 },
			{ new int[] { -100, -100,  0, 100, 100 }, 1000000 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		MaxProductOfThree tester = new MaxProductOfThree();
		assertEquals(expected, tester.solution(A));
	}

}
