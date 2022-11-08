package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;

public class HotlineLocationNegativeTest extends BasePage {

    public HotlineLocationNegativeTest(WebDriver driver) {
        super(driver);
    }
    public WebElement locationBTN() {
        return waitElementToBeClickable("//div[@class='header__location-button hidden-below-xl']");
    }
    public WebElement fieldForCityName() {
        return waitElementToBeClickable("//div[@class= 'modal__body']");

}
}