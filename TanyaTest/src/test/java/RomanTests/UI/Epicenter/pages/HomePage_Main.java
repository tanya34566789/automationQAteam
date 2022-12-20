package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Main extends BasePage {
    public HomePage_Main(WebDriver driver) {
        super(driver);
    }

    public WebElement advertisingSlider(){
        return driver.findElement(By.xpath("//div[contains(@id, 'Rotator')]/div[contains(@class, 'vtlkSlider')]"));
    }

    public WebElement productOfTheDayContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'main-rotator__row')]"));
    }

    public WebElement popularCategoryContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'container')]/div[contains(@class, 'offer-block')]"));
    }

    public WebElement overviewOfTheCategoriesContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'ready')]"));
    }

    public WebElement partnersSliderContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'filter-slider--categories')]/div[contains(@class, 'filter-slides')]"));
    }

    public WebElement storeDescriptionContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'seo-container')]"));
    }

}
