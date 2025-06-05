package lesson21_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BuffReaderMethods {
    public static void main(String[] args) {
        try {
            System.out.println(fillListFromConsole());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<String> fillListFromConsole() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("input string (exit)");
        while (true){
            String input = reader.readLine();
            if(input.equalsIgnoreCase("exit"))
                break;
            list.add(input);
        }
        return list;
    }
}
