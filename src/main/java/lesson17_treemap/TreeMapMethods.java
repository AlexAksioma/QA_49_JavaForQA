package lesson17_treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "str1");
        treeMap.put(50, "str2");
        treeMap.put(120, "str3");
        treeMap.put(2, "str4");
        treeMap.put(-123, "str5");
        System.out.println(treeMap);
        TreeMap<Integer, String> treeMapReverse = new TreeMap<>(Comparator.reverseOrder());
        treeMapReverse.putAll(treeMap);
        System.out.println(treeMapReverse);
        System.out.println("==============================");
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        //System.out.println(treeMap.pollFirstEntry());
        //treeMap.pollLastEntry();
        System.out.println(treeMap);
        Map<Integer, String> map1 = treeMap.headMap(40, true);
        System.out.println(map1);
        Map<Integer, String> map2 = treeMap.tailMap(50, false);
        System.out.println(map2);
        Map<Integer, String> map3 =
                treeMap.subMap(2, true, 100, true);
        System.out.println(map3);
        System.out.println("========================");
        System.out.println(treeMap);
        System.out.println(treeMap.higherKey(100));
        System.out.println(treeMap.lowerKey(100));
        System.out.println(treeMap.higherEntry(100));
        System.out.println(treeMap.lowerEntry(100).getValue());
        System.out.println("========================");
        Cat cat1 = new Cat(10, "Cat1", 5.5);
        Cat cat2 = new Cat(7, "Cat2", 7.5);
        Cat cat3 = new Cat(6, "Cat3", 3.5);
        TreeMap<Cat, String> cats = new TreeMap<>();
        cats.put(cat1, "Vasia");
        cats.put(cat3, "Petya");
        cats.put(cat2, "Dasha");
        System.out.println(cats);
        TreeMap<Cat, String> catsAge = new TreeMap<>(new ComparatorByAge());
        TreeMap<Cat, String> catsAge1 =
                new TreeMap<>((c1, c2) -> Integer.compare(c1.age, c2.age));
        catsAge.putAll(cats);
        System.out.println(catsAge);

    }
}
class ComparatorByAge implements Comparator<Cat>{
    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.age, c2.age);
    }
}
class Cat implements Comparable<Cat>{
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
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat anotherCat){    //cat1.compareTo(cat2)
        return this.name.compareToIgnoreCase(anotherCat.name);
    }
}
