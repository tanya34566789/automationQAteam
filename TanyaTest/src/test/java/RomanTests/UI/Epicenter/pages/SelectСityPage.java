package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectСityPage extends BasePage {
    public SelectСityPage(WebDriver driver) {
        super(driver);
    }

    // MODAL - CHOICE OF RESIDENCE

    public WebElement close(){
        return findElementByXpath("//button[contains(@class, '_fOmpWm')]");
    }
    public WebElement searchFieldСity(){
        return findElementByXpath("//input[contains(@class, '_MGeWxP')]");
    }

    public WebElement resultOfSearchCity(){
        return findElementByXpath("//div[contains(@class, '_efdMLb')]");
    }

    public List<WebElement> resultsOfSearchCity(){
        return findElementsByXpath("//div[contains(@data-test, 'search-city-items')]");
    }

    public WebElement searchFieldСityClose(){
        return findElementByXpath("//div[contains(@class, '_bCXLRN')]");
    }

    public WebElement getBrovaryCity(){
        return findElementByXpath("//b[contains(text(), 'Бровари')]");
    }

    public  WebElement brovaryCityResultSearch(){
        return findElementByXpath("//div[contains(text(), 'Бровари')]");
    }

    public WebElement btnFilterByEpicenterShop(){
        return findElementByXpath("//button[contains(@class,'_tQOqL8')]");
    }

    public WebElement scrollContainerShopsChoice(){
        return findElementByXpath("//div[contains(@class,'_HWCigJ')]");
    }

    public WebElement btnOpenMap(){
        return findElementByXpath("//button[contains(text(), 'на карті')]");
    }

    public WebElement btnChioceShopByMap(){
        return findElementByXpath("//div[contains(@class,'_Y9MGI0')]");
    }


}
