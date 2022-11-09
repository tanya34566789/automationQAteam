package AttemptPower.TestChain;

import AttemptPower.PageForTest.catalog1aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class catalog1aTest extends TestInit {
    @Test
    public void catalog1aEpicentr() {
        catalog1aPage catalog1a = new catalog1aPage(driver);
        catalog1a.goToEpicentr();
        catalog1a.goCatalog();
        catalog1a.goTableLamps();
    }
}
