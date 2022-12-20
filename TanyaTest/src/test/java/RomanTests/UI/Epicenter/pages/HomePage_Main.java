package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Main extends BasePage {
    public HomePage_Main(WebDriver driver) {
        super(driver);
    }

    public WebElement AdvertisingSlider(){
        return driver.findElement(By.xpath("//div[contains(@id, 'Rotator')]/div[contains(@class, 'vtlkSlider')]"));
    }


}
