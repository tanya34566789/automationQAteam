package TestFromVlados.UiTest.ForSpotifyTests;


import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class SpotifyPage extends TestInit {
    public void goSpofify() {
        driver.get("https://open.spotify.com/");
    }

    public String emailSpotify() {
        return "zarvavlad@ukr.net";
    }

    public String passwordSpotify() {
        return "lz809743lz809743";
    }

    public String searchTrackOFD() {
        return "O.F.D.";
    }

    public String searchTrackPopStars() {
        return "pop/stars";
    }

    public Actions actions() {
        return new Actions(driver);
    }

    @BeforeMethod
    public void loginSpotify() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        goSpofify();
        spotifyHomePage.loginButton().click();
        spotifyHomePage.emailField().sendKeys(emailSpotify());
        spotifyHomePage.passwordField().sendKeys(passwordSpotify());
        spotifyHomePage.signButton().click();
        spotifyHomePage.closeNotification().click();
    }
}
