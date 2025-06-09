package lesson22_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MethodWriteToFile implements PathFile {
    public static void main(String[] args) {
        try {
            writeToFile("file1.txt", "new text", false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writeToFileNew("file2.txt", "qwerty", false);
    }

    static void writeToFile(String fileName, String text, boolean flag) throws IOException {
        String filePath = HOME + File.separator + fileName;
        File file = new File(filePath);
        file.createNewFile();
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file, flag);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(text);
            writer.close();
        }
    }

    static void writeToFileNew(String fileName, String text, boolean flag) {
        String filePath = HOME + File.separator + fileName;
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(new File(filePath), flag)))
        {
            writer.write(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
