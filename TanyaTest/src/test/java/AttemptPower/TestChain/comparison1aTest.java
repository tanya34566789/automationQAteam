package AttemptPower.TestChain;

import AttemptPower.PageForTest.comparison1aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class comparison1aTest extends TestInit {
    @Test
    public void comparison1aEpicentr() {
        comparison1aPage comparison1a = new comparison1aPage(driver);
        comparison1a.goToEpicentr();
        comparison1a.goCatalogBicycles();
        comparison1a.goAddInComparison();
    }
}
