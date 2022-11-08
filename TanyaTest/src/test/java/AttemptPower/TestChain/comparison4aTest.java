package AttemptPower.TestChain;

import AttemptPower.PageForTest.comparison4aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class comparison4aTest extends TestInit {
    @Test
    public void comparison4aEpicentr() {
        comparison4aPage comparison4a = new comparison4aPage(driver);
        comparison4a.goToEpicentr();
        comparison4a.goCatalogBactericidalLamps();
        comparison4a.goAddInComparison();
        comparison4a.goFuctionComparison();
    }
}
