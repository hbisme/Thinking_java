package page15.generics;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;

        System.out.println(this);
    }

    public void priceChange(double change) {
        this.price += change;
    }

    public static Generator<Product> generator() {
        return new Generator<Product>() {
            private Random rand = new Random(47);

            @Override
            public Product next() {
                return new Product(rand.nextInt(1000), "Test", rand.nextDouble() * 1000);
            }
        };
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}


class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator(), nProducts);
    }
}

class Aisles extends ArrayList<Shelf> {
    public Aisles(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++) {
            this.add(new Shelf(nProducts));
        }
    }
}


class CheckoutStand {
}

class Office {
}

public class Store extends ArrayList<Aisles>{
    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisles(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisles a : this) {
            for (Shelf s : a) {
                for (Product p : s) {
                    result.append(p);
                    result.append("\n");
                }

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Store store = new Store(14, 5, 10);
        System.out.println(store);

    }
}
