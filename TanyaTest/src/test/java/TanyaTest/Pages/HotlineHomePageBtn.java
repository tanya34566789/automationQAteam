package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotlineHomePageBtn extends BasePage {
    public HotlineHomePageBtn(WebDriver driver) {
        super(driver);
    }
    public void navigateHotline() {
        driver.get("https://hotline.ua/");
    }

      public List<WebElement> popularOptions() {
          return findElementsByXpath("//button[@data-tracking-id='index-6']");
        }
        public void scroll(int pixels) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0," + pixels + ")", "");
        }
        public List<WebElement> actualNow() {
           return findElementsByXpath("//button[@data-tracking-id='index-11']");
        }
    }


