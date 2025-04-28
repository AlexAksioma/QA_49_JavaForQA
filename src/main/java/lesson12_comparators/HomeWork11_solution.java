package lesson12_comparators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HomeWork11_solution {
    public static void main(String[] args) {
//        1.1. ArrayList<Float>, add 10 elements
//        1.2  LinkedList<Boolean>, add 10 elements
//        1.3  Create method printCollection
        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(23.4f);
        floatList.add(3.4f);
        floatList.add(23.4f);
        floatList.add(33.45f);
        floatList.add(-100.49f);
        floatList.add(1, null);
        floatList.add(3, null);
        printFloatList(floatList);
        System.out.println("=============================");
        List<Boolean> boolList = new LinkedList<>();
        boolList.add(true);
        boolList.add(false);
        boolList.add(true);
        boolList.add(false);
        boolList.add(true);
        //List.of(boolList, true, false, true, false);
        System.out.println(boolList);
        printBoolList(boolList);
        System.out.println("=========================");
        printList(boolList);
        printList(floatList);
        System.out.println("=========================");
        ArrayList objList = new ArrayList<>();//wrong
        objList.add(true);
        objList.add(100);
        objList.add("str");
        objList.add(33.44);
        printList(objList);
        System.out.println("============Person=============");
        Person person1 = new Person(10, "Ivan", LocalDate.of(2000, 3, 4));
        Person person2 = new Person(11, "Petr", LocalDate.of(1998, 10, 14));
        Person person3 = new Person(7, "Dasha", LocalDate.of(2005, 7, 22));
        Person person4 = new Person(5, "Muhamad", LocalDate.of(1980, 12, 12));
        Person person5 = new Person(10, "Ivan", LocalDate.of(2000, 3, 4));
        ArrayList<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(null);
        people.add(person5);
        people.add(person1);
        people.add(null);
        people.add(person4);

        printList(people);
        System.out.println("=========remove============");
        printList(removeDuplicates(people));
    }

    static List<Person> removeDuplicates(List<Person> people) {
        if (people == null || people.isEmpty())
            return null;
        List<Person> resultList = new ArrayList<>();
        for (Person p : people) {
            if (p != null)
                if (!resultList.contains(p))
                    resultList.add(p);
        }
        return resultList;
    }

    static void printFloatList(List<Float> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("wrong list");
            return;
        }
        for (Float f : list)
            System.out.println(f);
    }

    static void printBoolList(List<Boolean> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("wrong list");
            return;
        }
        for (Boolean f : list)
            System.out.println(f);
    }

    public static <T> void printList(List<T> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("wrong list");
            return;
        }
        for (T element : list)
            System.out.println(element);
    }
}
