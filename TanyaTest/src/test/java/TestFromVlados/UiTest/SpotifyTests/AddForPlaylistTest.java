package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddForPlaylistTest extends SpotifyPage {

    @Test
    public void addTrackForPlaylist() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        spotifyHomePage.openTrack().click();
        actions().contextClick(spotifyHomePage.moveToTrack()).perform();
        spotifyHomePage.likedTrack().click();
        spotifyHomePage.goLikedPlaylist().click();
        Assert.assertTrue(spotifyHomePage.checkTrackInPlaylist().isDisplayed());
        spotifyHomePage.unLikedTrack().click();
        Assert.assertNotEquals(spotifyHomePage.checkTrackInPlaylistNull().size(), 0);
    }
}
