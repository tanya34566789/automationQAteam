package TestFromVlados.UiTest.SpotifyTests;
п
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayTrackTest extends SpotifyPage {

    @Test
    public void playMusik() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        spotifyHomePage.openTrack().click();
        spotifyHomePage.playTrack().click();
        Assert.assertTrue(spotifyHomePage.assertPause().isDisplayed());
    }
}
