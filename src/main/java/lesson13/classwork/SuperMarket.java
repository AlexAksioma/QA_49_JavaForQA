package lesson13.classwork;

import java.util.ArrayList;

public class SuperMarket {
    private String name;
    private String address;
    private ArrayList<Product> stock = new ArrayList<>();

    public SuperMarket() {
    }

    public SuperMarket(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

//    public void setStock(ArrayList<Product> stock) {
//        this.stock = stock;
//    }

    public void addProduct(Product product, double quantity) {
        if (!stock.contains(product)) {
            product.setQuantity(quantity);
            stock.add(product);
            stock.sort(null);
        } else {
            for (Product p : stock) {
                if (p.getCode() == product.getCode()) {
                    double q = p.getQuantity();
                    q += quantity;
                    p.setQuantity(q);
                    break;
                }
            }
        }
    }

    public void printProducts() {
        System.out.println("Supermarket - " + name);
        System.out.println("Address - " + address);
        System.out.println("====stock=====");
        for (Product p : stock) {
            System.out.println(p);
        }
        System.out.println("===============");
    }
}
