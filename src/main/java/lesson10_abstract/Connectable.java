package lesson10_abstract;

public interface Connectable {

    void connectWiFi();

    void connectBluetooth();

    default void disconnect(){
        System.out.println("Device disconnect!!!");
    }
}
