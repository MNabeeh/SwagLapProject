package SwagLaps;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;


    @BeforeMethod
    public void start (){
         driver = new EdgeDriver();


        driver.navigate().to("https://www.saucedemo.com/");
    }
    @AfterMethod
    public void tearDown ()
    {

        driver.quit();
    }
}
