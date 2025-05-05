package lesson13;

import java.util.Comparator;

public class ComparatorByNameRByYearByRating implements Comparator<Movie> {
    @Override  //name reverse, year and rating
    public int compare(Movie m1, Movie m2) {
        int result = 0;
        result = m2.getName().compareTo(m1.getName());
        if (result != 0)
            return result;
        result = Integer.compare(m1.getYear(), m2.getYear());
        if (result != 0)
            return result;
        return Double.compare(m1.getRating(), m2.getRating());
    }
}
