package lesson13.classwork;

public class MainSupermarket {
    public static void main(String[] args) {
        Product p1 = new Product("Apple", 101, "kg", 3.5);
        Product p2 = new Product("Banana", 102, "kg", 1.2);
        Product p3 = new Product("Carrot", 103, "kg", 2.0);
        Product p4 = new Product("Tomato", 104, "kg", 4.5);
        Product p5 = new Product("Potato", 105, "kg", 1.8);
        Product p6 = new Product("Onion", 106, "kg", 2.3);
        Product p7 = new Product("Lettuce", 107, "head", 1.5);
        Product p8 = new Product("Cucumber", 108, "kg", 1.9);
        Product p9 = new Product("Milk", 109, "liter", 1.0);
        Product p10 = new Product("Eggs", 110, "dozen", 2.7);
        SuperMarket superMarket = new SuperMarket("WallMart", "Herzel 20, Rehovot");
        superMarket.addProduct(p1, 30);
        superMarket.addProduct(p2, 50);
        superMarket.addProduct(p3, 100);
        superMarket.addProduct(p4, 60);
        superMarket.addProduct(p5, 150);
        superMarket.addProduct(p6, 40);
        superMarket.addProduct(p7, 25);
        superMarket.addProduct(p8, 77);
        superMarket.addProduct(p9, 666);
        superMarket.addProduct(p10, 45);

        superMarket.printProducts();
        Product p11 = new Product("Apple", 101, "kg", 3.5);
        superMarket.addProduct(p11, 50);
        Product p11_1 = new Product("Apple Green", 101, "kg", 3.5);
        superMarket.addProduct(p11_1, 50);
        superMarket.printProducts();
    }
}
