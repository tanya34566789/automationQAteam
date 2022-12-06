package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PanelDeviceTest extends SpotifyPage {
    @Test
    public void deviceCheck() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.chooseDeviceButton().click();
        Assert.assertTrue(spotifyHomePage.deviceChooseAssert().isDisplayed());
    }
}
