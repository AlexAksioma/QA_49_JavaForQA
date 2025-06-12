package lesson21_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class StudentBuffReader {
    public static void main(String[] args) {
        try {
            //System.out.println(createStudentFromConsole());
            System.out.println(createStudentArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static LinkedList<Student> createStudentArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student();
        LinkedList<Student> students = new LinkedList<>();
        while (true) {
            System.out.println("-->");
            String input = reader.readLine();
            if (input.equalsIgnoreCase("exit"))
                break;
            else {
                student = createStudentFromConsole();
                students.add(student);
            }
        }
        return students;
    }

    public static Student createStudentFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student();
        System.out.println("input name:");
        String name = reader.readLine();
        student.setName(name);
        //student.setName(reader.readLine());
        System.out.println("input age:");
        int age = Integer.parseInt(reader.readLine());
        student.setAge(age);
        System.out.println("input grade");
        double grade = Double.parseDouble(reader.readLine());
        student.setGrade(grade);
        return student;
    }
}
