package lesson22_file;

import lesson21_input.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork21_solution {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //System.out.println(createStudentFromConsole());
        try {
            System.out.println(fillIntListFromConsole());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static ArrayList<Integer> fillIntListFromConsole() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter integers(exit)");
        while (true){
            String input = reader.readLine();
            if(input.equalsIgnoreCase("exit"))
                break;
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            }catch (NumberFormatException e){
                System.out.println("wrong integer, try again");
            }
        }
        return list;
    }

    static Student createStudentFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String name = scanner.nextLine();
        int age = 0;
        while (age == 0){
            System.out.print("age(1-120):");
            if(scanner.hasNextInt()){
                age = scanner.nextInt();
                if(age < 1 || age > 120){
                    System.out.println("age must be between 1-120");
                    age = 0;
                }
            }else {
                System.out.println("Enter valid age 1-120");
                scanner.next();
            }
        }
        double grade = 0.;
        while (grade == 0.){
            System.out.print("grade(1-10):");
            if(scanner.hasNextDouble()){
                grade = scanner.nextDouble();
                if(grade<1 || grade > 10){
                    System.out.println("Grade must be between 1-10");
                    grade = 0.;
                }
            }else {
                System.out.println("Enter valid grade 1-10");
                scanner.next();
            }
        }
        return new Student(name, age, grade);
    }
}
