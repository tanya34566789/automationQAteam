package AttemptPower.TestChain;

import AttemptPower.PageForTest.search2aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class search2aTest extends TestInit {
    @Test
    public void search2aEpicentr() {
        search2aPage search2a = new search2aPage(driver);
        search2a.goToEpicentr();
        search2a.findSomething();
        search2a.findSomethingTwo();
    }
}
