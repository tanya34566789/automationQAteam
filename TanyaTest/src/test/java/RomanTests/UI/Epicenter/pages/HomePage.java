package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void goEpicenterHomePage(){
        driver.get("https://epicentrk.ua/");
    }

    //HEADER


    public WebElement headerLogo(){
        return findElementByXpath("//span[contains(@class, 'header__logo')]");
    }

    public WebElement headerLocationsDiv(){
        return findElementByXpath("//div[contains(@class, 'header__locations')]/div[contains(@class, 'header__locations-opener')]");
    }

    public WebElement scheduleOfHolidaysBtn (){
        return findElementByXpath("//img[contains(@alt, 'holiday')]");
    }

    public WebElement sliderNextBtn(){
        return findElementByXpath("//div[contains(@class, 'swiper-button-next')]");
    }

    public WebElement sliderPreviousBtn(){
        return findElementByXpath("//div[contains(@class, 'swiper-button-prev')]");
    }

    // HEADER mini modal window, select your location
    public WebElement headerMiniModalButtonYes(){
        return findElementByXpath("//button[contains(@class, '_DE7oBo')]");
    }

    public WebElement headerInfoDiv(){
        return findElementByXpath("//div[contains(@class, 'header__info-menu')]/div[contains(@class, 'header__info-toggle')]");
    }

    public WebElement headerProfitLink(){
        return findElementByXpath("//ul[contains(@class, 'header__service-menu-list')]/li/a");
    }

    public WebElement headerСatalogGoods(){
        return findElementByXpath("//div[contains(@class, 'header__row')]/div[contains(@class, 'header__menu-opener')]");
    }
    public WebElement headerСatalogGoodsMenu(){
        return findElementByXpath("//ul[contains(@class, 'catalog-menu__category')]");
    }

    public List<WebElement> headerCatalogItems(){
        return findElementsByXpath("//li[contains(@class, 'catalog-menu__level-1')]");
    }

    public WebElement saleCatalogItem(){
        return findElementByXpath("//li[contains(@class, 'main-nav__item--sale')]");
    }


    public WebElement headerSearchField(){
        return findElementByXpath("//input[contains(@class, '_JcImSJ')]");
    }

    public WebElement headerCompapareIcon(){
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement headerWhishesIcon(){
        return findElementByXpath("//span[contains(@class,'header__whishes-link-icon')]");
    }

    public WebElement headerCartIcon(){
        return findElementByXpath("//span[contains(@class,'header__cart-icon')]");
    }

    public WebElement headerLoginContainer(){
        return findElementByXpath("//div[contains(@class, 'header__row')]/div[contains(@class,'header__login')]");
    }


    // MAIN

    public WebElement mainAdvertisingSlider(){
        return findElementByXpath("//div[contains(@id, 'Rotator')]/div[contains(@class, 'vtlkSlider')]");
    }

    public WebElement mainProductOfTheDayContainer(){
        return findElementByXpath("//div[contains(@class, 'main-rotator__row')]");
    }

    public WebElement mainPopularCategoryContainer(){
        return findElementByXpath("//div[contains(@class, 'container')]/div[contains(@class, 'offer-block')]");
    }

    public WebElement mainOverviewCategoriesContainer(){
        return findElementByXpath("//div[contains(@class, 'ready')]");
    }

    public WebElement mainPartnersSliderContainer(){
        return findElementByXpath("//div[contains(@class, 'filter-slider--categories')]/div[contains(@class, 'filter-slides')]");
    }

    public WebElement mainStoreDescriptionContainer(){
        return findElementByXpath("//div[contains(@class, 'seo-container')]");
    }

    public WebElement compassLink(){
        return findElementByXpath("//ul[contains(@id, 'menuContainer_15')]//a[contains(@href, 'kompasy')]");
    }

    //FOOTER

    public WebElement footerSocialNetworksContainer(){
        return findElementByXpath("//div[contains(@class, 'footer__blue')]");
    }

    public WebElement footerInfoContainer(){
        return findElementByXpath("//div[contains(@class, 'footer__info')]");
    }

    public WebElement footerCopywritingContainer(){
        return findElementByXpath("//div[contains(@class, 'footer__copywriting')]");

    }


}
