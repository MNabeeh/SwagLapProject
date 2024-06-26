package pagesSwagLap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {

    WebDriver driver;

    public CheckOutOverviewPage (WebDriver driver){
        this.driver= driver;
    }

    private By FinishBtn= By.xpath("//*[text()=\"Finish\"]");
    private By OverViewInfo= By.xpath("//*[text()=\"Checkout: Overview\"]");

    public By getOverViewInfo(){
        return OverViewInfo;
    }


    public FinishPage clickOnFinishBtn (){
        driver.findElement(FinishBtn).click();
        return  new FinishPage(driver);
    }
}
