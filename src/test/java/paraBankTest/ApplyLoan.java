package paraBankTest;

import org.testng.annotations.Test;
import paraBankPages.ApplyLoanPage;
import paraBankPages.HomePage;
import paraBankPages.LoginPage;

public class ApplyLoan extends BaseTest{

    @Test
    public  void ApplyLoan(){
        new LoginPage(driver).login("Mahaa", "222").clickOnApplyLoan().ApplyLoan("1000","2000");



//        LoginPage loginPage= new LoginPage(driver);
//        loginPage.login("Mero","1010");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickOnApplyLoan();
//        ApplyLoanPage applyLoanPage = new ApplyLoanPage(driver);
//        applyLoanPage.ApplyLoan("11000","23333");

    }
}
