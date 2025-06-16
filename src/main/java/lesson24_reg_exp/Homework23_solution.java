package lesson24_reg_exp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;

public class Homework23_solution {
    /*
    Created methods
1. void printFromFile(String fileName) (use BuffReader, WO buffReader)
   - print text
   - print message (file is empty, not exists)

2. boolean copyFile(Sting fileSource, String fileTarget)
     */
    static final String HOME = "C:\\Java_QA_Projects\\QA_49\\QA_49_JavaForQA\\src\\main\\java\\lesson24_reg_exp";

    public static void main(String[] args) {
        printFromFile("my_file.txt");
        System.out.println("=======================");
        //printFromFile("empty.txt");
        //printFromFile("empty.txt1111");
        //printFromFile("");
        System.out.println("=======================");
        //System.out.println(copyFile("my_file.txt","my_file1.txt"));
        //System.out.println(copyFile("", "dir_my_file2.txt"));
        System.out.println(copyFile("my_file.txt", null));
    }

    static boolean copyFile(String fileSource, String fileTarget) {
        if(fileSource == null || fileTarget == null
                || fileSource.isBlank() || fileTarget.isBlank()){
            System.out.println("file name is null or empty");
            return false;
        }
        String sourcePAth = HOME + File.separator + fileSource;
        String targetPAth = HOME + File.separator + fileTarget;
        Path source = Paths.get(sourcePAth);
        Path target = Paths.get(targetPAth);
        if (!Files.isRegularFile(source)) {
            System.out.println("source is not a file");
            return false;
        }
        try {
            //Files.copy(source, target);  //if target exists --> java.nio.file.FileAlreadyExistsException
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("smth went wrong copyFile");
            return false;
        }
    }

    static void printFromFile(String fileName) {
        File file = new File(HOME + File.separator + fileName);
        if (file.length() == 0L) { //file.exists() == false
            System.out.println("file not exists or empty");
            return;
        }
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = bf.readLine()) != null)
                System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("created exception");
        }
    }
}
