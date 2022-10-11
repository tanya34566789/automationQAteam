package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;

public class HotlinePageResult extends BasePage {
    public HotlinePageResult(WebDriver driver) {
        super(driver);
    }
    public void navigateHotline() {
        driver.get("https://hotline.ua");

    }
}
