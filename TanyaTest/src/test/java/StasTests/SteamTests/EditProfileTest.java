package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTest extends SteamPage {
    @Test
    public void editProfile(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.accountPullDown().click();
        steamHomePage.viewMyProfile().click();
        steamHomePage.editMyProfileButton().click();
        steamHomePage.editRealName().clear();
        steamHomePage.editRealName().sendKeys(realName());
        steamHomePage.generalSave().click();
        steamHomePage.editMyAvatar().click();
        steamHomePage.myImageForProfile().click();
        steamHomePage.saveAvatar().click();
        steamHomePage.myImageForProfile().click();
        steamHomePage.saveAvatar().click();
        steamHomePage.accountPullDown().click();
        steamHomePage.viewMyProfile().click();
        Assert.assertEquals(realName(), steamHomePage.realNameField().getText());
    }
}
