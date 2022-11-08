package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class search1aPage extends BasePage {
    public search1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement serchField() {
        return findElementByXpath("//input[contains(@class,'_JcImSJ')]");
    }

    public WebElement officeChairs() {
        return findElementByXpath("//a[contains(@href,'/ua/shop/kompyuternye-kresla-dlya-ofisa/')]");
    }

    public WebElement officeChairsField() {
        return findElementByXpath("//h1[contains(@class,'nc')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void findOfficeFurniture() {
        serchField().sendKeys("office furniture\n");
    }

    public void clickOfficeChairs() {
        officeChairs().click();
        Assert.assertTrue(officeChairsField().isDisplayed());
    }

}
