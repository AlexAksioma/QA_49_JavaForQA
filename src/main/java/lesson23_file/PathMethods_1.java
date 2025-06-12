package lesson23_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PathMethods_1 {
    public static void main(String[] args) throws IOException {
        final String FILE = "C:\\Java_QA_Projects\\QA_49\\QA_49_JavaForQA" +
                "\\src\\main\\java\\lesson23_file\\path_file.txt";
        //Files.copy(Paths.get(FILE), Paths.get("C:\\Java_QA_Projects\\QA_49" +
                //"\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\new_path_file.txt"));
        //Files.move(Paths.get(FILE), Paths.get("C:\\Java_QA_Projects\\QA_49" +
                //"\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\new_path_file_1.txt"));
        //Files.delete(Paths.get("C:\\Java_QA_Projects\\QA_49" +
                //"\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\new_path_file_1.txt"));
        System.out.println(Files.exists(Paths.get("C:\\Java_QA_Projects\\QA_49" +
                "\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\new_path_file.txt")));
        System.out.println(Files.notExists(Paths.get("C:\\Java_QA_Projects\\QA_49" +
                "\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file\\new_path_file.txt")));
        System.out.println(Files.isDirectory(Paths.get("C:\\Java_QA_Projects\\QA_49" +
                "\\QA_49_JavaForQA\\src\\main\\java\\lesson23_file")));
    }
}
