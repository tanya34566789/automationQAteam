package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PanelTrackLyricsTest extends SpotifyPage {
    @Test
    public void wordsList() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.buttonWordsForTrack().click();
        Assert.assertTrue(spotifyHomePage.wordForTrackAssert().isDisplayed());
    }
}
