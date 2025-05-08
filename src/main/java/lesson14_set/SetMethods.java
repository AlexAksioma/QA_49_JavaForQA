package lesson14_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMethods {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Ivan");
        stringHashSet.add("Oleg");
        stringHashSet.add("Dasha");
        stringHashSet.add(null);
        System.out.println(stringHashSet);
        String str1 = "Ivan";
        System.out.println(str1.hashCode());  //2291258
        String str2 = "Dasha";
        System.out.println(str2.hashCode());  //65802991
        System.out.println(str1.equals(str2));
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("Ivan");
        stringLinkedHashSet.add("Oleg");
        stringLinkedHashSet.add("Dasha");
        stringLinkedHashSet.add(null);
        System.out.println(stringLinkedHashSet);
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Ivan");
        stringTreeSet.add("Oleg");
        stringTreeSet.add("Dasha");
        stringTreeSet.add("Anton");
        //stringTreeSet.add(null); wrong
        System.out.println(stringTreeSet);
        //=========================================
        HashSet<Integer> intSet = new HashSet<>(50);
        LinkedHashSet<Character> charSet = new LinkedHashSet<>(70, 0.75f);
        HashSet<Integer> intSet1 = new HashSet<>(intSet);
        System.out.println(intSet1.add(13));
        System.out.println(intSet1.add(13));
        intSet1.add(135);
        intSet1.add(1);
        intSet1.add(-22);
        System.out.println("=========================================");
        System.out.println(intSet1);
        System.out.println(intSet1.contains(-22));
        System.out.println(intSet1.remove(-22));
        System.out.println(intSet1.remove(-22));
        System.out.println(intSet1.size());
        System.out.println(intSet1.isEmpty());
        System.out.println("=========================================");
    }
}
