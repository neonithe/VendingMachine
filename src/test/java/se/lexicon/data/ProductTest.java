package se.lexicon.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product test;

    @Before
    public void setup(){
        test = new Product(10, 10, "test", 100, 100) {
            @Override
            public String examine() {
                return null;
            }

            @Override
            public String use() {
                return null;
            }
        };
    }

    @Test
    public void test_fields(){

        // Product fields
        assertEquals(10, test.getStock());
        assertEquals(10, test.getPrice());
        assertEquals("test",test.getName());
        assertEquals(100,test.getSize());
        assertEquals(100,test.getCalories());

    }
}
