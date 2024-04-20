package paraBankTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void navigate (){
        driver = new EdgeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    /*@AfterMethod

    public void tearDown()
    {
        driver.quit();
    }*/


}
