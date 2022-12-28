package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputLoginField(){
        return findElementByXpath("//input[contains(@id, 'user_login')]");
    }

    public WebElement inputPasswordField(){
        return findElementByXpath("//input[contains(@id, 'user_pass')]");
    }

    public WebElement submitButton(){
        return findElementByXpath("//button[contains(@type, 'submit')]");
    }

    public WebElement buttonLoginByGoogle(){
        return findElementByXpath("//a[contains(@class, 'social-enter__item')]");
    }

    public WebElement wrongPasswordOrLoginText(){
        return findElementByXpath("//p[contains(@class, 'zoomIn')]");
    }

    public WebElement tryAgainButton(){
        return findElementByXpath("//button[contains(@class, 'VfPpkd-LgbsSe')]");
    }

    //workmartsenko@gmail.com

}
