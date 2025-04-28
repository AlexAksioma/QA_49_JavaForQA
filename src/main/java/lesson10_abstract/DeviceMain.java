package lesson10_abstract;

import java.time.LocalDate;

public class DeviceMain {
    static String company = SmartPhone.COMP1;

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024, 6, 25);
        System.out.println(localDate);  //2024-06-25
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(LocalDate.now());
        System.out.println("===================================");
        SmartPhone smartPhone1 = new SmartPhone("Nokia", "A33",
                LocalDate.of(2021, 12, 25), "grey", 5);
        System.out.println(smartPhone1);
        smartPhone1.operate();
        smartPhone1.powerOn();
        System.out.println("======================================");
        smartPhone1.connectBluetooth();  //abstract
        smartPhone1.connectWiFi();   //abstract
        smartPhone1.disconnect();    //default  not abstract
        String comp1 = smartPhone1.COMP1;
        //String comp2 = smartPhone1.COMP2;
        System.out.println(comp1);
        System.out.println(SmartPhone.COMP2);
    }
}
