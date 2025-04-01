package lesson06_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitStartTests {

    @Test
    public void firstTest(){
        System.out.println("Hello JUnit");
    }

    @Test
    public void firstEqualsTest(){
        int sum = 1+1;
        assertEquals(5, sum, "Validate sum");
    }
}
