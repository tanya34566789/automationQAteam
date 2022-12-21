package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void goEpicenterHomePage(){
        driver.get("https://epicentrk.ua/");
    }

    //HEADER


    public WebElement headerLogoImg(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__logo-wrapper')]/a/img"));
    }


    public WebElement headerLocationsDiv(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__locations')]/div[contains(@class, 'header__locations-opener')]"));
    }

    public WebElement headerInfoDiv(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__info-menu')]/div[contains(@class, 'header__info-toggle')]"));
    }

    public WebElement headerProfitLink(){
        return driver.findElement(By.xpath("//ul[contains(@class, 'header__service-menu-list')]/li/a"));
    }

    public WebElement headerСatalogOfGoods(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__row center-v')]/div[contains(@class, 'header__menu-opener')]"));
    }

    public WebElement headerSearchField(){
        return driver.findElement(By.xpath("//input[contains(@class, '_JcImSJ')]"));
    }

    public WebElement headerCompapareIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__compare-link-icon')]"));
    }

    public WebElement headerWhishesIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__whishes-link-icon')]"));
    }

    public WebElement headerCartIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__cart-icon')]"));
    }

    public WebElement headerLoginContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__row')]/div[contains(@class,'header__login')]"));
    }


    // MAIN

    public WebElement mainAdvertisingSlider(){
        return driver.findElement(By.xpath("//div[contains(@id, 'Rotator')]/div[contains(@class, 'vtlkSlider')]"));
    }

    public WebElement mainProductOfTheDayContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'main-rotator__row')]"));
    }

    public WebElement mainPopularCategoryContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'container')]/div[contains(@class, 'offer-block')]"));
    }

    public WebElement mainOverviewCategoriesContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'ready')]"));
    }

    public WebElement mainPartnersSliderContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'filter-slider--categories')]/div[contains(@class, 'filter-slides')]"));
    }

    public WebElement mainStoreDescriptionContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'seo-container')]"));
    }

    //FOOTER

    public WebElement footerSocialNetworksContainer(){
        return driver.findElement(By.id("//div[contains(@class, 'footer__blue')]"));
    }

    public WebElement footerInfoContainer(){
        return driver.findElement(By.id("//div[contains(@class, 'footer__info')]"));
    }

    public WebElement footerCopywritingContainer(){
        return driver.findElement(By.id("//div[contains(@class, 'footer__copywriting')]"));

    }
}
