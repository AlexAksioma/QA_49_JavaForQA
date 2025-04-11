package lesson09_oop;

public class BookMain {
    public static void main(String[] args) {
        System.out.println(Book.startIsbn);
        Book.printBookStatic();
        Book.changeStartIsbn(500L);
        System.out.println(Book.startIsbn);
        System.out.println("======================");
        Book book1 = new Book("Chechov", 300);
        System.out.println(book1.title + ":"+book1.pages);
        System.out.println(book1.toString());
        System.out.println(Book.startIsbn);
        Book book2 = new Book("Pushkin", 500);
        System.out.println(book2.toString());
        System.out.println(Book.startIsbn);
        System.out.println("========================");
        System.out.println(book1.toString());
        System.out.println(Book.startIsbn);
        System.out.println("========================");
        System.out.println(10==20);
        String str1 = "qwerty";
        String str2 = "qwerty";
        System.out.println(str1.equals(str2));
        System.out.println("========================");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        Book book3 = new Book("Chechov", 300);
        System.out.println(book3);
        System.out.println(book1.equals(book3));
        System.out.println("=====================");
        Book book4 = new Book("Chechov A.P.", 300);
        System.out.println("4 -->"+book4);
        System.out.println("1 -->"+book1);
        System.out.println(book4.equals(book1));
        System.out.println(book1.equals(book4));

    }
}
