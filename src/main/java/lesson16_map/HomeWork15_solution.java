package lesson16_map;

import java.util.*;

public class HomeWork15_solution {
    /*
    Create methods use String, StringBuilder and Set1.
    1.Remove repetitive characters from a string (while preserving the order)
    static String removeRepetitiveCharacters(String str)

    2.Count the number of unique LETTERS in the string(use Character.isLetter)
    static Integer numberUniqueLetters(String str)

    3*. Find common words from two strings(use method retainAll())
    static HashSet<String> commonWords(String s1, String s2)
     */
    public static void main(String[] args) {
        System.out.println(removeRepetitiveCharacters("qwerty QWERTY 123"));
        System.out.println(numberUniqueLetters("qwerty QWERTY 123"));
        System.out.println("===================================");
        System.out.println("result --> "+
                commonWords("To be or not to be","to be 123 and or "));
    }

    static String removeRepetitiveCharacters(String str){
        if(str == null || str.isEmpty())
            return null;
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        char[] arrayChar = str.toLowerCase().toCharArray();  //[a v d a v]
        for (char ch : arrayChar){
            if(set.add(ch))        //true true true  false  false
                result.append(ch); //  a    v    d
        }
        return result.toString();  //avd
    }

    static Integer numberUniqueLetters(String str){
        if(str == null || str.isEmpty())
            return null;
        Set<Character> set = new HashSet<>();
        char[] arrayChar = str.toUpperCase().toCharArray();  //[A S A D]
        for (char ch : arrayChar){
            if(Character.isLetter(ch))  //      A  S  A  D
                set.add(ch);            //set--> A S D
        }
        System.out.println(set);
        return set.size();
    }

    static HashSet<String> commonWords(String s1, String s2){
        if(s1 == null || s2 == null || s1.isBlank() || s2.isBlank())
            return null;
        String[] array1 = s1.trim().toLowerCase().split(" ");
        List<String> list1 = Arrays.asList(array1);
        System.out.println(list1);
        HashSet<String> set1 = new HashSet<>(list1);
        System.out.println(set1);
        HashSet<String> set2 = new HashSet<>(
                Arrays.asList(s2.trim().toLowerCase().split(" ")));
        System.out.println(set2);
        //  (1 3 5 7)   (1 3 9)   -->    (1 3)
        set1.retainAll(set2);
        return set1;
    }
}
