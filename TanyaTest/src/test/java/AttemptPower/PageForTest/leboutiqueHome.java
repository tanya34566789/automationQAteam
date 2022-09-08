package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class leboutiqueHome extends BasePage {
    public leboutiqueHome(WebDriver driver){
        super(driver);
    }
    public void goToLeboutique(){
        driver.get("https://leboutique.com/uk");
    }
    public WebElement categoryMen(){
        return driver.findElement(By.xpath("//a[@class='header-gender__a'][@href='/uk/men']"));
    }
    public void clickCategoryMen(){
        categoryMen().click();
    }
    public WebElement categoryOuterwear(){
        return  driver.findElement(By.xpath("//a[@class='category_btn categories_nav h5-xs btn btn_30-m btn_40-l'][.='Верхній одяг']"));
    }
    public void clickCategoryOuterwear(){
        categoryOuterwear().click();
    }
    public WebElement categoryRaincoat(){
        return driver.findElement(By.xpath("//a[@class='group__h'][@href='/uk/catalog/men/cloak']"));
    }
    public void clickCategoryRaincoat(){
        categoryRaincoat().click();
    }
    public WebElement priceButton(){
        return findElementByXpath("//div[@id='a_filter_price'][@class='set-filter__it dropdown']");
    }
    public void clickPriceButton (){
        priceButton().click();
    }
    public WebElement priceFrom(){
        return findElementByXpath("//input[@class='ctrl__input'][@name='fprice__from']");
    }
    public void clearPriceFrom(){
        priceFrom().clear();
    }
    public void writePriceFrom(){
        priceFrom().sendKeys("1100");
    }
    public WebElement priceTo(){
        return driver.findElement(By.xpath("//input[@class='ctrl__input'][@name='fprice__to']"));
    }
    public void clearPriceTo(){
        priceTo().clear();
    }
    public void writePriceTo(){
        priceTo().sendKeys("2400");
    }
    public WebElement selectButton(){
        return driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/div/div[@class=\"set-filter__it dropdown dropdown_open\"]/div[@class=\"dropdown__body\"]/div[@class='dropdown__submit']/div[@role='presentation'][@class='btn btn_secondary btn_30-s xs-w_100 xs-center'][.='Вибрати']"));
    }
    public void clickSelectButton(){
        selectButton().click();
    }
    public WebElement cloakImage(){
        return driver.findElement(By.xpath("//a[@class=\"prod__picto picto ratio-3x4\"][@href=\"/uk/plashch-siniy-astoni-5789975\"]"));
    }
    public void clickCloakImage(){
        cloakImage().click();
    }
    public WebElement cloakBasket(){
        return driver.findElement(By.xpath("//div[@class='btn__p'][.='Додати у кошик']"));
    }
    public void clickCloakBasket(){
        cloakBasket().click();
    }
    public WebElement sizeBeforeBasketCloak(){
        return driver.findElement(By.xpath("//div[@class='szs-table__it'][.='56']"));
    }
    public void clickSizeBeforeBasketCloak(){
        sizeBeforeBasketCloak().click();
    }
    public WebElement searchLeboutique(){
        return driver.findElement(By.xpath("//input[@name='search__input']"));
    }
    public void shoesSearchLeboutique(){
        searchLeboutique().sendKeys("чоловічі чорні туфлі\n");
    }
    public WebElement searchButtonLeboutique(){
        return driver.findElement(By.xpath("//div[@role=\"button\"][.='Знайти'][@class=\"ctrl__btn ctrl__btn_search btn h5-s xs-hide s-show\"]"));
    }
    public void clickSearchButtonLeboutique(){
        searchButtonLeboutique().click();
    }
    public WebElement blackShoes(){
        return driver.findElement(By.xpath("//a[@class=\"prod__picto picto ratio-3x4\"][@href=\"/uk/tufli-chernye-fashion-5649083\"]"));
    }
    public void clickBlackShoes(){
        blackShoes().click();
    }
    public WebElement shoesBasket(){
        return driver.findElement(By.xpath("//div[@class=\"btn__p\"][.='Додати у кошик']"));
    }
    public void clickShoesBasket(){
        shoesBasket().click();
    }
    public WebElement sizeBeforeBasketShoes(){
        return driver.findElement(By.xpath("//div[@class=\"szs-table__it\"][.='46']"));
    }
    public void clickSizeBeforeBasketShoes(){
        sizeBeforeBasketShoes().click();
    }
    public WebElement basket(){
        return driver.findElement(By.xpath("//div[@class=\"header__btn-cart btn-cart btn btn_35i2-xs btn_45i2-s btn_35i2-m xs-column header_btn gc-m-1 btn-cart_expired\"]"));
    }
    public void clickBasket(){
        basket().click();
    }
    public WebElement twoGoods(){
        return driver.findElement(By.xpath("//div[@class=\"cart-3__head-h h3-xs h4-m\"][.='Кошик (2 товари)']"));
    }
    public void assertTwoGoods(){
        Assert.assertTrue(twoGoods().isDisplayed());
    }

}
