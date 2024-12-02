import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class StockManager {
    private List<Product> products;
    private List<Store> stores;

    //constructor 
    public StockManager() {
        products = new ArrayList<>();
        stores = new ArrayList<>();
    }

    //getters and setters
    public void addProduct(Product product) {
        products.add(product);
    }
    public void addStore(Store store) {
        stores.add(store);
    }
    public List<Product> getProducts() {
        return products;
    }
    public List<Store> getStores() {
        return stores;
    }
  
    //Method to write Products to .txt file
    public void writeProductsToFile(String fileName) {
        try {
          BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
            for (Product product : products) {
                writer.write(product.getProductID() + ", " + product.getProductName() + ", " + product.getNumberOfItems());
                writer.newLine();
            }
          writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
    //Method to write Stores to .txt file 
    public void writeStoresToFile(String fileName) {
        try {
          BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
            for (Store store : stores) {
                writer.write(store.getName() + ", " + store.getAddress());
                writer.newLine();
            }
          writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
