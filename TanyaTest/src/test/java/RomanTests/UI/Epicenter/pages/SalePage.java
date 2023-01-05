package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SalePage extends BasePage {
    public SalePage(WebDriver driver) {
        super(driver);
    }

    public void goSalePage(){
        driver.get("https://epicentrk.ua/ua/actions/");
    }

    public WebElement actualBtn(){
        return findElementByXpath("//a[contains(@class, '_19qD')]");
    }

    public WebElement archiveBtn(){
       return findElementByXpath("//a[contains(@href, 'archive')]");
    }

    public List<WebElement> actualItems(){
        return findElementsByXpath("//li[contains(@class, '_ZIUN')]");
    }
}
