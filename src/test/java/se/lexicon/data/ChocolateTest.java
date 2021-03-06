package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateTest {

    private Chocolate test;

    @Before
    public void setup(){
        test = new Chocolate(10,10,"test",100,100,"test","test");
    }

    @Test
    public void test_fields(){

        // Product fields
        assertEquals(10, test.getStock());
        assertEquals(10, test.getPrice());
        assertEquals("test",test.getName());
        assertEquals(100,test.getSize());
        assertEquals(100,test.getCalories());
        // Chocolate fields
        assertEquals("test",test.getLightOrDark());
        assertEquals("test",test.getContain());

    }
}
