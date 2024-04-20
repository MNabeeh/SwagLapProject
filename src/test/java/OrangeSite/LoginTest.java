package OrangeSite;

import orangePages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import orangePages.HomePage;
import orangePages.LoginPage;

import java.time.Duration;

public class LoginTest extends  BaseTest{

    @Test

    public void validTest (){

        LoginPage login= new LoginPage(driver);
        login.loginTest("Admin","admin123");

        HomePage homePage= new HomePage(driver);
        homePage.searchTap();
        homePage.clickPim();
        //boolean isBannerIsVisible= driver.findElement(homePage.getBanner()).isDisplayed();
        //Assert.assertTrue(isBannerIsVisible);

        PIMPage pimPage = new PIMPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        pimPage.searchEmployee("038313");
        pimPage.clickOnSearchBtn();

    }

}
