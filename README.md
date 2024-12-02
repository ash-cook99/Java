# Java Project

# Introduction

### The purpose of this project is to develop an Inventory Management System for a business franchise, which holds summary detail of all the business’ stores, as well as the product inventory stock. This program overall is a management system that provides users with the ability to carry out transactions and generate summary reports. The students implemented this system using Java coding language.

# Files

## Main.java

### This class is the entry point of the program and contains the main method. It provides a command-line interface for users to interact with the Inventory Management System. Users can add products, stores, perform incoming and outgoing transactions, and generate reports using the prompts and input provided through the console. The loop allows users to continuously interact with the system until they choose to exit.

## Product.java

### Product class is needed to carry relevant attributes for the product placed in the system. Methods are needed to access the product data and amend the product detail such as the ID, Name, and count.

## Store.java

### The class signifies the stores within the business franchise. The constructor initializes the store with the data/attibutes ”name” and ”address”. Methods with getters and setters provide access and ability to edit the store’s attributes.

## StockManager.java

### Product inventory and relevant stores are managed by the stockmanager class. The constructor is used to manage the products and store data. We then use many methods to provide functionality. To complete our goal the class needs methofs to add data to the list, by taking the corresponding objects. Also, return the lists of all the products in stock and stores.

## Transactions.java

### There are two types of transactions, but a Transaction class was needed for general processing of all the Transactions and their details. The HashMap is helpful in storing data into the product list. This class uses methods to return the list of products and number of products involved in each transaction. The addProduct method allows the addition of a product and it’s quanity to the product list.

## IncomingTransactions.java

### This class has a constructor that inherent data from the Transaction class and all of its functionality. Store, Product, and numberOfItems is used as input to initialize the transaction. No methods are needed. The items are added to the inventory

## OutgoingTransactions.java

### This class has a constructor that inherent data from the Transaction class and all of it’s functinoality. Store, Product, and numberOfItems is used a s input to initialize the transaction. No methods are needed. The items from the inventory are sent to a store.

## TransactionsManager.java

### TransactionsManager is an important class that manages incoming and outgoing transactions. The constructor is used to initialize our transaction list. Methods are used to help manage transaction actions and reporting purposes. The class can add new incoming/outgoing transactions to our system
