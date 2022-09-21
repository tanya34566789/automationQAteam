package AttemptPower.TestChain;

import AttemptPower.PageForTest.sorting1aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class sorting1aTest extends TestInit {
    @Test
    public void sorting1aEpicentr() {
        sorting1aPage sorting1a = new sorting1aPage(driver);
        sorting1a.goToEpicentr();
        sorting1a.goCatalogElectronics();
        sorting1a.goCatalogSmartphones();
        sorting1a.goSmartphonesFilter();
    }
}
