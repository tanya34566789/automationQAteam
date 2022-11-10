package StasTests.ForSteamTests;

import TanyaTestFoxtrot.pageObjects.BasePage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
}

