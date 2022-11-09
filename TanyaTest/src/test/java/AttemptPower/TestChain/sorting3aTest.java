package AttemptPower.TestChain;

import AttemptPower.PageForTest.sorting3aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class sorting3aTest extends TestInit {
    @Test
    public void sorting3aEpicentr() {
        sorting3aPage sorting3a = new sorting3aPage(driver);
        sorting3a.goToEpicentr();
        sorting3a.goCatalogBlenders();
        sorting3a.goFilterBlenders();
        sorting3a.goRemoveFilter();
    }
}
