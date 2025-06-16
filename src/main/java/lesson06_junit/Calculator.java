package lesson06_junit;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("summ = " + sum(10, 22));

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
        }
    }

    public static Integer sum(int a, int b) {
        return a + b;
    }

}
