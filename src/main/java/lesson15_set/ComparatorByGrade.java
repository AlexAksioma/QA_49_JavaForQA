package lesson15_set;

import lesson14_set.Student;

import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}
