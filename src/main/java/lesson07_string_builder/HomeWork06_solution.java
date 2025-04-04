package lesson07_string_builder;

import java.util.Arrays;

public class HomeWork06_solution {
    /*
    1. The method returns first shortest word in the text
His name is Vasya --> is
public static String returnShortestWord(String text)


2. The method replaces word1 with word2 in the text and returns the text
My cat is the best cat in the world --> My dog is the best dog in the world
public static String replacesWords(String text, String word1, word2)

3*.The method returns initials (Ivanov Oleg Mihailovich --> I.O.M.)
public static String returnsInitials(String fio)
     */
    public static void main(String[] args) {
        String res = replacesWords1("My cat is the best Cat", "cat", "dog");
        System.out.println(res);
    }

    public static String returnsInitials(String fio) {
        if (fio == null || fio.isBlank())
            return null;
        String[] array = fio.trim().split(" ");
        if (array.length != 3)
            return null;
        return array[0].charAt(0) +"."+ array[1].charAt(0) +"."+ array[2].charAt(0) +".".toUpperCase();
    }

    public static String replacesWords(String text, String word1, String word2) {
        if (text == null || text.isBlank() || word1 == null || word2 == null
                || word1.isBlank() || word2.isBlank()) {
            System.out.println("wrong text");
            return null;
        }
        word1 = word1.trim().toLowerCase();
        word2 = word2.trim();
        return text.toLowerCase().replace(word1, word2);
    }

    public static String replacesWords1(String text, String word1, String word2) {
        if (text == null || text.isBlank() || word1 == null || word2 == null
                || word1.isBlank() || word2.isBlank()) {
            System.out.println("wrong text");
            return null;
        }
        String[] arrayStr = text.trim().split(" ");
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equalsIgnoreCase(word1))
                arrayStr[i] = word2.trim();
        }
        return Arrays.toString(arrayStr)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");
        //[My, dog, is, the, best, dog]
    }

    public static String returnShortestWord(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("wrong text");
            return null;
        }
        String[] arrayStr = text.trim().split(" ");
        String shortestWord = arrayStr[0];
        for (String str : arrayStr) {
            if (str.length() < shortestWord.length())
                shortestWord = str;
        }
        return shortestWord;
    }
}
