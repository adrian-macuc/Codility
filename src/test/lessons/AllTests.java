package test.lessons;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.lessons.lesson_1.FrogImpTest;
import test.lessons.lesson_1.PermMissingElemTest;
import test.lessons.lesson_1.TapeEquilibriumTest;
import test.lessons.lesson_2.FrogRiverOneTest;
import test.lessons.lesson_2.MaxCountersTest;
import test.lessons.lesson_2.MissingIntegerTest;
import test.lessons.lesson_2.PermCheckTest;
import test.lessons.lesson_4.DistinctTest;
import test.lessons.lesson_4.MaxProductOfThreeTest;
import test.lessons.lesson_4.NumberOfDiscIntersectionsTest;
import test.lessons.lesson_4.TriangleTest;

@RunWith(Suite.class)
@SuiteClasses({ FrogImpTest.class, PermMissingElemTest.class, TapeEquilibriumTest.class,
			    FrogRiverOneTest.class, PermCheckTest.class, MissingIntegerTest.class, MaxCountersTest.class,
			    MaxProductOfThreeTest.class, DistinctTest.class, TriangleTest.class, NumberOfDiscIntersectionsTest.class}
			 )
public class AllTests {

}
