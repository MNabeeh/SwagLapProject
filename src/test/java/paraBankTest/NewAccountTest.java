package paraBankTest;

import org.testng.annotations.Test;
import paraBankPages.HomePage;
import paraBankPages.LoginPage;
import paraBankPages.NewAccountPage;

public class NewAccountTest extends BaseTest{
    @Test

    public void validLogin(){

        new  LoginPage(driver).login("Mahaa", "111").
                clickOnOpenNewAccount().
                OpenNewAccount2();



//        LoginPage loginPage= new LoginPage(driver);
//        loginPage.login("Hoda","102030");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickOnOpenNewAccount();
//        NewAccountPage submitNewAccount = new NewAccountPage(driver);
//        submitNewAccount.OpenNewAccount2();
    }
}
