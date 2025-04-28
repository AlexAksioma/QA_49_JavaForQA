package lesson11_list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        /*
        JCF - Java Collection Framework
        1. List
        ArrayList   [9][5][-1][0]
        LinkedList  [] <-> [] <-> []
         */
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Ivan");
        stringList.add("Petr");
       // [Ivan] [Petr] [] [] [] [] [] [] [] []     size = 2 capacity = 10
        //  0       1                         9
        System.out.println(stringList.size());
        stringList.add(null);
        System.out.println(stringList.size());
        stringList.add("Petr");
        System.out.println(stringList);

        ArrayList<Integer> intList = new ArrayList<>(125);
        intList.add(123);
        intList.add(1);
        intList.add(-10);
        intList.add(123);
        intList.add(-10);
        intList.add(123);
        intList.add(null);
        intList.add(null);
        System.out.println(intList);

        ArrayList<Integer> intList1 = new ArrayList<Integer>(intList);
        System.out.println(intList1);
        intList1.add(12345);
        System.out.println(intList1);

        LinkedList<Double> doubleLinkedList = new LinkedList<>();
        doubleLinkedList.add(10.23);
        doubleLinkedList.add(1.4);
        doubleLinkedList.add(3.34);
        System.out.println(doubleLinkedList);

        LinkedList<Double> doubleLinkedList1 = new LinkedList<>(doubleLinkedList);
        doubleLinkedList1.add(13.123);
        doubleLinkedList1.add(null);
        System.out.println(doubleLinkedList1);

        List<Boolean> boolList = new ArrayList<>();
        List<Boolean> boolList1 = new LinkedList<>();
        System.out.println("========================================");
        List<String> nameList = new ArrayList<>();
        nameList.add("Petr");
        nameList.add("Dasha");
        System.out.println(nameList.add("Ivan"));
        System.out.println(nameList);
        nameList.add(2, "Sergey");
        System.out.println(nameList);
        System.out.println(nameList.isEmpty());
        System.out.println(nameList.remove(1));
        System.out.println(nameList);
        nameList.remove(nameList.size()-1);
        System.out.println(nameList);
        System.out.println(nameList.remove("Str"));
        nameList.add("Dasha");
        nameList.add("Sergey");
        System.out.println(nameList);
        System.out.println(nameList.remove("Sergey"));
        System.out.println(nameList);
        nameList.add("Dasha");
        nameList.add("Sergey");
        System.out.println("=========================================");
        System.out.println(nameList.contains("Dasha1"));
        System.out.println(nameList);
        System.out.println(nameList.indexOf("Sergey"));
        System.out.println(nameList.lastIndexOf("Sergey"));
        System.out.println(nameList.lastIndexOf("Filipp"));
        System.out.println("=========================================");
        List<SmartTV> listTV = new LinkedList<>();
        SmartTV smartTV1 = new SmartTV("LG", "Qullet",
                LocalDate.of(2020, 11, 22), true, 45);
        SmartTV smartTV2 = new SmartTV("LG", "Ser 123",
                LocalDate.of(2024, 1, 1), true, 33);
        SmartTV smartTV3 = new SmartTV("LG", "Qullet",
                LocalDate.of(2022, 12, 22), false, 45);
        SmartTV[] arrayTV = {smartTV2, smartTV1, smartTV3, null};
        listTV.add(smartTV2);
        listTV.add(smartTV1);
        listTV.add(smartTV3);
        System.out.println(listTV);
        SmartTV smartTV2_1 = new SmartTV("LG", "Ser 123",
                LocalDate.of(2024, 1, 1), true, 33);
        System.out.println(listTV.contains(smartTV2_1));
    }
}
