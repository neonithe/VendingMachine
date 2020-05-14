package se.lexicon.ux;

import se.lexicon.data.Product;

public interface VendingMachine {

    Product addGum(int stock, int price, String name, int size, int calories, String lightOrNot, String packaging);
    Product addSoda(int stock, int price, String name, int size, int calories, String lightOrNot, String carbonated);
    Product addChocolate(int stock, int price, String name, int size, int calories, String lightOrDark, String contain);

    void addCurrency (int amount);
    Product request (int productNumber);
    int endSession ();
    String getDescription (int productNumber);
    int getBalance ();
    String [] getProducts ();

}
