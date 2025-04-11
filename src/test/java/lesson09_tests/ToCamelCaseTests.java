package lesson09_tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static lesson08_oop.HomeWork07_solution.*;

public class ToCamelCaseTests {

    @Test
    public void toCamelCasePositiveTest(){
        String result = toCamelCase("Ivanov Ivan Ivanovich");
        assertEquals("ivanovIvanIvanovich", result);
    }
    @Test
    public void toCamelCasePositiveTest1(){
        String result = toCamelCase("   Ivanov Ivan Ivanovich   ");
        assertEquals("ivanovIvanIvanovich", result);
    }
    @Test
    public void toCamelCasePositiveTest2(){
        String result = toCamelCase("   Ivanov   Ivan   Ivanovich   ");
        assertEquals("ivanovIvanIvanovich", result);
    }

    @Test
    public void toCamelCasePositiveTest3(){
        String result = toCamelCase("Ivanov Ivan Ivanovich      ");
        assertEquals("ivanovIvanIvanovich", result);
    }
    @Test
    public void toCamelCaseNegativeTest_blank(){
        String result = toCamelCase("   ");
        assertNull(result);
    }
    @Test
    public void toCamelCaseNegativeTest_empty(){
        String result = toCamelCase("");
        assertNull(result);
    }
    @Test
    public void toCamelCaseNegativeTest_null(){
        String result = toCamelCase(null);
        assertNull(result);
    }
}
