package lesson09_oop;

import java.util.Objects;

public class Book {
    static final int CONST = Integer.MAX_VALUE;
    static long startIsbn = 1000L;
    long isbn;
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        isbn = ++startIsbn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title);
        //return pages == book.pages && title.contains(book.title); wrong
        // b1.equals(b2) = b2.equals(b1)
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }

    //    @Override
//    public boolean equals(Object anotherBook) {    //book1.equals(anotherBook)  --> true | false
//        if (anotherBook == null || getClass() != anotherBook.getClass()) return false;
//        Book book = (Book) anotherBook;
//        return isbn == book.isbn && pages == book.pages && Objects.equals(title, book.title);
//    }  //book1(120, "Gogol", 250) book2(120, "Gogol", 250)  book1 equals book2
       //book1(333, "Gogol", 250) book2(120, "Gogol", 250)  book1 not equals book2

//    @Override
//    public int hashCode() {
//        return Objects.hash(isbn, title, pages);
//    }

    static void changeStartIsbn(long l) {
        startIsbn += l;
    }


    static void printBookStatic() {
        System.out.println("static " + startIsbn);
        //System.out.println(this.title); wrong
    }

    void printBookNonStatic() {
        System.out.println("non static");
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
