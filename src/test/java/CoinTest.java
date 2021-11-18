import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before() {
        coin = new Coin(CoinType.TEN);
    }

    @Test
    public void hasValue() {
        assertEquals(CoinType.TEN, coin.getCoinType());
    }
}
