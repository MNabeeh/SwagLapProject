package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {

    WebDriver driver;

    public FinishPage(WebDriver driver){
        this.driver= driver;
    }

    private By FinishHeader = By.className("complete-header");

    public By getFinishHeader() {
        return FinishHeader;
    }
}
