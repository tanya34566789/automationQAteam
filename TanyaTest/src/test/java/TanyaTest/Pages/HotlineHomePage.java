package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotlineHomePage extends BasePage {
    public HotlineHomePage(WebDriver driver) {
        super(driver);
    }

        public void navigateHotline() {

            driver.get("https://hotline.ua/");
        }
        private static final String BN = "//a[contains(@class, 'categories-section__link' )]";

        public List<WebElement> categoryNames() {
            return waitVisibilityOfAllElementsLocatedBy("//a[contains(@class, 'categories-section__link' )]");

        }
        public WebElement nameInside() {
            return (WebElement) waitVisibilityOfAllElementsLocatedBy("//h1[contains(@class, 'title-page flex middle-xs section-title')]");
        }
        public WebElement catalog() {

            return findElementByXpath("//div[contains(@class, 'button-menu-main')]");
        }
        public WebElement military() {
            return findElementByXpath("//i[contains(@class, 'menu-main__item-icon icon-section icon-section--military')]");
        }
        public WebElement militaryClothes() {
            return findElementByXpath("//div[@data-id='7365']//a[contains(@href, '/ua/sport/takticheskaya-odezhda/')]");
        }
        public WebElement petProducts() {
            return findElementByXpath("//i[@class='menu-main__item-icon icon-section icon-section--zootovary']");

        }
    }


