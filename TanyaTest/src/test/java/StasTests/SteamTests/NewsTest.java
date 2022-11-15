package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.annotations.Test;

public class NewsTest extends SteamPage {
    @Test
    public void newsTest(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.news().click();
        steamHomePage.newsFeatured().click();
        steamHomePage.newsSteamOfficial().click();
    }
}