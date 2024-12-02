import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Transaction {
    private int ID;
    private Date date;
    //map to store product and their count
    private Map<Product, Integer> productList;
    //constructor
    public Transaction() {
        productList = new HashMap<>();
    }
   // getter 
    public Map<Product, Integer> getProductList() {
        return productList;
    }
   //method adding a product and quantity to transaction 
    public void addProduct(Product product, int numberOfItems) {
        productList.put(product, numberOfItems);
    }
   //display transaction product list details
    public void displayProductList() {
        System.out.println("Product List:");
        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            Product product = entry.getKey();
            int numberOfItems = entry.getValue();
            System.out.println(product.getProductName() + " - Quantity: " + numberOfItems);
        }
    }
    
}
