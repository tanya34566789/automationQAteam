package AttemptPower.TestChain;

import AttemptPower.PageForTest.basket2aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class basket2aTest extends TestInit {
    @Test
    public void basket2aEpicentr() {
        basket2aPage basket2a = new basket2aPage(driver);
        basket2a.goToEpicentr();
        basket2a.goCatalog();
        basket2a.goShampoo();
        basket2a.addToBasket();
        basket2a.removeGoodsFromBasket();
    }
}
