package se.lexicon;

import se.lexicon.ux.Deposit;
import se.lexicon.ux.VendingMachine;
import se.lexicon.ux.VendingMachineFunk;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        VendingMachine testing = new VendingMachineFunk();
        VendingMachineFunk testing2 = new VendingMachineFunk();

        testing.addChocolate(10,100,"Test",100,100,"Light","Nutts");
        testing.addSoda(10,100,"Test",100,100,"Test","Test");
        testing.addGum(10,100,"Test",100,100,"Test","Test");
        testing2.addProduct(10,100,"test",100,100);

        // Find Array

        // Find product
       // Product testItem = testing.request(1);
        // Deposit money
        testing.addCurrency(Deposit.DEP1000.deposit());
        System.out.println("Balans: "+testing.getBalance());

        System.out.println(testing.request(1));
        System.out.println("Balans: "+testing.getBalance());
        System.out.println(testing.request(1));
        System.out.println("Change: "+testing.endSession());
        System.out.println("Balans: "+testing.getBalance());
        System.out.println("Get product");
        System.out.println(testing.getDescription(1));
       // System.out.println(testing.buy(testItem));


    }
}
