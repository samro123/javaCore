package advanced.collections.arrayList;

import java.util.ArrayList;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Fidget spinner", 3.99, "It's fun."));
        products.add(new Product("Earbub", 39.99, "Extremely clear sound Waterproof"));

        products.add(1, new Product("36 AA batteries", 10.99, "High-performance"));
        products.remove(2);
        //products.remove(new Product("Earbub", 39.99, "Extremely clear sound Waterproof"));
        products.set(1, new Product("Rubber duck", 5.99, "You can't have bath without this."));
       // System.out.println(products);
        for(Product product: products){
            System.out.println(product);
        }

        System.out.println("The third element in the list:");
        System.out.println(products.get(1));
        System.out.println(products.size());
    }
}
