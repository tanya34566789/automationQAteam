package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search1aPage extends BasePage {
    public search1aPage(WebDriver driver){
        super(driver);
    }
    public void goToEpicentr() {

        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }
    public WebElement serchField(){

        return findElementByXpath("//input[contains(@class,'_JcImSJ')]");
    }
    public void findOfficeFurniture() {

        serchField().sendKeys("office furniture\n");
    }







}
