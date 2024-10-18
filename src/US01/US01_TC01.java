package US01;

import POM.POM;
import Utilities.BaseDriverParameter;
import Utilities.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US01_TC01 extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    public void DropdownMenu() {
        POM pom=new POM(driver);
        driver.get("https://techno.study/tr");

        wait.until(ExpectedConditions.elementToBeClickable(pom.courses)).click();
        Assert.assertTrue(pom.sdet.isDisplayed());
        Assert.assertTrue(pom.androidDev.isDisplayed());
        Assert.assertTrue(pom.dataScience.isDisplayed());
        Assert.assertTrue(pom.jobCenter.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(pom.sdet)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
        pom.technoStudybutton.click();

        wait.until(ExpectedConditions.textToBePresentInElement(pom.mainPageMessage, "Yeni alanlar keşfet."));
        actions.moveToElement(pom.courses).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(pom.androidDev)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
        pom.technoStudybutton.click();

        wait.until(ExpectedConditions.textToBePresentInElement(pom.mainPageMessage, "Yeni alanlar keşfet."));
        actions.moveToElement(pom.courses).build().perform();
        Tools.wait(2);
        wait.until(ExpectedConditions.visibilityOf(pom.dataScience)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("veribilimi"));
        pom.technoStudybutton.click();

        wait.until(ExpectedConditions.textToBePresentInElement(pom.mainPageMessage, "Yeni alanlar keşfet."));
        actions.moveToElement(pom.courses).build().perform();
        wait.until(ExpectedConditions.visibilityOf(pom.jobCenter)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("jobcenter"));
        pom.technoStudybutton.click();

    }
}
