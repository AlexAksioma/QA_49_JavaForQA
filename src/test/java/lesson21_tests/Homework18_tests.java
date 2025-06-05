package lesson21_tests;

import org.junit.jupiter.api.Test;

import static lesson21_input.Homework18_solution.*;
import static org.junit.jupiter.api.Assertions.*;

public class Homework18_tests {
    //Integer Integer quantityWords(String str)(String str)
    @Test
    public void quantityWordsPositiveTest(){
        assertEquals(5, quantityWords("To be. or, not to"));
    }
    @Test
    public void quantityWordsNegativeTest_null(){
        assertNull(quantityWords(null));
    }

    @Test
    public void quantityWordsNegativeTest_empty(){
        assertEquals(0, quantityWords(""));
    }

    @Test
    public void quantityWordsNegativeTest_spaces(){
        assertEquals(0, quantityWords("     "));
    }
}
