package AttemptPower.TestChain;

import AttemptPower.PageForTest.comparison3aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class comparison3aTest extends TestInit {
    @Test
    public void comparison3aEpicentr() {
        comparison3aPage comparison3a = new comparison3aPage(driver);
        comparison3a.goToEpicentr();
        comparison3a.goCatalogSmartphones();
        comparison3a.goCatalogLaptops();
        comparison3a.goCatalogComparison();
    }
}
