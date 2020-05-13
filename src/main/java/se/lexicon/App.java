package se.lexicon;

import se.lexicon.data.Chocolate;
import se.lexicon.data.Product;
import se.lexicon.data.Soda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product test = new Chocolate(10,10,"test",10,10, "dark","Nutts");
        Product test2 = new Soda(10,10,"Cola",100,100,"Light","Yes");

        System.out.println(test2.examine());
        System.out.println(test2.use());
    }
}
