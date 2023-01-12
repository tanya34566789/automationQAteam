package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerRegistrationPage extends BasePage {
    public SellerRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement phoneNumberLink(){
        return findElementByXpath("//a[contains(@title, 'phone')]");
    }

    public WebElement fillOutAnApplicationBtn(){
        return findElementByXpath("//button[contains(@class, '_ZoeZ')]");
    }

    public WebElement registrationSideMenu(){
        return findElementByXpath("//div[contains(@class, 'b24-window-panel')]");
    }

    public WebElement closeMenuBtn(){
        return findElementByXpath("//div[contains(@class, 'b24-window-panel')]/button[contains(@class, 'b24-window-close')]");
    }

    public WebElement nameCompanyInput(){
        return findElementByXpath("(//input[contains(@class, 'b24-form-control')])[1]");
    }

    public WebElement personalNameInput(){
        return findElementByXpath("//input[contains(@autocomplete, 'given-name')]");
    }

    public WebElement phoneNumberInput(){
        return findElementByXpath("//input[contains(@type, 'tel')]");
    }

    public WebElement emailInput(){
        return findElementByXpath("//input[contains(@type, 'email')]");
    }

    public WebElement personalWebAddress(){
        return findElementByXpath("(//input[contains(@class, 'b24-form-control')])[5]");
    }

    public WebElement typesOfGoodsInput(){
        return findElementByXpath("(//input[contains(@class, 'b24-form-control')])[6]");
    }

    public WebElement textArea(){
        return findElementByXpath("//textarea[contains(@class, 'b24-form-control')]");
    }

    public WebElement submitBtn(){
        return findElementByXpath("//textarea[contains(@class, 'b24-form-control')]");
    }



}
