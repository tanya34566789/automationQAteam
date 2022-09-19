package AttemptPower.TestChain;

import AttemptPower.PageForTest.basket1aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class basket1aTest extends TestInit {

    @Test
    public void basket1aEpicentr() {
        basket1aPage basket1a = new basket1aPage(driver);
        basket1a.goToEpicentr();
        basket1a.goCatalog();
        basket1a.goMensClothing();
        basket1a.addToCart();
    }
}
