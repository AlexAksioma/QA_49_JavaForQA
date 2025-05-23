package lesson18_exceptions;

import java.util.ArrayList;

public class ExceptionsMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        //System.out.println("c = " + c);
        try {
            //ArithmeticException
            c = a / b;
        } catch (Exception e) {
            e.printStackTrace();
            c = 999;
        }
        System.out.println("c --> " + c);
        //=====================================
        String str = null;
        char ch = 'c';
        try {
            ch = str.charAt(10);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("created nullPointer");
            ch = '!';
        }
        System.out.println("after nullPointer ch = " + ch);
        //=====================================
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("array --> " + array[array.length - 1]);
        }
        //=====================================
        int index1 = 10;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        //list.get(index1);   IndexOutOfBoundsException
        //=====================================
        String str2 = "str";
        int result = 0;
        try {
            result = Integer.parseInt(str2);
        }catch (NumberFormatException e){
            e.printStackTrace();
            result = Integer.parseInt("123");
            System.out.println(result);
        }
        System.out.println("======== checked exception =====");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("====END PROGRAM====");
    }
}
