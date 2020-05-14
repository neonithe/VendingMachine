package se.lexicon.ux;


import se.lexicon.data.Product;

import javax.swing.*;
import java.awt.*;

public class VendingMachineFunk implements VendingMachine{

    private int pool;
    private Product[] shelf;
    private int change;

    @Override
    public void addCurrency(int amount){
        pool = amount;
    }
    @Override
    public Product request (int productNumber){
        Product item =null;
        // Find the product
        if(findProduct(productNumber) == null){
            System.out.println("Can't find product");
        } else {
        // Remove amount, and update pool
            pool = buy(findProduct(productNumber));
            item = findProduct(productNumber);
        }
        return item;
    }

    @Override
    public int endSession() {
        change = pool;
        pool =0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        return findProduct(productNumber).examine();
    }

    @Override
    public int getBalance() {
        return pool;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

    public Product findProduct(int id){
        // Find the product
        Product product = null;
        for(Product item : shelf)
            if(item.getProductNr() == id){
                product = item;
                break;
            }
        return product;
    }

    public int buy(Product item){

        if(pool == 0 || item.getPrice() < pool){
            System.out.println("Not enough money");
            return pool;
        }else{
           int result = pool - item.getPrice();
            return result;
        }
    }

    public void bought(){

    }
}
