package lesson23_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {
    public static void main(String[] args) {
        //Path - interface
        //Paths - class
        Path pathFile = Paths.get("C:\\Java_QA_Projects\\QA_49\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\homework\\student.txt");
        System.out.println(pathFile.getFileName());
        System.out.println(pathFile.getParent());
        System.out.println(pathFile.getRoot());
        System.out.println(pathFile.endsWith("student.txt"));
        System.out.println(pathFile.endsWith("dent.txt"));
        //======================================
        try {
            Path path1 = Files.createFile(Paths.get("C:\\Java_QA_Projects\\QA_49\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\path_file.txt"));
            System.out.println(Files.exists(Paths.get("C:\\Java_QA_Projects\\QA_49\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\path_file.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
