package AttemptPower.TestChain;

import AttemptPower.PageForTest.login2aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class login2aTest extends TestInit {
    @Test
    public void search2aEpicentr() {
        login2aPage login2a = new login2aPage(driver);
        login2a.goToEpicentr();
        login2a.toLogin();
        login2a.enterData();
    }
}
