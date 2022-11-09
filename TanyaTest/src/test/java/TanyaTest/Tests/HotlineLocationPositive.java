package TanyaTest.Tests;


import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineLocationPositive extends TestInit {
    public HotlineLocationPositive(WebDriver driver) {
        super();
    }
    @Test
    private void navigateHotline() {

        driver.get("https://hotline.ua");
    }
    public void ChangeCorrectLocation() {
   HotlineLocationPositive hotlineLocationPositive = new HotlineLocationPositive(driver);
       hotlineLocationPositive.navigateHotline();
//        hotlineLocationPositive.locationBTN().click();
//        hotlineLocationPositive.locationKyiv().click();
//
//       Assert.assertEquals(hotlineLocationPositive.getLocation(), "Київ");
    }
}
