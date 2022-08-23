package TanyaTest.Foxtrot.Tests;

import FrameworkClasses.TestInit;
import TanyaTest.Foxtrot.Pages.Header;
import org.testng.annotations.Test;

public class TestFindSmartphone extends TestInit {
    @Test
    public void searchSmartphone(){
        Header header = new Header(driver);
        driver.get("https://www.foxtrot.com.ua");
        sleep(1);
    }
}
