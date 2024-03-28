package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestAutomationPractice {

    WebDriver driver;

     @BeforeMethod

    public void  openBrowser(){

        driver= new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");

    }

    @AfterMethod

    public void tearDown(){

         driver.quit();
    }


}
