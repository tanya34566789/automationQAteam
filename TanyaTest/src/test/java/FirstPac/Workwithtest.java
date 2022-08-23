package FirstPac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;

public class Workwithtest {
    public ChromeDriver driver;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/IdeaProjects/TanyaTest/driver/chromedriver");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("UnresolvedClassReferenceRepair")
    @Test
    public void workwithtest() {
        driver.get("https://intertop.ua/");
        sleep(3);
        driver.findElement(By.xpath("//a[@href = '/zhenshinam/']")).click();
        sleep(3);
        driver.findElement(By.xpath("//input[@id='v_search_input']")).sendKeys("nike\n");
        sleep(3);
        driver.findElement(By.xpath("//img[@title='Світшот NIKE Sportswear Icon Clashмодель CZ1868-010']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Світшот NIKE Sportswear Icon Clash Модель CZ1868-010')]")).getText(),"Світшот NIKE Sportswear Icon Clash Модель CZ1868-010");
    }

    @AfterTest
      public void close() {
       driver.quit();
       System.out.println("test close");
   }
}
