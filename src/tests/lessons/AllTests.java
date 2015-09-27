package tests.lessons;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.lessons.lesson_1.FrogImpTest;
import tests.lessons.lesson_1.PermMissingElemTest;
import tests.lessons.lesson_1.TapeEquilibriumTest;

@RunWith(Suite.class)
@SuiteClasses({ FrogImpTest.class, PermMissingElemTest.class, TapeEquilibriumTest.class })
public class AllTests {

}
