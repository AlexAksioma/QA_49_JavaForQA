package lesson23_file;

import lesson22_file.PathFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile implements PathFile {
    public static void main(String[] args) {
        String filePath = PathFile.HOMEWORK + File.separator + "new_file.txt";
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //System.out.println(fileReader.read());
            //System.out.println(fileReader.read());
            //fileReader.close();
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("==========================");
        System.out.println(readFromFile("new_file.txt"));
        System.out.println(readFromFile("new_file123.txt"));
        System.out.println(readFromFile("empty.txt"));
    }

    static List<String> readFromFile(String fileName) {
        String path = PathFile.HOMEWORK + File.separator + fileName;
        List<String> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {  //file.exists() == false
            System.out.println("file not exist");
            return null;
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null)
                    list.add(line);
                else
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
