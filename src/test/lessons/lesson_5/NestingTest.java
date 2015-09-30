package test.lessons.lesson_5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.lessons.lesson_5.Nesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NestingTest {

	private String S;
	private int expected;

	public NestingTest(String S, int expected) {
		this.S = S;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			//Example test
			{ "(()(())())", 1 },
			{ "())", 0},			
			//Personalized tests
			{ "", 1},
			{ "))((", 0},
			{ ")()()", 0},
			{ "()()", 1}
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Nesting tester = new Nesting();
		assertEquals(expected, tester.solution(S));
	}

}
