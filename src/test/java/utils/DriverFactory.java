package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            switch (browser.toLowerCase()) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void quitDriver() {
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
    }
