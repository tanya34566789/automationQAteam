package AttemptPower.TestChain;

import AttemptPower.PageForTest.sorting2aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class sorting2aTest extends TestInit {
    @Test
    public void sorting2aEpicentr() {
        sorting2aPage sorting2a = new sorting2aPage(driver);
        sorting2a.goToEpicentr();
        sorting2a.goLaptops();
        sorting2a.goLaptopsFilter();
    }
}
