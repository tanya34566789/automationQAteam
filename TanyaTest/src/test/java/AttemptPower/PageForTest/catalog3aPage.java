package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class catalog3aPage extends BasePage {

    Actions actions = new Actions(driver);

    public catalog3aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogFieldStationery() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/kantstovary/')][contains(@class,'menu-link')]");
    }

    public WebElement catalogOfficeSupplies() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/kantstovary-dlya-ofisa/')]/div");
    }

    public Actions pointStationery() {
        actions.moveToElement(catalogFieldStationery()).perform();
        return null;
    }

    public Actions clickOfficeSupplies() {
        actions.moveToElement(catalogOfficeSupplies()).click().perform();
        return null;
    }

    public WebElement fieldOfficeSupplies() {
        return findElementByXpath("//h1[contains(.,'Офісне приладдя')]");
    }

    public WebElement catalogFieldPetGoods() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/zootovary/')][contains(@class,'menu-link')]");
    }

    public Actions pointPetGoods() {
        actions.moveToElement(catalogFieldPetGoods()).perform();
        return null;
    }

    public WebElement catalogProductsForCats() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/tovary-dlya-kotov/')]/div");
    }

    public Actions clickProductsForCats() {
        actions.moveToElement(catalogProductsForCats()).click().perform();
        return null;
    }

    public WebElement fieldProductsForCats() {
        return findElementByXpath("//h1[contains(.,'Товари для котів')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }

    public void goCatalogField() {
        catalogButton().click();
        pointStationery();
        clickOfficeSupplies();
        Assert.assertTrue(fieldOfficeSupplies().isDisplayed());
        catalogButton().click();
        pointPetGoods();
        clickProductsForCats();
        Assert.assertTrue(fieldProductsForCats().isDisplayed());
    }
}
