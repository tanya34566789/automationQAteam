package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Header extends BasePage {

    public HomePage_Header(WebDriver driver) {
        super(driver);
    }


    public WebElement LogoImg(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__logo-wrapper')]/a/img"));
    }


    public WebElement LocationsDiv(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__locations')]/div[contains(@class, 'header__locations-opener')]"));
    }

    public WebElement InfoDiv(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__info-menu')]/div[contains(@class, 'header__info-toggle')]"));
    }

    public WebElement ProfitLink(){
        return driver.findElement(By.xpath("//ul[contains(@class, 'header__service-menu-list')]/li/a"));
    }

    public WebElement СatalogOfGoods(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__row center-v')]/div[contains(@class, 'header__menu-opener')]"));
    }

    public WebElement SearchField(){
        return driver.findElement(By.xpath("//input[contains(@class, '_JcImSJ')]"));
    }

    public WebElement CompapareIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__compare-link-icon')]"));
    }

    public WebElement WhishesIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__whishes-link-icon')]"));
    }

    public WebElement CartIcon(){
        return driver.findElement(By.xpath("//span[contains(@class,'header__cart-icon')]"));
    }

    public WebElement LoginContainer(){
        return driver.findElement(By.xpath("//div[contains(@class, 'header__row')]/div[contains(@class,'header__login')]"));
    }

}
