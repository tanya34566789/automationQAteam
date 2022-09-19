package AttemptPower.TestChain;

import AttemptPower.PageForTest.catalog2aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class catalog2aTest extends TestInit {
    @Test
    public void catalog2aEpicentr() {
        catalog2aPage catalog2a = new catalog2aPage(driver);
        catalog2a.goToEpicentr();
        catalog2a.goCatalog();
        catalog2a.goCatalogPage();
        catalog2a.goEpicentrPage();
    }
}
