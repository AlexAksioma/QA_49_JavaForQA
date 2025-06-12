package lesson23_file;

import lesson22_file.PathFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathWriteRead implements PathFile {
    public static void main(String[] args) {
        writeToFile("1.txt", "my text");
        writeToFile("1.txt", "my text123");
        System.out.println(returnListFromFile("1.txt"));
        System.out.println(returnListFromFile("path_file.txt"));
    }

    static void writeToFile(String fileName, String text){
        String filePath = PathFile.HOME_23 + File.separator + fileName;
        //Path path = Paths.get(filePath);
        //Files.write(path);
        try {
            Files.write(Paths.get(filePath), text.getBytes());
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("smth went wrong");
        }
    }

    static List<String> returnListFromFile(String fileName){
        String filePath = PathFile.HOME_23 + File.separator + fileName;
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("smth went wrong");
            return null;
        }
    }
}
