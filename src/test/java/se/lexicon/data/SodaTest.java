package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SodaTest {

    private Soda test;

    @Before
    public void setup(){
        test = new Soda(10,10,"test",100,100,"test","yes");
    }

    @Test
    public void test_fields(){

        // Product fields
        assertEquals(10, test.getStock());
        assertEquals(10, test.getPrice());
        assertEquals("test",test.getName());
        assertEquals(100,test.getSize());
        assertEquals(100,test.getCalories());
        // Soda fields
        assertEquals("test",test.getLightOrNot());
        assertEquals("yes",test.getCarbonated());

    }

}
