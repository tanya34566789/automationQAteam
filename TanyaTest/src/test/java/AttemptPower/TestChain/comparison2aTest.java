package AttemptPower.TestChain;

import AttemptPower.PageForTest.comparison2aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class comparison2aTest extends TestInit {
    @Test
    public void comparison2aEpicentr() {
        comparison2aPage comparison2a = new comparison2aPage(driver);
        comparison2a.goToEpicentr();
        comparison2a.goCatalogScrewdrivers();
        comparison2a.goAddInComparison();
        comparison2a.goRemoveInComparison();
    }
}
