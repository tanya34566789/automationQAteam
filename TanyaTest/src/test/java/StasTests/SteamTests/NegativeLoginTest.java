package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends SteamPage {
    @Test( dataProviderClass = SteamPage.class , dataProvider = "dataProvider")
    public void negativeAuthorization(String login, String password){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(login);
        steamHomePage.loginPassword().sendKeys(password);
        steamHomePage.loginConfButton().click();
        Assert.assertTrue(steamHomePage.errorAssert().isDisplayed());
    }
}
