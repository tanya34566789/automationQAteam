package AttemptPower.TestChain;

import AttemptPower.PageForTest.catalog3aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class catalog3aTest extends TestInit {
    @Test
    public void catalog3aEpicentr() {
        catalog3aPage catalog3a = new catalog3aPage(driver);
        catalog3a.goToEpicentr();
        catalog3a.goCatalogField();
    }
}
