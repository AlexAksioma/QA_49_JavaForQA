package lesson13;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareToIgnoreCase(m2.getName());
        //name1   name2  use compareTo class String
    }
}
