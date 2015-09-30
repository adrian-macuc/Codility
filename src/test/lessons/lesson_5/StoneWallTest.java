package test.lessons.lesson_5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.lessons.lesson_5.StoneWall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StoneWallTest {

	private int[] A;
	private int expected;

	public StoneWallTest(int[] A, int expected) {
		this.A = A;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }, 7 },			
			//Personalized tests		
			{ new int[] { 6, 5, 5, 5, 4, 5, 6, 6, 4, 5, 5, 5, 5, 5, 4, 7, 7, 7 }, 7 },
			{ new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1 }, 8 },
			{ new int[] { 5, 4, 3, 2, 1, 2, 3, 4, 5 }, 9 },
			{ new int[] { 2, 4, 6, 5, 4}, 4 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		StoneWall tester = new StoneWall();
		assertEquals(expected, tester.solution(A));
	}

}
