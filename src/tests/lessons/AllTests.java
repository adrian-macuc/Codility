package tests.lessons;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.lessons.lesson_1.FrogImpTest;
import tests.lessons.lesson_1.PermMissingElemTest;
import tests.lessons.lesson_1.TapeEquilibriumTest;
import tests.lessons.lesson_2.FrogRiverOneTest;
import tests.lessons.lesson_2.MaxCountersTest;
import tests.lessons.lesson_2.MissingIntegerTest;
import tests.lessons.lesson_2.PermCheckTest;

@RunWith(Suite.class)
@SuiteClasses({ FrogImpTest.class, PermMissingElemTest.class, TapeEquilibriumTest.class,
			    FrogRiverOneTest.class, PermCheckTest.class, MissingIntegerTest.class, MaxCountersTest.class }
			 )
public class AllTests {

}
