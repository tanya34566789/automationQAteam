package AttemptPower.PageForTest;


import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class search2aPage extends BasePage {
    public search2aPage(WebDriver driver) {
        super(driver);
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public WebElement serchField() {
        return findElementByXpath("//input[contains(@class,'_JcImSJ')]");
    }

    public WebElement notFound() {
        return findElementByXpath("//div[contains(@class,'search-results__empty')]");
    }

    public void findSomething() {
        serchField().sendKeys("llllllll\n");
        Assert.assertTrue(notFound().isDisplayed());
    }

    public void findSomethingTwo() {
        serchField().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        serchField().sendKeys("toy1drift2motorcycle3na-na4im4035\n");
        Assert.assertTrue(notFound().isDisplayed());
    }
}
