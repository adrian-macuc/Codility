package test.lessons.lesson_1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_1.FrogImp;

@RunWith(Parameterized.class)
public class FrogImpTest {

	private int start;
	private int end;
	private int distance;
	private int expected;

	public FrogImpTest(int start, int end, int distance, int expected) {
		this.start = start;
		this.end = end;
		this.distance = distance;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ 10, 85, 30, 3 },
			//Personalized tests
			{ 0, 100, 50, 2 },
			{ 10, 40, 30, 1 },
			{ 0, 10001, 10, 1001 }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		FrogImp tester = new FrogImp();
		assertEquals(expected, tester.solution(start, end, distance));
	}

}
