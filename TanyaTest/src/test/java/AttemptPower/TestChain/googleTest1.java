package AttemptPower.TestChain;

import FrameworkClasses.TestInit;
import AttemptPower.PageForTest.googleHome;
import org.testng.annotations.Test;

public class googleTest1 extends TestInit {

    @Test
    public void openGoogle(){
        googleHome googleHomePage = new googleHome(driver);
        googleHomePage.goToGoogle();
        googleHomePage.makeSomething();
        googleHomePage.clickImageSomething();
        googleHomePage.clickSettingsSomething();
        googleHomePage.clickColorSomething();
        googleHomePage.clickColoryEllowSomething();
        googleHomePage.clickCleanUpSomething();
        googleHomePage.clickAllSomething();
        googleHomePage.findJava();
        googleHomePage.assertJavaSearch();
        googleHomePage.findBash();
        googleHomePage.assertBashSearch();
        googleHomePage.findCatAndAssert();
        sleep(1);
        googleHomePage.assertCatSearch();
        googleHomePage.findGit();
        googleHomePage.assertGitSearch();
        googleHomePage.findRozetka();
        googleHomePage.pressGoogleRozetka();
        googleHomePage.searchAuditGoogle();
        sleep(4);
    }
}
