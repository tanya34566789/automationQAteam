package AttemptPower.TestChain;

import AttemptPower.PageForTest.googleHome;
import AttemptPower.PageForTest.googleMap;
import FrameworkClasses.BasePage;
import FrameworkClasses.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class fromOneToOtherTest extends TestInit {

    @Test
    public void openGoogleMap(){
        googleHome goGoogleHome= new googleHome(driver);
        googleMap goGoogleMap= new googleMap(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait(3);
        goGoogleHome.goToGoogle();
        goGoogleHome.findGoogleMap();
        goGoogleMap.clickHowToGetButton();
        goGoogleMap.writeWherefrom();
        goGoogleMap.writeGoTo();
        goGoogleMap.clickByPublicTransport();
//        goGoogleMap.clickRestaurantOnTheWay();
//        goGoogleMap.goToCozyBar();
//        goGoogleMap.clickLeaveRestaurant();
        goGoogleMap.clickChangeDestination();
        goGoogleMap.writeTwoGoTo();
        goGoogleMap.clickMenuButton();
//        goGoogleMap.clickDirectory();
//        goGoogleMap.writeSearchInDirectory();
//        goGoogleMap.clickFoundInDirectory();
//        goGoogleMap.clickCloseDirectory();
        goGoogleMap.clickSearchSettings();
        goGoogleMap.searchAuditGoogleMap();
        goGoogleMap.clickSafeSearch();
        goGoogleMap.clickResultsPerPage();
        goGoogleMap.clickNoPopularQueries();
        goGoogleMap.clickAnnouncementResults();
        goGoogleMap.clickResultsIn();
        goGoogleMap.clickMoreRegionSelection();
        goGoogleMap.clickRegionSelectionUkraine();
//        goGoogleMap.clickDoNotStore();
//        goGoogleMap.enter();
        sleep(5);
    }

//        Actions actions = new Actions(driver);
//        actions.moveToElement(goGoogleMap.elemOne());
//        actions.moveToElement(goGoogleMap.elemTwo());
//        actions.moveByOffset(300,0);
//        actions.contextClick(goGoogleMap.elemOne());


}
