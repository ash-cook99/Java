import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("    Inventory Management System");
        System.out.println("-----------------------------------");
        System.out.println("p: Add product");
        System.out.println("s: Add store");
        System.out.println("i: Perform incoming transaction");
        System.out.println("o: Perform outgoing transaction");
        System.out.println("r: Generate reports");
        System.out.println("x: Exit Program");

        //creating the objects
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        TransactionsManager transactionsManager = new TransactionsManager();

        //to keep track of the date for transactions
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  

        //while loop for menu options
        String action = "";
        while (!action.equals("x")) {
            System.out.print("Input an action: ");
            action = scanner.nextLine();

            //Add product
            if (action.equals("p")) {
                System.out.print("Enter Product ID: ");
                String productID = scanner.nextLine();
                System.out.print("Enter Product Name: ");
                String productName = scanner.nextLine();
                System.out.print("Enter product amount: ");
                int amount = scanner.nextInt();
                scanner.nextLine(); 

                stockManager.addProduct(new Product(productID, productName, amount));
                System.out.println();

            //Add store
            } else if (action.equals("s")) {
                System.out.print("Enter store name: ");
                String storeName = scanner.nextLine();
                System.out.print("Enter store address: ");
                String storeAddress = scanner.nextLine();

                stockManager.addStore(new Store(storeName, storeAddress));
                System.out.println();

              //Incoming transaction
            } else if (action.equals("i")) {
                List<Store> stores = stockManager.getStores();
                List<Product> products = stockManager.getProducts();

                System.out.println("Available Stores:");
                for (int i = 0; i < stores.size(); i++) {
                    System.out.println(i + ": " + stores.get(i).getName());
                }

                System.out.print("Select a store: ");
                int storeIndex = getValidIndex(scanner, stores.size());
                System.out.println("");

                System.out.println("Available Products:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + ": " + products.get(i).getProductName() + " " + products.get(i).getNumberOfItems());
                }

                System.out.print("Select a product: ");
                int productIndex = getValidIndex(scanner, products.size());

                System.out.print("Enter product amount: ");
                int amount = scanner.nextInt();

                //update amount
                for (int i = productIndex; i < products.size(); i++) {
                    int newAmount = products.get(i).getNumberOfItems();
                    int updatedAmount = newAmount - amount;
                    products.get(i).setNumberOfItems(updatedAmount);
                }
                scanner.nextLine(); 

                Store selectedStore = stores.get(storeIndex);
                Product selectedProduct = products.get(productIndex);

                transactionsManager.addIncomingTransaction(selectedStore, selectedProduct, amount);
                //Write transaction data to file called "transactions.txt"
                String transactionData = dtf.format(now) + " "+ selectedProduct.getProductID() + ", " + selectedProduct.getNumberOfItems() + ", " + amount;
    transactionsManager.appendToFile("incomingTransactions.txt", transactionData);
              
              //Outgoing transaction
            } else if (action.equals("o")) {
                List<Store> stores = stockManager.getStores();
                List<Product> products = stockManager.getProducts();

                System.out.println("Available Stores:");
                for (int i = 0; i < stores.size(); i++) {
                    System.out.println(i + ": " + stores.get(i).getName());
                }

                System.out.print("Select a store: ");
                int storeIndex = getValidIndex(scanner, stores.size());

                System.out.println("Available Products:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + ": " + products.get(i).getProductName() + " " + products.get(i).getNumberOfItems());
                
                }

                System.out.print("Select a product: ");
                int productIndex = getValidIndex(scanner, products.size());

                System.out.print("Enter product amount: ");
                int amount = scanner.nextInt();
                //update amount
                for (int i = productIndex; i < products.size(); i++) {
                    int newAmount = products.get(i).getNumberOfItems();
                    int updatedAmount = newAmount - amount;
                    products.get(i).setNumberOfItems(updatedAmount);
                }
                scanner.nextLine();

                Store selectedStore = stores.get(storeIndex);
                Product selectedProduct = products.get(productIndex);
              
                // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");  
                // LocalDateTime now = LocalDateTime.now();  
                //System.out.println(dtf.format(now)); 
              
                //append outgoing transactions to outgoing
                transactionsManager.addOutgoingTransaction(selectedStore, selectedProduct, amount);
                String transactionData = dtf.format(now) + " "+ selectedProduct.getProductID() + ", " + selectedProduct.getNumberOfItems() + ", " + amount;
    transactionsManager.appendToFile("outgoingTransaction.txt", transactionData);
  
            } else if (action.equals("r")) {
                System.out.println("");
                System.out.println("------ Product List ------");
                for (Product product : stockManager.getProducts()) {
                    System.out.println("Product ID: " + product.getProductID());
                    System.out.println("Product Name: " + product.getProductName());
                    System.out.println("Available Quantity: " + product.getNumberOfItems());
                    System.out.println("--------------------------");
                    stockManager.writeProductsToFile("products.txt");
                }
                System.out.println();
                System.out.println("------ Store List ------");
                for (Store store : stockManager.getStores()) {
                    System.out.println("Store Name: " + store.getName());
                    System.out.println("Store Address: " + store.getAddress());
                    System.out.println("--------------------------");
                    stockManager.writeStoresToFile("store.txt");
                }
                System.out.println();
            } else if (!action.equals("x")) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
  
    private static int getValidIndex(Scanner scanner, int maxIndex) {
        while (true) {
            try {
                int index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < maxIndex) {
                    return index;
                } else {
                    System.out.println("Invalid input. Please enter a valid index:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid index:");
            }
        }
    }
}
