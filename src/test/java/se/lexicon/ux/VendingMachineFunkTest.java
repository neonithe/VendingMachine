package se.lexicon.ux;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.data.Product;
import se.lexicon.ux.VendingMachine;
import se.lexicon.ux.VendingMachineFunk;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VendingMachineFunkTest {

    VendingMachineFunk testingFunk = new VendingMachineFunk();

    @Before
    public void setup(){
     //   testingFunk.addCurrency(100);
        testingFunk.addSoda(100,50,"Test",100,100,"Test","Test");
        testingFunk.addChocolate(100,100,"Test",100,100,"Test","Test");
        testingFunk.addGum(100,100,"Test",100,100,"Test","Test");

    }
    @After
    public void clear(){
        testingFunk.clear();
    }

    @Test
    public void add_money(){

        // Add
        testingFunk.addCurrency(100);
        assertEquals(100,testingFunk.getBalance());

    }

    @Test
    public void get_balance(){
        // Setup
        testingFunk.addCurrency(100);
        int real = testingFunk.getBalance();
        //
        assertEquals(100,real);
        System.out.println(testingFunk.getBalance());

    }
    @Test
    public void get_description(){
        // Setup
        testingFunk.getDescription(1);

        System.out.println(testingFunk.getDescription(1));

    }
    @Test
    public void find_right_product(){

        testingFunk.findProduct(1);

        System.out.println(testingFunk.findProduct(1));

    }
    @Test
    public void check_saldo(){
        //Setup
        testingFunk.addCurrency(100);
        Product testItem = testingFunk.findProduct(1);
        // Real result
        boolean real = testingFunk.checkSaldo(testItem);

        assertEquals(true,real);

    }
    @Test
    public void buy_something_return_item(){

    }
    @Test
    public void reset_pool_and_return_change(){
        //Setup
        testingFunk.addCurrency(100);
        int pool = testingFunk.getBalance();

        // Change back
        assertEquals(100,testingFunk.endSession());
        // Pool empty
        assertEquals(0,testingFunk.getBalance());

    }

}
