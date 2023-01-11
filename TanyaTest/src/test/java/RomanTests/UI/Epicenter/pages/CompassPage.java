package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CompassPage extends BasePage {
    public CompassPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> allFiltersBtns(){
        return findElementsByXpath("//div[contains(@class, 'button-group27')]/a");
    }

    public WebElement chipGoodsFilter() {
        return findElementByXpath("//a[contains(@data-href,'asc')] [contains(@class,'btnFiltr')]");
    }

    public WebElement expensiveGoodsFilter(){
        return findElementByXpath("//a[contains(@data-href,'desc')] [contains(@class,'btnFiltr')]");
    }

    public WebElement popularGoodsFilter(){
        return findElementByXpath("//a[contains(@data-href,'desc')] [contains(@class,'btnFiltr')]");
    }

    public WebElement sharesGoodsFilter(){
        return findElementByXpath("//a[contains(@data-href,'aktsii')] [contains(@class,'btnFiltr')]");
    }

    public WebElement selfPickupGoodsFilter(){
        return findElementByXpath("//a[contains(@class, 'btnFiltr')]/span[contains(@class, 'new-sort')]");
    }

    public List<WebElement> cardBoxes(){
        return findElementsByXpath("//div[contains(@class, 'card__info')]");
    }

    public WebElement filterHidden(){
        return findElementByXpath("//div[contains(@class, 'product-list-wrapper__filter')]");
    }

    public WebElement filterForm(){
        return findElementByXpath("//form[contains(@class, 'smartfilter')]");
    }

    public WebElement filterWrapper(){
        return findElementByXpath("//div[contains(@id, 'filter-wrapper')]");
    }

    //FILTER elements

    public WebElement minPriceInput(){
        return findElementByXpath("//input[contains(@class, 'min-price')]");
    }
    public WebElement maxPriceInput(){
        return findElementByXpath("//input[contains(@class, 'max-price')]");
    }

    public WebElement checkBoxEpicenter(){
        return findElementByXpath("//input[contains(@data-filter-element, 'epicentr')]/parent::label");
    }

    public WebElement checkBoxAceCamp(){
        return findElementByXpath("//input[contains(@data-filter-element, 'AceCamp')]/parent::label");
    }

    public WebElement checkBoxAceMFH(){
        return findElementByXpath("//input[contains(@data-filter-element, 'MFH')]/parent::label");
    }

    public WebElement checkBoxOther(){
        return findElementByXpath("//input[contains(@data-filter-element, 'other')]/parent::label");
    }

    public WebElement checkBoxLiquidless(){
        return findElementByXpath("//input[contains(@data-filter-element, '6tAGV4M3XhfStkGf')]/parent::label");
    }

    public WebElement checkBoxWeight(){
        return findElementByXpath("//input[contains(@data-filter-element, '100.0000')]/parent::label");
    }

    public WebElement showMoreFilterBtn(){
        return findElementByXpath("//button[contains(@class, 'filter-block__more')]");
    }


    public WebElement clearAllFilterBtn(){
        return findElementByXpath("//div[contains(@class, 'uncheck-all')]");
    }




}
