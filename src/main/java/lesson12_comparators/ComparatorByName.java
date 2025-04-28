package lesson12_comparators;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        String name1 = p1.getName();
        String name2 = p2.getName();
        return name1.compareTo(name2);
    }
}
