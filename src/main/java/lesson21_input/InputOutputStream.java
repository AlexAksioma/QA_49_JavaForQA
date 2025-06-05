package lesson21_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputOutputStream {

    /*
    InputStream      OutputStream    0/1
    Reader           Writer          symbols(char)
     */

    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        double age = 0.;
        int id = 0;
        try {
            System.out.println("name:");
            name = bufferedReader.readLine();
            System.out.println("age:");
            age = Double.parseDouble(bufferedReader.readLine());
            System.out.println("id:");
            id = Integer.parseInt(bufferedReader.readLine());
            System.out.println("name --> " + name + " age --> " + age + " id --> " + id);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
