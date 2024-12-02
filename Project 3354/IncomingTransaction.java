public class IncomingTransaction extends Transaction {
    //specific to this class field
    private Store store;
    //constructor for the class that takes store, product, num of itens as input
    public IncomingTransaction(Store store, Product product, int numberOfItems) {
        //set the store for current incoming transaction
        this.store = store;
        super.addProduct(product, numberOfItems);
    }
}
