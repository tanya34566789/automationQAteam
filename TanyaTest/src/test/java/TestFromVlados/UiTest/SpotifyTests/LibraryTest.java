package TestFromVlados.UiTest.SpotifyTests;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryTest extends TestInit {

    @BeforeMethod
    public void loginSpotify() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        SpotifyPage spotifyPage = new SpotifyPage(driver);
        spotifyPage.goSpofify();
        spotifyHomePage.loginButton().click();
        spotifyHomePage.emailField().sendKeys(spotifyPage.emailSpotify());
        spotifyHomePage.passwordField().sendKeys(spotifyPage.passwordSpotify());
        spotifyHomePage.signButton().click();
        spotifyHomePage.closeNotification().click();
    }

    @Test
    public void libraryCheck(){
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        SpotifyPage spotifyPage = new SpotifyPage(driver);
        spotifyHomePage.libraryButton().click();
        Assert.assertTrue(spotifyHomePage.libraryAssert().isDisplayed());
    }
}
