package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PanelVolumeTests extends SpotifyPage {
    @Test
    public void volumeOnOff() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.volumeButton().click();
        Assert.assertTrue(spotifyHomePage.volumeOffAssert().isDisplayed());
        spotifyHomePage.volumeButton().click();
        Assert.assertTrue(spotifyHomePage.volumeOnAssert().isDisplayed());
    }
}
