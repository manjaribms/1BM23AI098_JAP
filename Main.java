import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class OnlineShoppingManager {
    private Vector<Product> inventory = new Vector<>();

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equals(name)) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayProducts() {
        for (Product product : inventory) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();
        manager.addProduct("Phone", 699.99, "Electronics");
        manager.addProduct("Backpack", 39.99, "Accessories");
        manager.addProduct("Pen", 1.99, "Stationery");

        System.out.println("All Products:");
        manager.displayProducts();

        manager.removeProduct("Backpack");

        System.out.println("After Removing 'Backpack':");
        manager.displayProducts();
    }
}
