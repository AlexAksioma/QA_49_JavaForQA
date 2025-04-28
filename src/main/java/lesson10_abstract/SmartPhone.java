package lesson10_abstract;

import java.time.LocalDate;
import java.util.Objects;

public class SmartPhone extends Device implements Connectable, Communicable, Operators{
    private String color;
    private int screenSize;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, LocalDate dateOfManufacture,
                      String color, int screenSize) {
        super(brand, model, dateOfManufacture);
        this.color = color;
        this.screenSize = screenSize;
    }

    @Override
    public void operate() {
        System.out.println("SmartPhone" + getModel() + " is available");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return screenSize == that.screenSize && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, screenSize);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", screenSize=" + screenSize +
                "} " + super.toString();
    }

    @Override
    public void powerOn(){
        System.out.println("SmartPhone "+getModel()+" power on");
    }

    @Override
    public void connectWiFi() {
        System.out.println("SmartPhone "+getModel()+" connect to WiFi");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("SmartPhone "+getModel()+" connect to bluetooth");
    }

    @Override
    public void ring() {
        System.out.println("SmartPhone is ringing!!!");
    }
}
