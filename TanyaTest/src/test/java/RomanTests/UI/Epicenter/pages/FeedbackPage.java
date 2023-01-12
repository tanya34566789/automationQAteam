package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedbackPage extends BasePage {
    public FeedbackPage(WebDriver driver) {
        super(driver);
    }

    public WebElement feedbackContainer(){
        return findElementByXpath("//div[contains(@class, 'epicentrk__Yzc')]");
    }

    public WebElement nameFieldInput(){
        return findElementByXpath("(//label[contains(@class, 'epicentrk_GwNV')])[1]/input");
    }

    public WebElement phoneNumberFieldInput(){
        return findElementByXpath("(//label[contains(@class, 'epicentrk_GwNV')])[2]/input");
    }

    public WebElement emailFieldInput(){
        return findElementByXpath("(//label[contains(@class, 'epicentrk_GwNV')])[3]/input");
    }

    public WebElement typeOfAppealBox(){
        return findElementByXpath("//*[contains(@class, 'epicentrk_rzJc')]//parent::div[contains(@class, 'select_22')]");
    }

    public WebElement AppealBoxAskEpicenter(){
        return findElementByXpath("//label[contains(@class, 'epicentrk_fQFz')][2]");
    }

    public WebElement orderNumberInput(){
        return findElementByXpath("//input[contains(@class, 'epicentrk_Al4L')]");
    }

    public WebElement typeOfRequestBox(){
        return findElementByXpath("//div[contains(@class, 'select_100')]");
    }

    public WebElement RequestContentContainer(){
        return findElementByXpath("//div[contains(@class, 'epicentrk_yrEe')]");
    }

    public WebElement textAreaField(){
        return findElementByXpath("//textarea[contains(@class, 'epicentrk_Al4L')]");
    }

    public WebElement agreeSpanCheckbox(){
        return findElementByXpath("//span[contains(@class, 'epicentrk_paT9')]");
    }

    public WebElement sendRequestBtn(){
        return findElementByXpath("//button[contains(@class, 'epicentrk_LZ0c')]");
    }

    public WebElement closeRequestMenuBtn(){
        return findElementByXpath("//button[contains(@class, 'epicentrk_LZ0c')]");
    }







}
