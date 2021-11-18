import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;

    @Before
    public void before() {
        drawer = new Drawer(DrawerType.A1);
    }

    @Test
    public void hasDrawerType() {
        assertEquals(DrawerType.A1, drawer.getDrawerType());
    }

    @Test
    public void priceStartsAtZero() {
        assertEquals(0, drawer.getPrice());
    }

    @Test
    public void productStartsEmpty() {
        assertEquals(0, drawer.getProduct().size());
    }
}
