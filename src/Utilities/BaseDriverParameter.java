package Utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.*;
import java.time.Duration;

public class BaseDriverParameter {
    public  WebDriver driver;
    public  WebDriverWait wait;
    public  Actions actions;
    public  Robot robot;
    public  JavascriptExecutor js;

    @BeforeClass(groups = {"Smoke Test"})
    @Parameters("browserType")
    public void initialOperations(String browserType) throws AWTException {


        switch (browserType.toLowerCase()) {
            case "chrome": driver = new ChromeDriver();break;
            case "edge": driver = new EdgeDriver();break;
            default:driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
        robot = new Robot();
        js=(JavascriptExecutor) driver;

    }

    @AfterClass(groups = {"Smoke Test"})
    public void closingOperations(){
        Tools.wait(3);
        driver.quit();
    }

}
