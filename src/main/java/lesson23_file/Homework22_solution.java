package lesson23_file;

import lesson21_input.Student;
import lesson21_input.StudentBuffReader;
import lesson22_file.PathFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework22_solution implements PathFile {
    public static void main(String[] args) {
        System.out.println(createFolder("homework"));
        System.out.println(createFile("new_file.txt"));
        System.out.println(writeTextToFile("new_file.txt", "my text1"));
        System.out.println(writeTextToFile("new_file.txt111", "my text1"));
        System.out.println("========================");
        System.out.println(writeStudentToFile());
    }

    static boolean writeStudentToFile(){
        Student student = new Student();
        try {
            student = StudentBuffReader.createStudentFromConsole();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        createFile("student.txt");
        return writeTextToFile("student.txt", student.toString());
    }

    static boolean writeTextToFile(String fileName, String text){
        String path = PathFile.HOME_23 + File.separator + "homework" +
                File.separator + fileName;
        File file = new File(path);
        if(file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(text);
                //fileWriter.close();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }else
            return false;
    }

    static boolean createFolder(String folderName) {
        String path = PathFile.HOME_23 + File.separator + folderName;
        File folder = new File(path);
        return folder.mkdir();
    }

    static boolean createFile(String fileName) {
        String path = PathFile.HOME_23 + File.separator + "homework" +
                File.separator + fileName;
        File file = new File(path);
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("created exception " + e.toString());
            return false;
        }
    }
}
