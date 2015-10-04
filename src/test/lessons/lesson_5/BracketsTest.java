package test.lessons.lesson_5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.lessons.lesson_5.Brackets;

@RunWith(Parameterized.class)
public class BracketsTest {

	private String S;
	private int expected;

	public BracketsTest(String S, int expected) {
		this.S = S;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ "{[()()]}", 1 },
			{ "([)()]", 0},						
			//Personalized tests
			{ "([()()]{", 0},	
			{ "", 1},
			{ "[][]", 1},
			{ "]", 0},	
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Brackets tester = new Brackets();
		assertEquals(expected, tester.solution(S));
	}

}
