package test.lessons.lesson_3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_3.CountDiv;

@RunWith(Parameterized.class)
public class CountDivTest {

	private int A;
	private int B;
	private int K;
	private int expected;

	public CountDivTest(int A, int B, int K, int expected) {
		this.A = A;
		this.B = B;
		this.K = K;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{  6, 11, 2, 3 },
			//Personalized tests
			{  10, 20, 5, 3 },
			{  10, 10, 7, 0 },
			{  10, 10, 10, 1 },
			{  0, Integer.MAX_VALUE, 1, Integer.MAX_VALUE + 1 },
			{  0, 1, 1, 2}
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		CountDiv tester = new CountDiv();
		assertEquals(expected, tester.solution(A, B, K));
	}

}
