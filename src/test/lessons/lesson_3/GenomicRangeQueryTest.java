package test.lessons.lesson_3;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_3.GenomicRangeQuery;

@RunWith(Parameterized.class)
public class GenomicRangeQueryTest {

	private String S;
	private int[] P;
	private int[] Q;
	private int[] expected;

	public GenomicRangeQueryTest(String S, int[] P, int[] Q, int[] expected) {
		this.S = S;
		this.P = P;
		this.Q = Q;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ "CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5, 6 }, new int[] { 2, 4, 1 } },
			//Personalized tests
			{"C", new int[] { 0 }, new int[] { 0 }, new int[] { 2 } },
			{"T", new int[] { 0 }, new int[] { 0 }, new int[] { 4 } },
			{"TCTCTCTCTCTCTTCCTTCTCTC", new int[] { 0, 4 }, new int[] { 3, 10 }, new int[] { 2, 2 } }
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		GenomicRangeQuery tester = new GenomicRangeQuery();
		assertArrayEquals(expected, tester.solution(S, P, Q));
	}
}
