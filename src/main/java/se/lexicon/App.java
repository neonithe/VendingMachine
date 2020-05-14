package se.lexicon;

import se.lexicon.data.Product;
import se.lexicon.ux.Deposit;
import se.lexicon.ux.VendingMachine;
import se.lexicon.ux.VendingMachineFunk;

import java.util.Arrays;

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

        // Deposit money
        testing.addCurrency(Deposit.DEP1000.deposit());

        System.out.println(testing.request(1)+"\n");
        System.out.println("Balans: "+testing.getBalance()+" | Change: "+testing.endSession()+" | New Balans: "+testing.getBalance());

        String[] test = testing.getProducts();
        for(int i =0; i < test.length; i++){
                System.out.println(test[i]);
        }
    }
}