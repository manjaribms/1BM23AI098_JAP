import java.util.ArrayList;
class medicine {
    String name;
    double price;
    String category;
    int quantity;
    public medicine(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity=quantity;
    }
}

public class program7 {
    private ArrayList<medicine> inventory;

    public program7() {
        inventory = new ArrayList<medicine>();
    }

    public void addProduct(String name, double price, String category,int quantity) {
        medicine Medicine = new medicine(name, price, category,quantity);
        inventory.add(Medicine);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (medicine Medicine : inventory) {
            System.out.println("Name: " + Medicine.name + ", Price: " + Medicine.price + ", Category: " + Medicine.category );
        }
    }

    public static void main(String[] args) {
        program7 manager = new program7();
        manager.addProduct("NICIP", 100, "COLD AND FLU",10);
        manager.addProduct("CILACARTI", 50, "BLOOD PRESSURE REGULATOR",40);
        manager.addProduct("DOLO 650", 100, "FEVER-REDUCING",50);


        manager.displayInventory();


        manager.removeProduct("Book");


        manager.displayInventory();

        manager.removeProduct("Laptop");


        manager.displayInventory();
    }}
