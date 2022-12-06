package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PanelNextTrackListTest extends SpotifyPage {
    @Test
    public void TrackList() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.checkNextTrackList().click();
        Assert.assertTrue(spotifyHomePage.nextListAssert().isDisplayed());
    }
}
