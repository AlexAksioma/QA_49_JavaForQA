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
            //bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("============================================");
        try {
            System.out.println(createText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    static String createText() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder result = new StringBuilder();
        System.out.println("input word:");
        String word = bufferedReader.readLine();
        while (!word.equalsIgnoreCase("exit")) {
            result.append(word).append(" ");
            word = bufferedReader.readLine();
        }
        return result.toString();

}

    static String createTextWrong() throws IOException {   //wrong method
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder result = new StringBuilder();
        System.out.println("input word:");
        while (!bufferedReader.readLine().equalsIgnoreCase("exit")) {
            String word = bufferedReader.readLine();
            result.append(word).append(" ");
        }
        return result.toString();

    }
}
