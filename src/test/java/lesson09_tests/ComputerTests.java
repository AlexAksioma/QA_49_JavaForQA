package lesson09_tests;

import lesson09_oop.Computer;
import lesson09_oop.HomeWork08_solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static lesson09_oop.HomeWork08_solution.*;

public class ComputerTests {

    Computer computer1 = new Computer("Lenovo", 512, "i5", 1024);
    Computer computer2 = new Computer("Lenovo", 256, "i3", 512);
    Computer computer3 = new Computer("Lenovo", 1024, "i7", 512);
    Computer computer4 = new Computer("Apple", 512, "m3", 1024);
    Computer computer5 = new Computer("Apple", 1024, "m3", 512);


    @Test
    public void printApplePositiveTest() {
        printApple(new Computer[]{computer1, computer2, computer3, computer4, computer5});
    }

    @Test
    public void printAppleNegativeTest_arrayNull() {
        printApple(null);
    }

    @Test
    public void printAppleNegativeTest_arrayEmpty() {
        printApple(new Computer[]{});
    }

    @Test
    public void printAppleNegativeTest_arrayWOComp() {
//        Computer[] array = new Computer[3]; //null null null
//        for (Computer computer : array){
//            System.out.println(computer);
//        }
        printApple(new Computer[3]);
    }

    @Test
    public void printAppleNegativeTest_arrayCompAndNull() {
        printApple(new Computer[]{computer5, null, computer1});
    }

    @Test
    public void printAppleNegativeTest_arrayCompWOParameter() {
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Computer c3 = new Computer();
        printApple(new Computer[]{computer5, c1, c3, c2});
    }

}
