import java.util.ArrayList;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class OnlineShoppingManager {
    private ArrayList<Product> inventory;

    public OnlineShoppingManager() {
        inventory = new ArrayList<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        boolean productFound = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                productFound = true;
                System.out.println(name + " has been removed from the inventory.");
                break;
            }
        }
        if (!productFound) {
            System.out.println("Product with name " + name + " not found in inventory.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product product : inventory) {
                System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category);
            }
        }
    }

    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();
        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");
        manager.displayInventory();
        manager.removeProduct("Book");
        manager.displayInventory();
        manager.removeProduct("Laptop");
        manager.displayInventory();
        manager.removeProduct("Smartphone");
    }
}
