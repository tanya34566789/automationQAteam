package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineLocationPositivePage extends BasePage {
    public HotlineLocationPositivePage(WebDriver driver) {

        super(driver);
    }
    public WebElement locationBTN() {
        return waitElementToBeClickable("//div[@class='header__location-button hidden-below-xl']");
    }
     public WebElement locationKyiv() {
         return waitElementToBeClickable("//span[contains(text(), 'Київ')]");
     }

}



