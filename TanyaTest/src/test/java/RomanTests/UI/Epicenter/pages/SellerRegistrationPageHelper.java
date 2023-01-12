package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SellerRegistrationPageHelper extends SellerRegistrationPage {
    public SellerRegistrationPageHelper(WebDriver driver) {
        super(driver);
    }

    public void isAllFieldsIsNotEmpty(){
        Assert.assertTrue(nameCompanyInput().getAttribute("value").length() > 1);
        Assert.assertTrue(personalNameInput().getAttribute("value").length() > 1);
        Assert.assertTrue(phoneNumberInput().getAttribute("value").length() > 1);
        Assert.assertTrue(emailInput().getAttribute("value").length() > 1);
        Assert.assertTrue(personalWebAddress().getAttribute("value").length() > 1);
        Assert.assertTrue(typesOfGoodsInput().getAttribute("value").length() > 1);
        Assert.assertTrue(textArea().getAttribute("value").length() > 1);

    }
}
