package AttemptPower.TestChain;

import AttemptPower.PageForTest.location1aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class location1aTest extends TestInit {
    @Test
    public void location1aEpicentr(){
        location1aPage location1a = new location1aPage(driver);
        location1a.goToEpicentr();
        location1a.goLocation();
    }
}
