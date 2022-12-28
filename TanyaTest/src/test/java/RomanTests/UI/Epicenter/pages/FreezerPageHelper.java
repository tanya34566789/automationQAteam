package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class FreezerPageHelper extends FreezerPage {
    public FreezerPageHelper(WebDriver driver) {
        super(driver);
    }

    public void checkPrice(){
        if (Objects.equals(price().getText(), "6 589")){
            System.out.println("price is 6589");
        } else {
            System.out.println("price is changed");
        }
    }
}
