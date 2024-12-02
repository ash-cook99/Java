public class Product {
    private String productID;
    private String productName;
    private int numberOfItems;
   //contructor for product class and adds new product with its product id, name, quanittiy
    public Product(String productID, String productName, int numberOfItems) {
        this.productID = productID;
        this.productName = productName;
        this.numberOfItems = numberOfItems;
    }
    //getters
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
