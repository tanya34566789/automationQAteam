package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class login2aPage extends BasePage {
    public login2aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement loginButton() {
        return findElementByXpath("//div/span/span[@data-v-73cdadac]");
    }

    public WebElement loginField() {
        return findElementByXpath("//input[contains(@id,'user_login')]");
    }

    public WebElement passwordField() {
        return findElementByXpath("//input[contains(@id,'user_pass')]");
    }

    public WebElement incorrectData() {
        return findElementByXpath("//p[contains(@style,'color:red;')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void toLogin() {
        loginButton().click();
    }

    public void enterData() {
        loginField().sendKeys("ggg\n");
        passwordField().sendKeys("ggg\n");
        Assert.assertTrue(incorrectData().isDisplayed());
    }

}
