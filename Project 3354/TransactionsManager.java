import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.util.Map;
import java.util.HashMap;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 
//manages transaction inventory

public class TransactionsManager {
    private List<Transaction> transactions;

    //constructor
    public TransactionsManager() {
        transactions = new ArrayList<>();
    }
    //method for adding incoming transactions to list
    public void addIncomingTransaction(Store store, Product product, int amount) {
        Transaction transaction = new IncomingTransaction(store, product, amount);
        transactions.add(transaction);
    }
   //method for adding outgoing transaction to list
    public void addOutgoingTransaction(Store store, Product product, int numberOfItems) {
        Transaction transaction = new OutgoingTransaction(store, product, numberOfItems);
        transactions.add(transaction);
    }

  //write transactions to file
  public void appendToFile(String fileName,String transaction) {
        try {
          BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)); 
            writer.write(transaction);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
