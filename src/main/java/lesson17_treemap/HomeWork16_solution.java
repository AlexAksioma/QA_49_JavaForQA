package lesson17_treemap;

import lesson14_set.Student;

import java.util.*;

public class HomeWork16_solution {
    public static void main(String[] args) {
        LinkedHashMap<String, Student> mapStudent = new LinkedHashMap<>();
        Student student1 = new Student(10, "Ivan", 5.5);
        Student student2 = new Student(5, "Dahsa", 5.5);
        Student student3 = new Student(15, "Sveta", 5.5);
        Student student4 = new Student(33, "Oleg", 5.5);
        Student student5 = new Student(22, "Anton", 5.5);
        Student student5_1 = new Student(22, "Anton", 5.5);
        mapStudent = addStudentToMap(student1, student2, student3, student4, student5);
        //System.out.println(sum(2, 4, 6, 7, 8, 0, -20));
        System.out.println(mapStudent);
        HashMap<Integer, Student> mapIdStudent = new HashMap<>();
        mapIdStudent.put(student1.getId(), student1);
        mapIdStudent.put(student2.getId(), student2);
        mapIdStudent.put(student3.getId(), student3);
        mapIdStudent.put(student4.getId(), student4);
        mapIdStudent.put(student5.getId(), student5);
        printAllStudentsGrades(mapIdStudent);
        System.out.println("================================");
        for (Map.Entry<Integer, Student> entry : mapIdStudent.entrySet()){
            System.out.println(entry.getKey()+ "-->" + entry.getValue());
        }
    }

    static void printAllStudentsGrades(Map<Integer, Student> students) {
        if (students == null || students.isEmpty())
            return;
        Collection<Student> studentsCol = students.values();
        ArrayList<Student> list = new ArrayList<>(studentsCol);
        Set<Integer> set = students.keySet();
        System.out.println(studentsCol);
        for (Student st : studentsCol) {
            System.out.print(st.getGrade() + " ");
        }
    }

    static LinkedHashMap<String, Student> addStudentToMap(Student... students) {
        LinkedHashMap<String, Student> map = new LinkedHashMap<>();
        for (Student st : students) {
            if (st != null)
                map.put(st.getName(), st);
        }
        return map;
    }

    static int sum(int... i) {
        int sum = 0;
        for (int a : i) {
            sum += a;
        }
        return sum;
    }
}
