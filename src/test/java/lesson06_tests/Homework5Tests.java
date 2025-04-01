package lesson06_tests;

import lesson06_junit.HomeWork5_solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static lesson06_junit.HomeWork5_solution.*;

public class Homework5Tests {

    @Test
    public void returnWordInTextReversePositiveTest(){
        String result = returnWordInTextReverse("To be, or not. to be!");
        assertEquals( "oT eb ro ton ot eb", result, "returnWordInTextReversePositiveTest");
    }

    @Test
    public void returnStringReversePositiveTest(){
        String result = HomeWork5_solution.returnStringReverse("To be or not to be");
        assertTrue(result.equals("eb ot ton ro eb oT"), "returnStringReversePositiveTest");
    }

    @Test
    public void returnStringReverseNegativeTest_null(){
        String result = returnStringReverse(null);
        assertNull(result, "returnStringReverseNegativeTest_null");
    }

    @Test
    public void returnStringReverseNegativeTest_spacesString(){
        String result = returnStringReverse("     ");
        assertNull(result, "returnStringReverseNegativeTest_spaces");
    }
}
