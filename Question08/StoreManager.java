import java.util.ArrayList;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class RetailStore {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.name.equals(name));
    }

    public void editProduct(String name, Double price, Integer quantity) {
        for (Product product : products) {
            if (product.name.equals(name)) {
                if (price != null) product.price = price;
                if (quantity != null) product.quantity = quantity;
            }
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayInfo();
        }
    }
}

public class StoreManager {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();
        store.addProduct(new Product("Apple", 1.5, 10));
        store.addProduct(new Product("Carrot", 0.8, 15));
        store.addProduct(new Product("Rice", 2.0, 5));

        System.out.println("Available Products:");
        store.displayProducts();

        store.editProduct("Apple", 1.2, null);
        store.removeProduct("Carrot");

        System.out.println("\nUpdated Products:");
        store.displayProducts();
    }
}
