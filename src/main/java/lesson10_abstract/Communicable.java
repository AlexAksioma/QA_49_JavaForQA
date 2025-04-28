package lesson10_abstract;

public interface Communicable {

    void ring();

    default void makeSms(){
        System.out.println("Sms !!!");
    }
}
