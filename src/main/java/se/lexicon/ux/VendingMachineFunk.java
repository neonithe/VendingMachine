package se.lexicon.ux;


import se.lexicon.data.Chocolate;
import se.lexicon.data.Gum;
import se.lexicon.data.Product;
import se.lexicon.data.Soda;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class VendingMachineFunk implements VendingMachine{

    private int pool;
    private Product[] shelf = new Product[0];
    private int change;


    /** ADD PRODUCTS **/
    @Override
    public Product addGum(int stock, int price, String name, int size, int calories, String lightOrNot, String packaging){
        Product item = new Gum(stock,price,name,size,calories,lightOrNot,packaging);
        shelf = addArray(shelf, item);
        return item;
    }
    @Override
    public Product addSoda(int stock, int price, String name, int size, int calories, String lightOrNot, String carbonated){
        Product item = new Soda(stock,price,name,size,calories,lightOrNot,carbonated);
        shelf = addArray(shelf, item);
        return item;
    }
    @Override
    public Product addChocolate(int stock, int price, String name, int size, int calories, String lightOrDark, String contain){
        Product item = new Chocolate(stock,price,name,size,calories,lightOrDark,contain);
        shelf = addArray(shelf, item);
        return item;
    }

    public Product addProduct(int stock, int price, String name, int size, int calories){
        Product item = new Product(stock,price,name,size,calories) {
            @Override
            public String examine() {
                return null;
            }

            @Override
            public String use() {
                return null;
            }
        };
        shelf = addArray(shelf,item);
        return item;
    }

    public Product[] addArray(Product[] target, Product add){
        Product[] tempArray = Arrays.copyOf(target, target.length +1);
        tempArray[tempArray.length-1] = add;
        return tempArray;
    }

    @Override
    public void addCurrency(int amount){
        pool = amount;
    }

    @Override
    public Product request (int productNumber){
        Product item;
        // Find the product
        item = findProduct(productNumber);
        // Calculate
        if(checkSaldo(item)){
            int result = pool - item.getPrice();
                pool = result;
                System.out.println(item.use());
                return item;
        } else{
            System.out.println("Can't afford");
            return item;
        }
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
        String[] tempArray;
        return new String[0];
    }

    public Product[] findAll(){
        return shelf;
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

    public boolean checkSaldo(Product item){
        int price = item.getPrice();
            if(pool < price || pool == 0){
                return false;
            }
            return true;
    }

    public int findAllArray(){
        return shelf.length;
    }

    public void clear(){
        shelf = new Product[0];
    }
}
