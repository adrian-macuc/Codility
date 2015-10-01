package test.lessons.lesson_3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_3.PassingCars;

@RunWith(Parameterized.class)
public class PassingCarsTest {

	private int[] A;
	private int expected;

	public PassingCarsTest(int[] A,  int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 0, 1, 0, 1, 1 }, 5 },
			//Personalized tests
			{ new int[] { 0, 0, 0 }, 0 },
			{ new int[] { 1, 1, 0, 0, 0 }, 0 },
			{ new int[] { 0, 1, 0, 1, 0, 1 }, 6 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		PassingCars tester = new PassingCars();
		assertEquals(expected, tester.solution(A));
	}

}
