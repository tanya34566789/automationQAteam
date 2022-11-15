package StasTests.ForSteamTests;

import TanyaTestFoxtrot.pageObjects.BasePage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class SteamPage extends TestInit {
    public void goSteam(){driver.get("https://store.steampowered.com/");}
    public Actions actions() {
        return new Actions(driver);
    }
    public String logName(){
        return "cursedemonsblessed2";
    }
    public String logPass(){
        return "380661483541Sss";
    }
    public String realName(){
        return "QweAsd";
    }
    @DataProvider (name = "dataProvider")
    public Object[][] getData() {
        Object[][] data = new Object[3][2];

        data[0][0] = "qwert";
        data[0][1] = "43345";

        data[1][0] = "Login";
        data[1][1] = "Password";

        data[2][0] = "Alohadance";
        data[2][1] = "Morfling";

        return data;
    }
}

