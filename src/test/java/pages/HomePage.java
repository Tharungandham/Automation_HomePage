package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinations.HomeTest;
import utils.DriverFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(){
        this.driver=DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }
    public void loadPage(){
        driver.get(utils.ConfigReader.getProperty("base.url"));
    }
    @FindBy(css=".jgg1o5p1bpwpao0")WebElement logo;
//    public  String getLogo(){
//        return logo.getText();
//    }
    public boolean isDisplayed(){
        return logo.isDisplayed();
    }
}
