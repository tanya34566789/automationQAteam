package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;

public class FoxtrotBasketPage extends BasePage {
    public FoxtrotBasketPage(WebDriver driver) {
        super(driver);
    }
    public void navigateFoxtrot() {
        driver.get("https://www.foxtrot.com.ua/");
    }
    
}
