package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreezerPage extends BasePage {
    public FreezerPage(WebDriver driver) {
        super(driver);
    }



    public WebElement buyBtn() {
        return findElementByXpath("//div[contains(@class, 'p-buy')]/button[contains(@class, 'p-buy__btn')]");
    }
    public WebElement price(){
        return findElementByXpath("//div[contains(@class, 'p-price__main')]");
    }
}
