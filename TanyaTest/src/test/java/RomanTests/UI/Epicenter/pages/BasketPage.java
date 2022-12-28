package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }


    public WebElement decreaseBtn(){
        return findElementByXpath("    //button[contains(@class, 'decrease')]() {}");
    }

    public WebElement numberOfBuyInput(){
        return findElementByXpath("//input[contains(@class, 'input form-quantity__input')]");
    }
}
