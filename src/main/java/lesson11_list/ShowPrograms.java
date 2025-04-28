package lesson11_list;

public interface ShowPrograms {
    void show();

    default void showNetflix(){
        System.out.println("show Netflix");
    }

    static void showTV(){
        System.out.println("static method show TV");
    }
}
