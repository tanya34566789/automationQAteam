package AttemptPower.TestChain;

import AttemptPower.PageForTest.information1aPage;

import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class information1aTest extends TestInit {
    @Test
    public void information1aEpicentr() {
        information1aPage information1a = new information1aPage(driver);
        information1a.goToEpicentr();
        information1a.goInformation();
        information1a.goInformationAddress();
    }
}
