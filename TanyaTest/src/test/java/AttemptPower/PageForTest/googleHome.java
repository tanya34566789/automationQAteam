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

    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }
    public WebElement searchGoogle() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }
    public void findGoogleMap(){
        searchGoogle().sendKeys("Карти Google\n");
    }

    public WebElement inSearchGoogleMap(){
        return driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][.='Google Карты']"));
    }
    public void clickInSearchGoogleMap(){
        inSearchGoogleMap().click();
    }
    public void findJava(){
        searchGoogle().clear();
        searchGoogle().sendKeys("Java\n");
    }
    public WebElement javaSearch(){
        return driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][.='Java | Oracle']"));
    }
    public void assertJavaSearch(){
        Assert.assertTrue(javaSearch().isDisplayed());
    }
    public void findBash(){
        searchGoogle().clear();
        searchGoogle().sendKeys("Bash\n");
    }
    public WebElement bashSearch(){
        return driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][.='Bash - Википедия']"));
    }
    public void assertBashSearch(){
        Assert.assertTrue(bashSearch().isDisplayed());
    }
    public void findCatAndAssert(){
        searchGoogle().clear();
        searchGoogle().sendKeys("Cat\n");
        searchGoogle().sendKeys(" funny\n");
        searchGoogle().sendKeys(" cheese\n");
        Assert.assertEquals(driver.getTitle(),"Cat funny cheese - Пошук Google");
        searchGoogle().clear();
        searchGoogle().sendKeys("Cat\n");
    }

    public WebElement catSearch(){
        return driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][.='Cat - Wikipedia']"));
    }
    public void assertCatSearch(){
        Assert.assertTrue(catSearch().isDisplayed());
    }
    public void findGit(){
        searchGoogle().clear();
        searchGoogle().sendKeys("Git\n");
    }
    public WebElement gitSearch(){
        return driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][.='Git']"));
    }
    public void assertGitSearch(){
        Assert.assertTrue(gitSearch().isDisplayed());
    }

    public void findRozetka() {
        searchGoogle().clear();
        searchGoogle().sendKeys("Rozetka\n");
    }

    public WebElement googleRozetka() {
        return driver.findElement(By.xpath("//h3[.='Інтернет-магазин ROZETKA™: офіційний сайт ...']"));
    }

    public void pressGoogleRozetka() {
        googleRozetka().click();
    }
    public void makeSomething(){
        searchGoogle().clear();
        searchGoogle().sendKeys("your ad could be here\n");
    }
    public WebElement imageSomething(){
        return driver.findElement(By.xpath("//a[@data-hveid=\"CAIQAw\"]"));
    }
    public void clickImageSomething(){
        imageSomething().click();
    }
    public WebElement settingsSomething(){
        return driver.findElement(By.xpath("//div[@aria-haspopup=\"menu\"][@class=\"PNyWAd ZXJQ7c\"]"));
    }
    public void clickSettingsSomething(){
        settingsSomething().click();
    }
    public WebElement colorSomething(){
        return driver.findElement(By.xpath("//div[@class=\"xFo9P r9PaP\"][@jsname=\"wLFV5d\"][.='Колір']"));
    }
    public void clickColorSomething(){
        colorSomething().click();
    }
    public WebElement coloryEllowSomething(){
        return driver.findElement(By.xpath("//div[@style=\"background-color:#FFEB3B\"]"));
    }
    public void clickColoryEllowSomething(){
        coloryEllowSomething().click();
    }
    public WebElement cleanUpSomething(){
        return driver.findElement(By.xpath("//div[@class=\"r9PaP \"][.='Очистити']"));
    }
    public void clickCleanUpSomething(){
        cleanUpSomething().click();
    }
    public WebElement allSomething(){
        return driver.findElement(By.xpath("//a[@jsname=\"ONH4Gc\"][@class=\"NZmxZe\"][@data-hveid=\"CAEQAA\"]"));
    }
    public void clickAllSomething(){
        allSomething().click();
    }


    public void searchAuditGoogle(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://rozetka.com.ua/ua/");
    }
}
