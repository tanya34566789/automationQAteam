package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PanelSkipReturnTest extends SpotifyPage {
    @Test
    public void paneltests() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackPopStars());
        spotifyHomePage.openTrack().click();
        spotifyHomePage.playTrack().click();
        Assert.assertTrue(spotifyHomePage.playOnPanel().isDisplayed());
        spotifyHomePage.nextTrackButton().click();
        Assert.assertTrue(spotifyHomePage.nextTrackAssert().isDisplayed());
        spotifyHomePage.backTrackButton().click();
        Assert.assertTrue(spotifyHomePage.backTrackAssert().isDisplayed());
    }
}
