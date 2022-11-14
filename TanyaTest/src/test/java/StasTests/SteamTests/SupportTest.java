package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.annotations.Test;

public class SupportTest extends SteamPage {
    @Test
    public void steamSupportTest(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.supportSteam().click();
        steamHomePage.supportMyAccount().click();
        steamHomePage.supportSteamGuard().click();
        steamHomePage.contactSteamSupport().click();
        steamHomePage.supportTextArea().click();
        steamHomePage.supportTextArea().sendKeys("thank you for your answer, if you receive this message, then someone checks the test");
        steamHomePage.sendSupportMessage().click();
    }
}