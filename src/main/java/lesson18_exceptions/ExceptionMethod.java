package lesson18_exceptions;

public class ExceptionMethod {
    public static void main(String[] args) {
        System.out.println("start main");
        //division(10, 0);
        try {
            divisionThrow(100, 0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("stop main");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("created ArithmeticException");
        }
        System.out.println(result);
    }

    static void divisionThrow(int a, int b) throws ArithmeticException{
        int result = 0;
        result = a / b;
        System.out.println(result);
    }
}
