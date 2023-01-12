package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsPage extends BasePage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> newsCards(){
        return findElementsByXpath("//div[contains(@class, 'row')]");
    }

    public WebElement newsTopic(){
        return findElementByXpath("//div[contains(@class, 'action-main')]");
    }

    public WebElement firstNewsTopic(){
        return findElementByXpath("(//a[contains(@class, 'columns')])[1]");
    }

    public List<WebElement> pageNumbers(){
        return findElementsByXpath("//a[contains(@class, 'pagination__item')]");
    }

    public WebElement backToNewsPage(){
        return findElementByXpath("//li[contains(@id, 'breadcrumb_2')]/a[contains(@class, 'link--inverted')]");
    }
}
