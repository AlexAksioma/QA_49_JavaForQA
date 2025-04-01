package lesson06_junit;

import java.util.Arrays;

public class HomeWork5_solution {
    /*
            1. Print string reverse
            static void printReverse(String str)
            12345  -> 54321

            2. static String returnStringReverse(String str)
            to be or not to be  --> eb ot ton ro eb ot

            3*. static String returnwordInTextReverse(String text)
            "To keep your balance, you must keep moving. To"
            Ot peek ruoy ecnalab, uoy ......  word may end space, ",", "."
            */
    public static void main(String[] args) {
        printReverse("QA_49 Java");
        System.out.println(returnWordInTextReverse("QA 49 Java, QA"));
    }

    public static String returnWordInTextReverse(String text) {
        if (text == null || text.isBlank())
            return null;
        String[] arrayStr = text.trim().split(" "); //[To] [keep] [your] [balance,]  .,!
        System.out.println(Arrays.toString(arrayStr));
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].endsWith(".") || arrayStr[i].endsWith(",") || arrayStr[i].endsWith("!"))
                arrayStr[i] = arrayStr[i].substring(0, arrayStr[i].length() - 1);
        }
        System.out.println(Arrays.toString(arrayStr));
        String result = "";
        for (String str : arrayStr){
            result += returnStringReverse(str)+" ";
            //[To] [keep] [your] --> rusult = oT |  oT peek | oT peek ruoy |
        }
        return result.trim();
    }

    public static String returnStringReverse(String str) {
        if (str == null || str.isBlank())
            return null;
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void printReverse(String str) {
        if (str == null || str.isBlank())
            return;
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
