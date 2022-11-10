package StasTests.SteamTests;


import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends SteamPage {
    @Test
    public void authorization(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
    goSteam();
    steamHomePage.loginButton().click();
    steamHomePage.loginName().sendKeys(logName());
    steamHomePage.loginPassword().sendKeys(logPass());
    steamHomePage.loginConfButton().click();
        Assert.assertTrue(steamHomePage.accountPullDown().isDisplayed());
    }
}