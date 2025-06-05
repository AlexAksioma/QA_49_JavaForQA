package lesson21_input;

import java.util.Arrays;

public class Homework18_solution {
    public static void main(String[] args) {
        System.out.println(quantityWords(""));
        System.out.println(quantityWords("     "));
        System.out.println(quantityWords("  ,   "));
        System.out.println(quantityWords(","));
    }

    public static Integer quantityWords(String str) {
        try {
            if(str.isBlank())
                return 0;
            String[] words = str.trim().split("\\W+");
            System.out.println("-->" + Arrays.toString(words));
            return words.length;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
