package lesson10_abstract;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Device {
    private String brand;
    private String model;
    private LocalDate dateOfManufacture;//22.10.2020

    public Device() {
    }

    public Device(String brand, String model, LocalDate dateOfManufacture) {
        this.brand = brand;
        this.dateOfManufacture = dateOfManufacture;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateOfManufacture=" + dateOfManufacture;
    }

    @Override
    public boolean equals(Object anotherDevice) {  //device.equals(anotherDevice)
        if (anotherDevice == null || getClass() != anotherDevice.getClass()) return false;
        Device device = (Device) anotherDevice;
        return Objects.equals(brand, device.brand) && Objects.equals(model, device.model)
                && Objects.equals(dateOfManufacture, device.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, dateOfManufacture);
    }

    public void powerOn(){
        System.out.println(model + " - power on");
    }

    public abstract void operate();
}
