package lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Homework12_solution {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic", 75.0, 1997);
        Movie movie2 = new Movie("The Dark Knight", 84.0, 2008);
        Movie movie3 = new Movie("Inception", 86.0, 2010);
        Movie movie4 = new Movie("The Matrix", 87.0, 1999);
        Movie movie5 = new Movie("Avatar", 83.0, 2009);
        Movie movie6 = new Movie("Interstellar", 74.0, 2014);
        Movie movie7 = new Movie("The Godfather", 100.0, 1972);
        Movie movie8 = new Movie("Pulp Fiction", 94.0, 1994);
        Movie movie9 = new Movie("Forrest Gump", 70.0, 1994);
        Movie movie10 = new Movie("Gladiator", 77.0, 2000);
        Movie movie11 = new Movie("Gladiator", 77.0, 2025);
        Movie movie12 = new Movie("Gladiator New", 77.0, 2025);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie2);
        movies.add(movie1);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        printList(movies);
        System.out.println("=========================");
        movies.sort(null);
        printList(movies);
        System.out.println("=========================");
        ComparatorByName comparatorByName = new ComparatorByName();
        movies.sort(comparatorByName);
        printList(movies);
        System.out.println("=========================");
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        movies.sort(comparatorByYear.reversed());
        printList(movies);
        System.out.println("=========================");
        movies.sort(Comparator.comparing(Movie::getName));
        System.out.println("=========================");
        movies.sort(new ComparatorByNameRByYearByRating());
        printList(movies);
        System.out.println("=========================");
        movies.sort(comparatorByYear.reversed().thenComparing(comparatorByName));
        printList(movies);
    }

    public static <T> void printList(List<T> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("wrong list");
            return;
        }
        for (T element : list)
            System.out.println(element);
    }
}
