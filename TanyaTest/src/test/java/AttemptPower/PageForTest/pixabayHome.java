package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class pixabayHome extends BasePage {
    public pixabayHome(WebDriver driver) {
        super(driver);
    }
    public void goToPixabay(){
        driver.get("https://pixabay.com/");
    }
    public WebElement searchPixabay(){
        return driver.findElement(By.xpath("//div[@class=\"search_form\"]/form/div/span/input[@name=\"q\"]"));
    }
    public void findSearchPixabay(){
        searchPixabay().sendKeys("wallpaper phone\n");
    }
    public WebElement oneOf(){
        return driver.findElement(By.xpath("//div[@class=\"media_filter\"]/span[@class=\"dd_box menu\"][1]/i[@class=\"arrow\"]"));
    }
    public void clickOneOf(){
        oneOf().click();
    }
    public WebElement oneOfTrending(){
        return driver.findElement(By.xpath("//a[.='Trending']"));
    }
    public void chooseOneOfTrending(){
        oneOfTrending().click();
    }
    public WebElement typeOf(){
        return driver.findElement(By.xpath("//div[@class=\"media_filter\"]/span[2]/i[@class=\"arrow\"]"));
    }
    public void clickTypeOf(){
        typeOf().click();
    }
    public WebElement typeOfPhone(){
        return driver.findElement(By.xpath("//a[.='Photos'][@style=\"padding-left:25px\"]"));
    }
    public void chooseTypeOfPhone(){
        typeOfPhone().click();
    }
    public WebElement orientationOf(){
        return driver.findElement(By.xpath("//span[@class=\"dd_box menu\"][3]/i[@class=\"arrow\"]"));
    }
    public void clickOrientationOf(){
        orientationOf().click();
    }
    public WebElement orientationOfHorizontal(){
        return driver.findElement(By.xpath("//a[.='Horizontal']"));
    }
    public void chooseOrientationOfHorizontal(){
        orientationOfHorizontal().click();
    }
    public WebElement sizeOf(){
        return driver.findElement(By.xpath("//div/form/span[1]/i[@class=\"arrow\"]"));
    }
    public void clickSizeOf(){
        sizeOf().click();
    }
    public WebElement sizeOfWidth(){
        return driver.findElement(By.xpath("//input[@name=\"min_width\"][@class=\"min_width_height\"]"));
    }
    public void writeSizeOfWidth(){
        sizeOfWidth().sendKeys("4000");
    }
    public WebElement sizeOfHeight(){
        return driver.findElement(By.xpath("//input[@name=\"min_height\"][@class=\"min_width_height\"]"));
    }
    public void writeSizeOfHeight(){
        sizeOfHeight().sendKeys("4000");
    }
    public WebElement sizeOfGo(){
        return driver.findElement(By.xpath("//div[@class=\"pure-form\"]/input[@class=\"pure-button button-md\"]"));
    }
    public void clickSizeOfGo(){
        sizeOfGo().click();
    }
    public WebElement ofColor(){
        return driver.findElement(By.xpath("//form[@class=\"add_search_params filter\"]/span[@class=\"dd_box menu\"][2]/i[@class=\"arrow\"]"));
    }
    public void chooseOfColor(){
        ofColor().click();
    }
    public WebElement blueButton(){
        return driver.findElement(By.xpath("//b[@class=\"blue\"]"));
    }
    public void clickBlueButton(){
        blueButton().click();
    }
    public WebElement yellowButton(){
        return driver.findElement(By.xpath("//b[@class=\"yellow\"]"));
    }
    public void clickYellowButton(){
        yellowButton().click();
    }
    public WebElement ofColorGo(){
        return driver.findElement(By.xpath("//input[@class=\"pure-button button-md\"][@style=\"padding:0 20px;line-height:28px\"]"));
    }
    public void clickOfColorGo(){
        ofColorGo().click();
    }
    public WebElement ofDate(){
        return driver.findElement(By.xpath("//span[@class=\"dd_box menu\"][4]/i[@class=\"arrow\"]"));
    }
    public void chooseOfDate(){
        ofDate().click();
    }
    public WebElement ofDateDays(){
        return driver.findElement(By.xpath("//a[.='< 7 days']"));
    }
    public void clickOfDateDays(){
        ofDateDays().click();
    }
    public WebElement buttonClearFilters(){
        return driver.findElement(By.xpath("//a[.='Clear filters']"));
    }
    public void clickButtonClearFilters(){
        buttonClearFilters().click();
    }
    public WebElement searchButton(){
        return driver.findElement(By.xpath("//i[@class=\"toggle_mobile_search icon icon_menu_loupe\"]"));
    }
    public void clickSearchButton(){
        searchButton().click();
    }
    public WebElement searchPixabayTwo(){
        return driver.findElement(By.xpath("//input[@name=\"q\"][@class=\"q\"]"));
    }
    public void writeSearchPixabayTwo(){
        searchPixabayTwo().sendKeys(" cat\n");
    }
    public WebElement whiteCat(){
        return driver.findElement(By.xpath("//img[@src=\"https://cdn.pixabay.com/photo/2019/10/22/05/14/cats-4567652__340.jpg\"]"));
    }
    public void watchWhiteCat(){
        whiteCat().click();
    }
    public void testCat(){
        Assert.assertEquals( "Cats Pet Pets - Free photo on Pixabay", driver.getTitle());
    }
}
