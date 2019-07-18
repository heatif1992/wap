package dataaccesslayer;


import models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Productbase {
    private static ArrayList<Product> db = new ArrayList<>();


    public static boolean productExists(Product product) {
        if (product == null) return false;
        setDB();
        return db.contains(product);
    }

    public static ArrayList<Product> getDb() {
        setDB();
        return db;
    }

    public static Product getProduct(int id) {
        setDB();
        return db.stream().filter(product -> product.getId() == id).collect(Collectors.toList()).get(0);
    }

    public static List<Product> searchProducts(String query) {
        setDB();
        return db.stream()
                .filter(product ->
                        product.getName().toLowerCase().equals(query.toLowerCase())
                                || product.getPrice() == Double.parseDouble(query.replaceAll("[^0-9]", "0"))
                )
                .collect(Collectors.toList());
    }

    public static ArrayList<Product> getAdverts() {
        setDB();
        ArrayList<Product> ads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int ranIndex = r.nextInt((8) + 1);
            ads.add(db.get(ranIndex));
        }
        return ads;
    }

    private static void setDB() {
        //add demo data
        if (db.size() == 0) {
            db.add(new Product(1, "Apple iPhone 7 Plus", 800));
            db.add(new Product(2, "Samsung Galaxy S9", 900));
            db.add(new Product(3, "LG G8 ThinQ", 500));
            db.add(new Product(4, "LG Stylo 4", 560));
            db.add(new Product(5, "Samsung Galaxy S10", 600));
            db.add(new Product(6, "LG Stylo 4 ", 700));
            db.add(new Product(7, "Apple iPhone 7", 900));
        }
    }


}
