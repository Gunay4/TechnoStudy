package US01;

import Utilities.BaseDriver;
import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US01_TC01 extends BaseDriverParameter {

    @Test()
    public void DropdownMenu(){
        Pom1 pm1=new Pom1(driver);
        driver.get("https://techno.study/tr");

        wait.until(ExpectedConditions.elementToBeClickable(pm1.courses)).click();
        Assert.assertTrue(pm1.sdet.isDisplayed());
        Assert.assertTrue(pm1.androidDev.isDisplayed());
        Assert.assertTrue(pm1.dataScience.isDisplayed());
        Assert.assertTrue(pm1.jobCenter.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(pm1.sdet)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
        driver.navigate().to("https://techno.study/tr");

        actions.moveToElement(pm1.courses).build().perform();
        wait.until(ExpectedConditions.visibilityOf(pm1.androidDev)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
        driver.navigate().to("https://techno.study/tr");

        actions.moveToElement(pm1.courses).build().perform();
        wait.until(ExpectedConditions.visibilityOf(pm1.dataScience)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("veribilimi"));
        driver.navigate().to("https://techno.study/tr");

        actions.moveToElement(pm1.courses).build().perform();
        wait.until(ExpectedConditions.visibilityOf(pm1.jobCenter)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("jobcenter"));
        driver.navigate().to("https://techno.study/tr");

    }
}
