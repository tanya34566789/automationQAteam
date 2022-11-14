package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveGameFromLibraryTest extends SteamPage {
    @Test
    public void removeGameFromLibrary(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.accountPullDown().click();
        steamHomePage.accountDetails().click();
        steamHomePage.accountLicenses().click();
        steamHomePage.removeLicense().click();
        steamHomePage.deleteOK().click();
        Assert.assertTrue(steamHomePage.removeAssert().isDisplayed());
    }
}