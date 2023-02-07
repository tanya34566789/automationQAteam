package RomanTests;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class OtherTests extends BasePage {
    public OtherTests(WebDriver driver) {
        super(driver);
    }

    ArrayList<String> users = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();

        public void addNamesToUsers () {
            users.add("John Dow1");
            users.add("John Dow2");
            users.add("John Dow3");
            users.add("John Dow4");
            users.add(7, "boss");
        }
        public void addNamesToNumbers () {
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(10, 10);
        }
    @Test
    public void arrayOp() {
        addNamesToUsers ();
        addNamesToNumbers ();

        for (String user: users) {
            System.out.println(user);
        }
    }
}
