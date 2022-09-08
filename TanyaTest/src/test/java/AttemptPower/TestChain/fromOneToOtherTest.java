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

        goGoogleHome.goToGoogle();

        goGoogleHome.findGoogleMap();
        goGoogleMap.clickHowToGetButton();

//        goGoogleMap.clickRestaurantOnTheWay();
//        goGoogleMap.goToCozyBar();
//        goGoogleMap.clickLeaveRestaurant();

        goGoogleMap.clickChangeDestination();
        goGoogleMap.clickMenuButton();

//        goGoogleMap.clickDirectory();
//        goGoogleMap.writeSearchInDirectory();
//        goGoogleMap.clickFoundInDirectory();
//        goGoogleMap.clickCloseDirectory();
//        goGoogleMap.clickDoNotStore();
//        goGoogleMap.enter();

    }
}
