package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Footer extends BasePage {
    public HomePage_Footer(WebDriver driver) {
        super(driver);
    }

public WebElement socialNetworksContainer(){
        return driver.findElement(By.id("//div[contains(@class, 'footer__blue')]"));
}

public WebElement footerContainer(){
        return driver.findElement(By.id("//div[contains(@class, 'footer__info')]"));
}
}
