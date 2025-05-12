package lesson15_set;

import lesson14_set.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork14_solutuon {
    public static void main(String[] args) {
        HashSet<Character> setChar = new HashSet<>();
        setChar.add('a');
        setChar.add('C');
        setChar.add('c');
        setChar.add('B');
        setChar.add('b');
        setChar.add('1');
        setChar.add('5');
        setChar.add('N');
        setChar.add('m');
        setChar.add('z');
        char ch = 112;
        System.out.println("112 --> "+ch);
        setChar.add(ch);
        System.out.println(setChar);
        System.out.println(deleteElementFromCharSet(setChar, 'm'));
        System.out.println(setChar);
        System.out.println(deleteElementFromCharSet(setChar, 'm'));
        System.out.println("=====================================");
        Student student1 = new Student(10, "Ivan", 5.5);
        Student student2 = new Student(5, "Dahsa", 9.5);
        Student student3 = new Student(15, "Sveta", 8.5);
        Student student4 = new Student(33, "Oleg", 8.5);
        Student student5 = new Student(22, "Anton", 5.3);
        Student student5_1 = new Student(20, "Anton", 7.5);
        LinkedHashSet<Student> hashStudent = new LinkedHashSet<>();
        hashStudent.add(student1);
        hashStudent.add(student2);
        hashStudent.add(student3);
        hashStudent.add(student4);
        hashStudent.add(student5);
        hashStudent.add(student5_1);
        System.out.println(averageGrade(hashStudent));
        System.out.println("================================");
        TreeSet<Student> students = new TreeSet<>(hashStudent);
        System.out.println(students);
        TreeSet<Student> students1 = new TreeSet<>(new ComparatorByGrade().reversed());
        students1.addAll(students);
        System.out.println(students1);
    }

    static Double averageGrade(LinkedHashSet<Student> set){
        if(set == null || set.isEmpty())
            return null;
        double sum = 0.;
        for (Student s : set){
           sum += s.getGrade();
        }
        return sum/set.size();
    }

    static boolean deleteElementFromCharSet(Set<Character> set, char ch){
        if(set == null || set.isEmpty()){
            System.out.println("set is null or empty");
            return false;
        }
        return set.remove(ch);
    }
}
