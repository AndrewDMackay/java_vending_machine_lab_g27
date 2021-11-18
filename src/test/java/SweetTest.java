import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before() {
        sweet = new Sweet("Caramel Wafer", "Tunnocks");
    }

    @Test
    public void hasName(){
        assertEquals("Caramel Wafer", sweet.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Tunnocks", sweet.getBrand());
    }
}
