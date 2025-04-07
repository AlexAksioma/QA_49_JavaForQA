package lesson08_oop;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(10L, "Ivan", "Ivanov", 44);
        String str = new String("qwerty");
        Person person2 = null;
        Person person3 = new Person();  // 0L null  null 0
        person3.setId(123L);
        System.out.println(person3.getId() + ":" + person3.getName());
        person3.setName("John");
        person3.setName("");
        System.out.println(person3.getId() + ":" + person3.getName());
        System.out.println(person1.isAdult());
        //System.out.println(person2.isAdult());
        System.out.println(person3);
        Person person4 = new Person(11L, "Petr", "Ivanov", 14);
        Person person5 = new Person(12L, "Alex", "Petrov", 14);
        Person person6 = new Person(13L, "Muhammed", "Ali", 22);
        Person[] people = {person6, person5, person4, person1};
        System.out.println(people.toString());
        System.out.println(Arrays.toString(people));
        printPeople(people);
        printPeople(new Person[]{});
        printPeople(1, people);
        printPeople(people, 2);
    }

    static void printPeople(Person[] array){
        if(array == null || array.length == 0){
            System.out.println("Smth went wrong");
            return;
        }
        for (Person person: array){
            System.out.println(person.toString());
        }
    }

    static void printPeople(Person[] array, int i){
        if(array == null || array.length == 0){
            System.out.println("Smth went wrong");
            return;
        }
        System.out.println(array[i].toString());
    }
    static void printPeople(int i, Person[] array){
        if(array == null || array.length == 0){
            System.out.println("Smth went wrong");
            return;
        }
        System.out.println(array[i].toString());
    }
}
