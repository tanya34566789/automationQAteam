package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultSearchElectronicsPage extends BasePage {
    public ResultSearchElectronicsPage(WebDriver driver) {
        super(driver);
    }

   public List<WebElement> getElementsWithGunText(){
        return findElementsByXpath("//*[contains(text(), 'electron')]");
//        return findElementsByXpath("//*[contains(text(), 'gun')]");
   }

   public WebElement freezerKS1100F(){
        return findElementByXpath("//span[contains(text(), 'KS110')]");
   }

   public WebElement termoreg(){
        return findElementByXpath("//span[contains(text(), 'ТЕРМОРЕГУЛЯТОРИ')]");
   }

   public WebElement element(){
        return findElementByXpath("(//a[contains(@class, 'btn--social-icon')])[1]");
   }

    public List<WebElement> microphonesList(){

        return findElementsByXpath("//span[contains(text(), 'Мікрофон')]/ancestor::div[contains(@class, 'card ')]");
    }

    public List<WebElement> likeList() {
        return findElementsByXpath("//a[contains(@onclick, 'favorite')]");
    }
    public WebElement compareElByMicrophone() {
        return findElementByXpath("//a[contains(@class, 'js-tooltip-top')]");
    }

    public List<WebElement> compareBtns() {
        return findElementsByXpath("//a[contains(@onclick, 'compare')]");
    }
    public WebElement compareBtn() {
        return findElementByXpath("//a[contains(@onclick, 'compare')]");
    }

    public WebElement microphoneSE7(){
        return findElementByXpath("//*[contains(text(), 'sE7')]");
    }

    public List<WebElement> cards(){
        return findElementsByXpath("//div[contains(@class, 'card ')]");
    }

//    public List<WebElement> byBtnsYellow(){
//        return findElementsByXpath("//button[contains(@class, 'js-btn--buy')]");
//    }

    public WebElement byBtnYellow(){
        return findElementByXpath("//button[contains(@class, 'js-btn--buy')]");
    }



}
