package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class googleHome extends BasePage {

    public googleHome(WebDriver driver) {
        super(driver);
    }

    public WebElement searchGoogle() {
        return findElementByXpath("//input[@name='q']");
    }
    public WebElement inSearchGoogleMap() {
        return findElementByXpath("//a[contains(@href,'https://www.google.com.ua/maps/@50.4851493,30.4721233,14z?hl=ru')]/h3[contains(@class,'LC20lb MBeuO DKV0Md')][contains(.,'Google')]");
    }
    public WebElement javaSearch() {
        return findElementByXpath("//h3[contains(@class,'DKV0Md')][contains(.,'Java | Oracle')]");
    }
    public WebElement bashSearch() {
        return findElementByXpath("//h3[contains(@class,'LC20lb MBeuO DKV0Md')][contains(.,'Bash')]");
    }
    public WebElement catSearch() {
        return findElementByXpath("//h3[contains(@class,'LC20lb MBeuO DKV0Md')][contains(.,'Cat - Wikipedia')]");
    }
    public WebElement gitSearch() {
        return findElementByXpath("//h3[contains(@class,'LC20lb MBeuO DKV0Md')][contains(.,'Git')]");
    }
    public WebElement googleRozetka() {
        return findElementByXpath("//h3[contains(.,'ROZETKA')]");
    }
    public WebElement imageSomething() {
        return findElementByXpath("//a[contains(@data-hveid,'CAIQA')]");
    }
    public WebElement settingsSomething() {
        return findElementByXpath("//div[contains(@aria-haspopup,'menu')][contains(@class,'PNyWAd ZXJQ7c')]");
    }
    public WebElement colorSomething() {
        return findElementByXpath("//div[2]/div/div[contains(@class,'xFo9P r9PaP')][contains(@jsname,'wLFV5d')]");
    }
    public WebElement coloryEllowSomething() {
        return findElementByXpath("//div[contains(@style,'background-color:#FFEB3B')]");
    }
    public WebElement cleanUpSomething() {
        return findElementByXpath("//a/div[contains(@class,'r9PaP ')]");
    }
    public WebElement allSomething() {
        return findElementByXpath("//a[contains(@jsname,'ONH4Gc')][contains(@class,'NZmxZe')][contains(@data-hveid,'CAEQAA')]");
    }
    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }
    public void findGoogleMap() {
        searchGoogle().sendKeys("Карти Google\n");
        inSearchGoogleMap().click();
    }
    public void findBash() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Bash\n");
        Assert.assertTrue(bashSearch().isDisplayed());
    }
    public void findJava() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Java\n");
        Assert.assertTrue(javaSearch().isDisplayed());
    }
    public void findRozetka() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Rozetka\n");
        googleRozetka().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://rozetka.com.ua/ua/");
    }
    public void makeSomething() {
        searchGoogle().clear();
        searchGoogle().sendKeys("your ad could be here\n");
        imageSomething().click();
        settingsSomething().click();
        colorSomething().click();
        coloryEllowSomething().click();
        cleanUpSomething().click();
        allSomething().click();
    }
    public void findGit() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Git\n");
        Assert.assertTrue(gitSearch().isDisplayed());
    }
    public void findCatAndAssert() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Cat\n");
        searchGoogle().sendKeys(" funny\n");
        searchGoogle().sendKeys(" cheese\n");
        Assert.assertEquals(driver.getTitle(), "Cat funny cheese - Пошук Google");
        searchGoogle().clear();
        searchGoogle().sendKeys("Cat\n");
        Assert.assertTrue(catSearch().isDisplayed());
    }

}
