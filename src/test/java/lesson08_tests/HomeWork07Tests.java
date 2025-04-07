package lesson08_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static lesson08_oop.HomeWork07_solution.*;

public class HomeWork07Tests {
//    s->"hello world"
//    ins -->"my "
//    index --> 6
//    result str --> "hello my world" to return
    @Test
    public void printLastLettersReverseTest(){
        printLastLettersReverse("QA 49 Hello");
    }

    @Test  //String insertFrom(String s, int index, String ins)
    public void insertFromPositiveTest(){
        String result = insertFrom("hello world", 6, "my ");
        assertTrue(result.equals("hello my world"), "insertFromPositiveTest");
    }

    @Test  //String insertFrom(String s, int index, String ins)
    public void insertFromPositiveTest_rus(){
        String result = insertFrom("hello world", 6, "мое ");
        assertTrue(result.equals("hello мое world"), "insertFromPositiveTest");
    }

    @Test
    public void insertFromNegativeTest_strNull(){
        String result = insertFrom(null, 6, "my ");
        assertNull(result);
    }

    @Test
    public void insertFromNegativeTest_strEmpty(){
        String result = insertFrom("", 6, "my ");
        assertNull(result);
    }
    @Test
    public void insertFromNegativeTest_wrongIndex(){
        String result = insertFrom("hello world", -1, "my ");
        assertNull(result);
    }
    @Test
    public void insertFromNegativeTest_wrongIndex1(){
        String result = insertFrom("hello world", 11, "my ");
        assertNull(result);
    }
    @Test
    public void insertFromNegativeTest_wrongIns_null(){
        String result = insertFrom("hello world", 6, null);
        assertNull(result);
    }
//    @Test
//    public void insertFromNegativeTest_wrongIns_empty(){
//        String result = insertFrom("hello world", 6, "");
//        assertNull(result);
//    }
}
