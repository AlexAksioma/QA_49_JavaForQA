package lesson11_list;

import lesson10_abstract.Device;

import java.time.LocalDate;
import java.util.Objects;

public class SmartTV extends Device implements ShowPrograms{
    private int screenSize;
    private boolean isFullHD;

    public SmartTV() {
    }

    public SmartTV(String brand, String model, LocalDate dateOfManufacture,
                   boolean isFullHD, int screenSize) {
        super(brand, model, dateOfManufacture);
        this.isFullHD = isFullHD;
        this.screenSize = screenSize;
    }

    public boolean isFullHD() {
        return isFullHD;
    }

    public void setFullHD(boolean fullHD) {
        isFullHD = fullHD;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "isFullHD=" + isFullHD +
                ", screenSize=" + screenSize +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartTV smartTV = (SmartTV) o;
        return screenSize == smartTV.screenSize && isFullHD == smartTV.isFullHD;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize, isFullHD);
    }

    @Override
    public void operate() {
        System.out.println("Change program !!!");
    }

    @Override
    public void show() {
        System.out.println("SmartTV "+getBrand()+"-"+getModel()+" show");
    }


}
