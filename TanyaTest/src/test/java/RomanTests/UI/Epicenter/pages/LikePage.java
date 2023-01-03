package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LikePage extends BasePage {
    public LikePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> delWiwhs() {
        return findElementsByXpath("//a[contains(@class, 'btn-round-close')]");
    }

    public WebElement emptyWish(){
        return findElementByXpath("//*[contains(@class, '_L2N1OF')]");
    }


}
