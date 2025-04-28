package lesson12_comparators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static lesson12_comparators.HomeWork11_solution.*;

public class ClassComparators {
    public static void main(String[] args) {
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
        people.add(person5);
        people.add(person1);
        //people.add(null);
        people.add(person4);
        printList(people);
        System.out.println("===============id==================");
        people.sort(null);
        printList(people);
        System.out.println("=================by name================");
        ComparatorByName comparatorByName = new ComparatorByName();
        people.sort(comparatorByName);
        printList(people);



        System.out.println("=================================");
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i = 50; i > 0; i--) {
            intList.add(i);
        }
        System.out.println(intList);
        intList.sort(null);
        System.out.println(intList);
        System.out.println("=================================");
        List<String> strList = new ArrayList<>();
        strList.add("Ivan");
        strList.add("Alex");
        strList.add("Petr");
        strList.add("Dasha");
        System.out.println(strList);
        strList.sort(null);
        System.out.println(strList);
    }
}
