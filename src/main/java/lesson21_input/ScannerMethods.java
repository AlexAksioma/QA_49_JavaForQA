package lesson21_input;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("str1\n" + "str2\n" + "str3");
        String str = scanner.nextLine();
        System.out.println(str);
        str = scanner.nextLine();
        System.out.println(str);
        str = scanner.nextLine();
        System.out.println(str);
        System.out.println("=======================");
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("input:");
//        int number = scanner1.nextInt();
//        System.out.println("number = " + number);
        // printNumber();
        System.out.println(printText());

    }

    static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("number*10 = " + number * 10);
        } else
            System.out.println("wrong input");
    }

    static String printText() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        System.out.println("input word:");
        while (true) {
            if (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equalsIgnoreCase("exit"))
                    break;
                else
                    result.append(word).append(" ");
            }
        }
        return result.toString();
    }
}
