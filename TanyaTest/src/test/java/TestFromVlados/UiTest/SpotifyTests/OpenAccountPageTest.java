package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountPageTest extends SpotifyPage {
    @Test
    public void openAccountTest() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.profileListButton().click();
        driver.getWindowHandle();
        spotifyHomePage.listProfile().get(0).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Assert.assertTrue(spotifyHomePage.assertAccountPage().isDisplayed());
    }
}
