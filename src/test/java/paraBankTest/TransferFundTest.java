package paraBankTest;

import org.testng.annotations.Test;
import paraBankPages.HomePage;
import paraBankPages.LoginPage;
import paraBankPages.TransferFundPage;

public class TransferFundTest extends BaseTest{

     @Test
    public  void makeTransfer(){

         new LoginPage(driver).login("Mahaa","111").clickOnTransferFundsBTn().CreateTransferFund("111111");

//         LoginPage loginPage= new LoginPage(driver);
//         loginPage.login("riri","4040");
//         HomePage homePage = new HomePage(driver);
//         homePage.clickOnTransferFundsBTn();
//         TransferFundPage transferFundPage = new TransferFundPage(driver);
//         transferFundPage.CreateTransferFund("55555A");
//

    }
}
