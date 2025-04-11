package lesson09_oop;

public class HomeWork08_solution {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", 512, "i5", 1024);
        Computer computer2 = new Computer("Lenovo", 256, "i3", 512);
        Computer computer3 = new Computer("Lenovo", 1024, "i7", 512);
        Computer computer4 = new Computer("Apple", 512, "m3", 1024);
        Computer computer5 = new Computer("Apple", 1024, "m3", 512);
        //computer1.printComputer();
        Computer[] computers = {computer1, computer2, computer3, computer4, computer5};
        for (Computer comp : computers) {
            comp.printComputer();
        }
        System.out.println("===============================");
        printApple(computers);
    }

    public static void printApple(Computer[] compArray){
        if(compArray == null || compArray.length == 0){
            System.out.println("Smth went wrong");
            return;
        }
        for (Computer comp : compArray){
            if(comp == null)
                System.out.println("Computer is null");
            else if(comp.isApple())
                System.out.println(comp.toString());
        }
    }
}

