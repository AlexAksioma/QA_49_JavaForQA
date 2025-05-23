package lesson18_exceptions;

import java.util.*;

public class HomeWork17_solution {
    public static void main(String[] args) {
//        - sorted by weight reverse
//                - sorted by name and age reverse
//                - sorted be name reverse, age and weigh
        Cat cat1 = new Cat(10, "Cat1", 5.5);
        Cat cat2 = new Cat(7, "Cat2", 7.5);
        Cat cat3 = new Cat(6, "Cat3", 3.5);
        Cat cat4 = new Cat(2, "Cat3", 10.);
        Cat cat5 = new Cat(2, "Cat3", 7.);
        TreeMap<Cat, Integer> treeMap1 = new TreeMap<>(new ComparatorByWeight().reversed());
        treeMap1.put(cat1, 100);
        treeMap1.put(cat2, 200);
        treeMap1.put(cat3, 300);
        System.out.println("weight reverse -->" + treeMap1);
        TreeMap<Cat, Integer> treeMap2 = new TreeMap<>(new ComparatorByNameAgeReverse());
        treeMap2.put(cat1, 100);
        treeMap2.put(cat2, 200);
        treeMap2.put(cat3, 300);
        treeMap2.put(cat4, 400);
        System.out.println("name and age reverse --> " + treeMap2);
        TreeMap<Cat, Integer> treeMap3 = new TreeMap<>(new ComparatorByNameReverseAgeWeight());
        treeMap3.put(cat1, 100);
        treeMap3.put(cat2, 200);
        treeMap3.put(cat3, 300);
        treeMap3.put(cat4, 400);
        treeMap3.put(cat5, 400);
        System.out.println("name reverse, age, weight --> " + treeMap3);
        System.out.println("==========================================");
        System.out.println(wordFreqSorted("To be or not to Be TO"));
        System.out.println("==========================================");
        System.out.println(firstRepeatedWord("To be or not to Be TO"));

    }

    static String firstRepeatedWord(String text){
        if (text == null || text.isBlank())
            return null;
        String[] array = text.trim().toLowerCase().split("\\W+");
        Set<String> set = new HashSet<>();
        for (String word : array){
            if(set.add(word) == false)  //  !set.add(word)
                return word;
        }
        return null;
    }

    static Map<String, Integer> wordFreqSorted(String text) {
        if (text == null || text.isBlank())
            return null;
        String[] array = text.trim().toLowerCase().split("\\W+");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            //To be or not to Be TO
            //to -->  put(to, 1)
            //be -->  put(be, 1)
            //or -->  put(or, 1)
            //not -->  put(not, 1)
            //to -->   put(to, 2)
        }
        return map;
    }

    static Map<String, Integer> wordFreqSortedV1(String text) {
        if (text == null || text.isBlank())
            return null;
        String[] array = text.trim().toLowerCase().split("\\W+");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : array) {   //To be or not to Be TO
            if (map.containsKey(word)) {
                int i = map.get(word);    //to-->1
                map.put(word, i + 1);     //to-->2
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}

class ComparatorByNameReverseAgeWeight implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        int result = c2.name.compareToIgnoreCase(c1.name);
        if (result != 0)
            return result;
        result = Integer.compare(c1.age, c2.age);
        if (result != 0)
            return result;
        return Double.compare(c1.weight, c2.weight);
    }
}

class ComparatorByNameAgeReverse implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        int result = c1.name.compareTo(c2.name);
        if (result != 0)
            return result;
        return Integer.compare(c2.age, c1.age);
    }
}

class ComparatorByWeight implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        return Double.compare(c1.weight, c2.weight);
    }
}

class Cat implements Comparable<Cat> {
    int age;
    String name;
    double weight;

    public Cat(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nCat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat anotherCat) {    //cat1.compareTo(cat2)
        return this.name.compareToIgnoreCase(anotherCat.name);
    }
}