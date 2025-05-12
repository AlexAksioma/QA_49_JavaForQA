package lesson15_set;

import java.util.*;

public class ClassWorkSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Gennadiy");
        names.add("Oleg");
        names.add("Vlad");
        names.add("Masha");
        names.add("Misha");
        names.add("Sasha");
        System.out.println(names);
        TreeSet<String> tail = (TreeSet<String>) names.tailSet("Oleg");
        System.out.println(tail);
        TreeSet<String> head = (TreeSet<String>) names.headSet("Oleg");
        System.out.println(head);
        TreeSet<String> subSet = (TreeSet<String>) names.subSet("Masha", "Sasha");
        System.out.println(subSet);
        //TreeSet<String> subSet1 = (TreeSet<String>) names.subSet("Sasha", "Masha");
        //System.out.println(subSet);
        System.out.println(names.first());
        System.out.println(names.last());
        String s1 = "Misha";
        String s2 = "Misha1";
        System.out.println(s1.compareTo(s2));  // Misha < Misha1
        System.out.println();
        System.out.println(names.floor("Misha1"));
        System.out.println(names.higher("Misha1"));
        System.out.println("=============================");
        List<String> listNames = new ArrayList<>(names);
        System.out.println(listNames);
        listNames.add("Misha");
        listNames.add(null);
        listNames.add(null);
        System.out.println(listNames);
        HashSet<String> newSet = new HashSet<>(listNames);
        System.out.println(newSet);
        System.out.println("========================");
        deleteRepeatedWord("To be, or  not to be!");

        System.out.println("=========Collections===========");
        System.out.println(listNames);
        Collections.shuffle(listNames);
        System.out.println(listNames);
        Collections.reverse(listNames);
        System.out.println(listNames);
        Collections.swap(listNames, 1, 2);
        System.out.println(listNames);
        listNames.removeIf(s -> s == null);
        System.out.println(listNames);
        listNames.removeIf(s -> s.equals("Misha"));
        System.out.println(listNames);
        System.out.println(Collections.min(listNames));
        System.out.println(Collections.max(listNames));
        Collections.sort(listNames);
        System.out.println(listNames);

    }

    //   To be or not to be    --> to be or not to be

    static void deleteRepeatedWord(String text){
        if(text == null || text.isBlank())
            return;
        String[] array = text.trim().toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(array));
        //List<String> list = Arrays.asList(array);
        //System.out.println(list);
        //LinkedHashSet<String> hashSet = new LinkedHashSet<>(list);
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(hashSet);

        //Set<String> set = Set.of(array);
        //System.out.println(set);  wrong
    }
}
