package AttemptPower.TestChain;

import AttemptPower.PageForTest.googleHome;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class googleTest1 extends TestInit {

    @Test
    public void openGoogle(){
        googleHome googleHomePage = new googleHome(driver);
        googleHomePage.goToGoogle();
        googleHomePage.makeSomething();
        googleHomePage.findJava();
        googleHomePage.findBash();
        googleHomePage.findCatAndAssert();
        googleHomePage.findGit();
        googleHomePage.findRozetka();
        googleHomePage.listFoundGoods();
    }
}
