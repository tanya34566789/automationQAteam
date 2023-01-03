package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePage extends BasePage {
    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public WebElement compareBtn(){
        return findElementByXpath("//header/a[contains(@class, 'btn--blue')]");
    }

    public WebElement compareContainer(){
        return findElementByXpath("//div[contains(@class, 'table_compare')]");
    }
}
