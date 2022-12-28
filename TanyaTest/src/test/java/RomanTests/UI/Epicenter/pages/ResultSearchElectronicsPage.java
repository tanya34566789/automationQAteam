package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
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


}
