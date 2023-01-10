package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }


    public WebElement decreaseBtn(){
        return findElementByXpath("//button[contains(@class, 'decrease')]");
    }

    public WebElement addBtn(){
        return findElementByXpath("//button[contains(text(), '+')]");
    }

    public WebElement numberOfBuyInput(){
        return findElementByXpath("//input[contains(@class, 'input form-quantity__input')]");
    }

    public WebElement totalSumOfPurchase(){
        return findElementByXpath("//span[contains(@class, 'send-sum--new')]");
    }

    public WebElement purchaseBtn (){
        return findElementByXpath("//button[contains(@class, 'purchase-btn')]");
    }

    public boolean purshEndWebPage(){
        driver.get("https://epicentrk.ua/ua/personal/order/make/");
        return true;
    }

    public WebElement continuePursh(){
        return findElementByXpath("//button[contains(@class, 'btn--3')]");
    }
}
