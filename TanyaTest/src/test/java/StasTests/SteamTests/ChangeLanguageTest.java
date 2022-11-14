package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends SteamPage {
    @Test
    public void changeLanguage(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.accountPullDown().click();
        actions().moveToElement(steamHomePage.changeLanguage()).perform();
        steamHomePage.languageJapanese().click();
        steamHomePage.primaryLanguageTrigger().click();
        steamHomePage.changeEnglishPrimary().click();
        steamHomePage.saveLanguage().click();
    }
}