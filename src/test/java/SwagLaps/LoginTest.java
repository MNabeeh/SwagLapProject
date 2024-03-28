package SwagLaps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test


    public void validLogin() {


        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        HomePage homepage= new HomePage(driver);
        boolean isHeaderIsDisplayed = driver.findElement(homepage.getHeader()).isDisplayed();
        Assert.assertTrue(isHeaderIsDisplayed);

    }

    @Test

    public void inValidLogin (){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("fghj","123");
        boolean IsErrorVisible= driver.findElement(loginPage.getErrorSMS()).isDisplayed();
        Assert.assertTrue(IsErrorVisible);

    }


}
