package paraBankTest;

import org.testng.annotations.Test;
import paraBankPages.RegisterPage;
import paraBankPages.StartPage;

public class RegisterTest extends BaseTest{

    @Test
    public void register(){
        StartPage startPage = new StartPage(driver);
        startPage.clickOnRegisterLink();
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.registerToTheSite("Maha","Nabeeh", "Cairo","Qalioub","Egypt","123", "01011","13","hend","11","11");


    }
}
