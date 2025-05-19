package lesson16_map;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");
        capitals.put("USA", "Washington");
        System.out.println(capitals);
        capitals.put(null, "Haifa");
        System.out.println(capitals);
        System.out.println(capitals.put("USA", "LA"));
        System.out.println(capitals);
        System.out.println(capitals.put("ISRAEL", "TEL-AVIV"));
        System.out.println(capitals);
        System.out.println("==============================");
        Map<Integer, String> people = new LinkedHashMap<>(32);
        people.put(100, "Ivan");
        people.put(120, "Oleg");
        people.put(134, "Ivan");
        people.put(172, null);
        people.put(111, "Dasha");
        System.out.println(people);
        String name = people.get(120);
        System.out.println(name);
        name = people.get(0);
        System.out.println(name);
        name = people.get(172);
        System.out.println(name);
        System.out.println(people.remove(134));
        System.out.println(people.remove(111, "Dasha1111"));
        people.replace(100, "Ivan123", "New Ivan");
        people.replace(100, "New Ivan");
        System.out.println(people);
        System.out.println("=====================================");
        System.out.println(people.size());
        System.out.println(people.isEmpty());
        System.out.println(people.containsValue("New Ivan"));
        System.out.println(people.containsKey(999));
        System.out.println("=====================================");
        Set<Integer> keys = people.keySet();
        System.out.println(keys);
        Collection<String> values = people.values();
        System.out.println(values);
        System.out.println("============================");
        System.out.println(quantityLettersInWord("my name is Vasya my2"));
        System.out.println("============================");
        System.out.println(createSetKeysInt(people));
        System.out.println(createSetKeys(people));
        System.out.println(createSetKeys(capitals));
    }

    //my name is Vasya
    //my-2  name-4 is-2 Vasya-5
    static Map<String, Integer> quantityLettersInWord(String str){
        if(str == null || str.isBlank())
            return null;
        String[] array = str.trim().split("\\W");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String s : array){
            map.put(s, s.length());  //my,2   name,4  is,2  Vasya,5   my2,3
        }
        return map;
    }

    static Set<Integer> createSetKeysInt(Map<Integer, String> map){
        if(map == null || map.isEmpty())
            return null;
        Set<Integer> set = map.keySet();
        return set;
    }

    static <T, V> Set<T> createSetKeys(Map<T, V> map){
        if(map == null || map.isEmpty())
            return null;
        Set<T> set = map.keySet();
        return set;
    }
}
