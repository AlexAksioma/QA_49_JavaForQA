package lesson06_tests;

import lesson06_junit.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
    public void sumPositiveTest(){
        Integer result = Calculator.sum(3,7);
        assertEquals(10, result, "Positive test sum");
    }

    @Test
    public void sumPositiveTest1(){
        Integer result = Calculator.sum(3,7);
        assertTrue(result == 3+6, "Positive test sum TRUE");
    }

    @Test
    public void sumPositiveTest2(){
        Integer result = Calculator.sum(3,7);
        assertFalse(result == 3+6, "Positive test sum FALSE");
    }

    @Test
    public void sumNegativeTest_sumMaxInt(){
        Integer result = Calculator.sum(Integer.MAX_VALUE,Integer.MAX_VALUE);
        Long l = (long)Integer.MAX_VALUE+Integer.MAX_VALUE;
        assertEquals(l, (long)result, "Negative test sum MaxValue");
    }
}
