package lesson25_tasks;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 5, 0};
        //System.out.println(isPositiveArray(null));
        //System.out.println(isPositiveArray(array));
        //System.out.println(Arrays.toString(findMaxMin(array)));
        String str = "To be  or not   to be ";
        System.out.println(countWords(str));
        System.out.println(countWords(" "));
        System.out.println(countWords(""));
        System.out.println(countWords(" str "));
        System.out.println("=========================");
        int[][] array2M = {{1, 2, 3, 4}, {11, 12, 13, 14}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        System.out.println(sumArray(array2M));
        System.out.println("=========================");
        swap(22, 33);
        swap(22, -33);
        System.out.println("=========================");
        String str1 = "To be,  or not! A-A.  To be? Or... Yes!";
        System.out.println(quantitySentencesInText(str1));
        System.out.println("===========================");
        System.out.println(quantitySentencesInText1(str1));
        System.out.println("=============================");
        System.out.println(uniqueWords(str1));
        System.out.println(uniqueWords("str1 str2 str3"));
        System.out.println("================================");
        System.out.println(isPalindrome("abc de d cba"));
        System.out.println("================================");
        System.out.println(convertBinToDec("11"));
        System.out.println(convert16ToDec("356A"));
        System.out.println(convert5ToDec("341"));
        System.out.println("================================");
        System.out.println(factorial(5));
        System.out.println(factorial(25));
        System.out.println("================================");
        System.out.println(Arrays.toString(removeZero(new int[]{1,0,1,2,0})));
    }

    static boolean isPositiveArray(int[] array) {
        if (array == null || array.length == 0)
            return false;
        for (int i : array) {
            if (i < 0)
                return false;
        }
        return true;
    }

    static int[] findMaxMin(int[] array) {
        if (array == null || array.length == 0)
            return null;
        if (array.length == 1) {
            return new int[]{array[0], array[0]};
        }
        int min = array[0];  //Integer.MAX_VALUE;
        int max = array[0];  //Integer.MIN_VALUE
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        return new int[]{min, max};
    }

    static int countWords(String text) {
        if (text == null || text.isBlank())
            return -1;
        return text.trim().split("\\s+").length;
    }

    static int sumArray(int[][] array) {
        /*
        1 2 3 4   - 1
        5 6 7 8   - 2
        1 3 5 7
        6 4 1 1
         */
        int sum = 0;
        for (int[] row : array)
            for (int el : row)  //1 2 3 4
                sum += el;
        return sum;
    }

    static void swap(int a, int b) {
        // a=3 b=5   a= 3+5=8   b = a-b 3  a = a-b  5
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }

    static boolean firstLetterIsCapital(String str) {
        if (str == null || str.isBlank())
            return false;
        char first = str.charAt(0);
        return Character.isUpperCase(first);
    }

    static int quantitySentencesInText(String text) {
        if (text == null || text.isBlank())
            return -1;
        String[] array = text.trim().split("\\W+");
        int quantity = 0;
        for (String word : array) {
            if (Character.isUpperCase(word.charAt(0)))
                quantity++;
        }
        return quantity;
    }

    // To be,  or not! A-A.  To be?
    static int quantitySentencesInText1(String text) {
        if (text == null || text.isBlank())
            return -1;
        String[] array = text.trim().split("[.!?]+");
        System.out.println(Arrays.toString(array));
        return array.length;
    }

    static boolean uniqueWords(String text) {
        if (text == null || text.isBlank())
            return false;
        String[] array = text.trim().toLowerCase().split("\\W+");
        //Set<String> set = new HashSet<>(Arrays.asList(array));
        Set<String> set = new HashSet<>(List.of(array));
        return array.length == set.size();
    }

    static boolean isPalindrome(String str) {// abc de d cba
        str = str.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverse = stringBuilder.reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }

    static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new TreeSet<>(list);
        return new ArrayList<>(set);
    }

    //"010101"
    static int convertBinToDec(String bin) {
        int dec = Integer.parseInt(bin, 2);
        return dec;
    }

    static int convert16ToDec(String bin) {
        int dec = Integer.parseInt(bin, 16);
        return dec;
    }

    static int convert5ToDec(String bin) {
        int dec = Integer.parseInt(bin, 5);
        return dec;
    }

    static long factorial(int f) {   //5! = 1*2*3*4*5
        long res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i; //res = res * i
        }
        return res;
    }

    // 1 0 1 0 --> 1 1
    static int[] removeZero(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int el : array) {
            if (el != 0)
                list.add(el);
        }
//        Object[] array1 = list.toArray();
//        return (Integer[]) array1;
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
