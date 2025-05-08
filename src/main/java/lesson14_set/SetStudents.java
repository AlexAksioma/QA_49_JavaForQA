package lesson14_set;

import java.util.HashSet;
import java.util.TreeSet;

public class SetStudents {
    public static void main(String[] args) {
        Student student1 = new Student(10, "Ivan", 5.5);
        Student student2 = new Student(5, "Dahsa", 5.5);
        Student student3 = new Student(15, "Sveta", 5.5);
        Student student4 = new Student(33, "Oleg", 5.5);
        Student student5 = new Student(22, "Anton", 5.5);
        Student student5_1 = new Student(22, "Anton", 5.5);
        HashSet<Student> hashStudent = new HashSet<>();
        hashStudent.add(student1);
        hashStudent.add(student2);
        hashStudent.add(student3);
        hashStudent.add(student4);
        hashStudent.add(student5);
        hashStudent.add(student5_1); //false st5 equals st5_1
        System.out.println(hashStudent);
        System.out.println("=================================");
        TreeSet<Student> treeSetStudents = new TreeSet<>();
        treeSetStudents.add(student1);
        treeSetStudents.add(student2);
        treeSetStudents.add(student3);
        treeSetStudents.add(student4);
        treeSetStudents.add(student5);
        System.out.println(treeSetStudents);
        System.out.println(student5.equals(student5_1));
        System.out.println(student5.compareTo(student5_1));
    }
}
