package paraBankTest;

import org.testng.annotations.Test;
import paraBankPages.HomePage;
import paraBankPages.LoginPage;
import paraBankPages.PayPillsPage;

public class PayPillTest extends  BaseTest{
@Test
    public  void payMyPills (){

      new LoginPage(driver).login("Mahaa", "222").
              clickOnPayPills().
              submitPayPill("Maha","Qaliuob","Cairo","Egypt","1111","111111","09090","09090","1222222");




//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("Hoda","102030");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickOnPayPills();
//        PayPillsPage payPillsPage =new PayPillsPage(driver);
//        payPillsPage.submitPayPill
//                ("Maha","Cairo","Qaliuob","Egypt", "112","123123123","1233","1233","100000");


    }
}
