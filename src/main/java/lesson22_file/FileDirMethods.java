package lesson22_file;

import java.io.File;
import java.io.IOException;

public class FileDirMethods {
    public static void main(String[] args) {
        //  C:\\users\\user  '/'
        // /Users/user       '\'
        String home = System.getProperty("user.home");
        System.out.println(home);
        System.out.println(File.separator);
        String folderPath = home + File.separator + "_myfolder";
        System.out.println(folderPath);
        File folder = new File(folderPath);
        System.out.println(folder.mkdir());
        File newFile = new File(
                home + File.separator + "_myfolder"
                        + File.separator + "newfile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(newFile.delete());
        System.out.println(newFile.getAbsolutePath());
        System.out.println(newFile.getTotalSpace());
        System.out.println(newFile.getParent());
        System.out.println(newFile.getName());
    }
}
