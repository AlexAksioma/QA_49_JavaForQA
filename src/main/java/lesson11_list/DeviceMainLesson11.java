package lesson11_list;

import java.time.LocalDate;
import static lesson11_list.ShowPrograms.*;

public class DeviceMainLesson11 {
    public static void main(String[] args) {
        SmartTV smartTV1 = new SmartTV("LG", "Qullet",
                LocalDate.of(2020, 11, 22), true, 45);
        SmartTV smartTV2 = new SmartTV("LG", "Ser 123",
                LocalDate.of(2024, 1, 1), true, 33);
        SmartTV smartTV3 = new SmartTV("LG", "Qullet",
                LocalDate.of(2022, 12, 22), false, 45);
        SmartTV[] arrayTV = {smartTV2, smartTV1, smartTV3, null};
        printArrayTV(arrayTV);
        showArrayTV(arrayTV);
        ShowPrograms.showTV();
        showTV();
    }

    static void printArrayTV(SmartTV[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty");
            return;
        }
        for (SmartTV tv : array) {
            if (tv == null)
                System.out.println("TV is null");
            else
                System.out.println(tv.toString());
        }
    }

    static void showArrayTV(SmartTV[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty");
            return;
        }
        for (SmartTV tv : array) {
            if (tv == null)
                System.out.println("TV is null");
            else
                tv.show();;
        }
    }
}
