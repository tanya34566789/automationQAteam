package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CompasPageHelper extends CompassPage {
    public CompasPageHelper(WebDriver driver) {
        super(driver);
    }


    public boolean checkIsDisplayedCardBoxes() {
        for (WebElement cardBox: cardBoxes()) {
            Assert.assertTrue(cardBox.isDisplayed());
            return true;
        }
        return false;
    }
}
