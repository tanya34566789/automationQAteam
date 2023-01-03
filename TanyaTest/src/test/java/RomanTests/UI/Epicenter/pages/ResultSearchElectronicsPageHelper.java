package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ResultSearchElectronicsPageHelper extends ResultSearchElectronicsPage {
    public ResultSearchElectronicsPageHelper(WebDriver driver) {
        super(driver);
    }


    public void checkMicrophonesList(){
       List<WebElement> filteredMicrophones = new ArrayList<>();

        for (WebElement microphone :microphonesList()) {
            if(microphone.getText().contains("10 062₴") || microphone.getText().contains("9 828₴")){
                Assert.assertTrue(microphone.isDisplayed());
                System.out.println(microphone);
            };
        }
    }

}
