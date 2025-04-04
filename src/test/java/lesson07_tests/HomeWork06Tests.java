package lesson07_tests;


import lesson07_string_builder.HomeWork06_solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static lesson07_string_builder.HomeWork06_solution.*;

public class HomeWork06Tests {

    @Test
    public void returnsInitialsPositiveTest(){
        String result = returnsInitials(" Ivanov Petr Sidorovich ");
        assertEquals("I.P.S.", result, "returnsInitialsPositiveTest");
    }

    @Test
    public void replacesWordsPositiveTest(){
        String result = replacesWords("My cat is the best Cat", "cat", "dog");
        assertEquals("my dog is the best dog", result, "replacesWordsPositiveTest");
    }

    @Test
    public void returnShortestWordPositiveTest(){
        //String result = HomeWork06_solution.returnShortestWord("His name is Vasya");
        String result = returnShortestWord("His name is Vasya to be Male");
        assertEquals("is", result, "returnShortestWordPositiveTest 1");
        System.out.println("after first assert");
        assertEquals("not", result, "returnShortestWordPositiveTest 2");
        System.out.println("after second assert");
        assertEquals("is", result, "returnShortestWordPositiveTest 3");
        System.out.println("after third assert");
    }
    @Test
    public void returnShortestWordNegativeTest_textNull(){
        String result = returnShortestWord(null);
        assertNull(result, "returnShortestWordNegativeTest_textNull");
    }
    @Test
    public void returnShortestWordNegativeTest_textEmpty(){
        String result = returnShortestWord("  ");
        assertNull(result, "returnShortestWordNegativeTest_textEmpty");
    }
    @Test
    public void returnShortestWordNegativeTest_wrongText(){
        String result = returnShortestWord("His  name, is ! Vasya to be Male");
        assertEquals("is", result, "returnShortestWordNegativeTest_wrongText");
    }

    @Test
    public void returnsInitialsPositiveTest_MultiAssert(){
        String result = returnsInitials(" Ivanov Petr Sidorovich ");
        int[] array1 = {1,2,3};
        int[] array2 = {2,5,7};
        assertAll("multi assert",
                () -> assertEquals("I.P.S.", result, "returnsInitialsPositiveTest"),
                () -> assertTrue(false, "assert true"),
                () -> assertNull(null, "assert null"),
                () -> assertArrayEquals(array1, array2, "assert array equals")
        );



    }
}
