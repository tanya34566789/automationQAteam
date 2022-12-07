package TestSerhio.Veliki.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BergamontDiscontPage extends BasePage {
    public BergamontDiscontPage (WebDriver driver) {
        super(driver);
    }
    public void goToVeliki() {
        driver.get("https://veliki.com.ua/");
    }
    public WebElement velikiUa(){
        return findElementByXpath("//span[@class = 'cur']");
    }
    public WebElement getSearchFildVeliki() {
        return findElementByXpath("//div[@class='butt-search']");
    }
    public WebElement getSearchInput() {
        return findElementByXpath("//div//input[@type='search']");
    }
    public WebElement getDiscountBike() {
        return findElementByXpath("//span[@class='anchor disc']");
    }
    public WebElement delPrice() {return findElementByXpath("//del");
    }
}
