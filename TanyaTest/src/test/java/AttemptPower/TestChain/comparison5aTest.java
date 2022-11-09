package AttemptPower.TestChain;

import AttemptPower.PageForTest.comparison5aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class comparison5aTest extends TestInit {
    @Test
    public void comparison5aEpicentr() {
        comparison5aPage comparison5a = new comparison5aPage(driver);
        comparison5a.goToEpicentr();
        comparison5a.goCatalogInteriorDoors();
        comparison5a.goComparisonAddMore();
    }
}
