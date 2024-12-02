public class OutgoingTransaction extends Transaction {
    //private variable to store for outgoing transactions
    private Store store;
    //constructor
    public OutgoingTransaction(Store store, Product product, int numberOfItems) {
        //call constructor of parrent class to add data
        super.addProduct(product, numberOfItems);
        this.store = store;
    }
}
