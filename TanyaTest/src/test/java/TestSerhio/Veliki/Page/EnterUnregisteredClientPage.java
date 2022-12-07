package TestSerhio.Veliki.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterUnregisteredClientPage extends BasePage {
    public EnterUnregisteredClientPage (WebDriver driver) {
        super(driver);
    }

    public void goToVeliki() {
        driver.get("https://veliki.com.ua/");
    }
    public WebElement velikiUa(){
        return findElementByXpath("//span[@class = 'cur']");
    }
    public WebElement fieldRegistration() {
        return findElementByXpath("//div [@class='client notentered']");
    }
    public WebElement fieldLogin() {
        return findElementByXpath("//span//input [@name=\"email\"]");
    }
    public WebElement fieldPassword() {
        return findElementByXpath("//span//input [@name=\"pass\"]");
    }
    public WebElement buttonEnterRegistration() {
        return findElementByXpath("//div[@class=\"butt\"]//button[@class=\"butt1\"]");
    }
    public WebElement btnINewBuyer() {
        return findElementByXpath("//span[contains (text (), 'Я новий')]");
    }
    public void validLogPass(){
        fieldRegistration().click();
        fieldLogin().sendKeys("1979girchenko@gmail.com");
        fieldPassword().sendKeys("Zaq12wsX");
    }
}
