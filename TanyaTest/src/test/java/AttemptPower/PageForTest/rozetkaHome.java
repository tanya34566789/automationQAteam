package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class rozetkaHome extends BasePage {
    public rozetkaHome(WebDriver driver) {
        super(driver);
    }
    public void goToRozetka(){
        driver.get("https://rozetka.com.ua/ua/");
    }
    public WebElement searthRozetka(){
        return driver.findElement(By.xpath("//input[@name='search']"));
    }
    public void clickSearthRozetka(){
        searthRozetka().click();
    }
    public void findHeadphone(){
        searthRozetka().sendKeys("headphone\n");
    }
    public WebElement sellerRozetka(){
        return driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
    }
    public void clickSellerRozetka(){
        sellerRozetka().click();
    }
//    public WebElement makerHP(){
//        return driver.findElement(By.xpath("//a[@data-id='HP']"));
//    }
//    public void clickMakerHP(){
//        makerHP().click();
//    }
//    public WebElement headphonesCategory() {
//        return driver.findElement(By.xpath("//span[@class='categories-filter__link-title ng-star-inserted'][.=\"Смартфони, ТВ і електроніка\"]"));
//    }
    public WebElement headphonesCategory() {
        return driver.findElement(By.xpath("//span[@class='categories-filter__link-title ng-star-inserted'][.='Навушники']"));
    }
    public void clickHeadphonesCategory(){
        headphonesCategory().click();
    }
    public WebElement makerSades(){
        return driver.findElement(By.xpath("//a[@data-id='Sades']"));
    }
    public void clickMakerSades(){
        makerSades().click();
    }
    public WebElement nameSadesSA(){
        return driver.findElement(By.xpath("//span[@class='goods-tile__title']"));
    }
    public void clickNameSadesSa(){
        nameSadesSA().click();
    }
    public WebElement characteristicsSa(){
        return driver.findElement(By.xpath("//a[@class='tabs__link'][@href='https://rozetka.com.ua/ua/sades_sa708_b_bl/p9092609/characteristics/']"));
    }
    public void clickCharacteristicsSa(){
        characteristicsSa().click();
    }
    public WebElement hTrue(){
        return driver.findElement(By.xpath("//span[.='12 місяців']"));
    }
    public WebElement type(){
        return driver.findElement(By.xpath("//a[@class='ng-star-inserted'][.='Дротові']"));
    }
    public void assertType(){
        Assert.assertTrue(type().isDisplayed());
    }
}
