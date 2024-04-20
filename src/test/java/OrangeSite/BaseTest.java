package OrangeSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
     public void startNavigate  (){
        driver= new ChromeDriver();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
   // @AfterMethod
    //public void tearDown(){
    //    driver.quit();
   // }
}
