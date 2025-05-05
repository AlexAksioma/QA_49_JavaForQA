package lesson13;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie() {
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0
                && year == movie.year
                && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, year);
    }

    @Override
    public int compareTo(Movie another) {   // 1.45   3.56
        double rating1 = this.getRating();
        double rating2 = another.getRating();
        return Double.compare(rating1, rating2);
        //return (int)(rating1 - rating2);   //1.45 - 1.75 = -0.3  --> 0
    }
}
