package TanyaTest.Tests;

import FrameworkClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineLocationNegative extends TestInit {
    @Test
    private void navigateHotline() {
        driver.get("https://hotline.ua");
        public void ChangeNotCorrectLocation() {
            HotlineLocationNegative hotlineLocationNegative = new HotlineLocationNegative(driver);
            hotlineLocationNegative.navigateHotline();
            hotlineLocationNegative.locationBTN().click();
            hotlineLocationNegative.fieldForCityName().sendKeys("Tanya");
            Assert.assertTrue(fieldForCityName().isDisplayed());

        }
    }
}


