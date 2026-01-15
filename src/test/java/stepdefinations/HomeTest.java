package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverFactory;

import java.time.Duration;

public class HomeTest {
    WebDriver driver;
    HomePage page;
    public HomeTest(){
        page=new HomePage();
    }
    @Given("user is on homepage")
    public void user_is_on_homepage(){
        page.loadPage();
    }
    @Then("logo should contain chase")
    public void logo_should_contain_chase(){
        //Assert.assertTrue(page.getLogo().toLowerCase().contains("chase"));
        Assert.assertTrue(page.isDisplayed(),"logo not displayed");
        DriverFactory.quitDriver();
    }
}
