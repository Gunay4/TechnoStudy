package US04;

import Utilities.BaseDriver;
import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US04_TC01 extends BaseDriverParameter {

    @Test
    public void Test01(){

        Pom4 pom = new Pom4(driver);
        driver.get("https://techno.study/tr/");
        String currentUrl = driver.getCurrentUrl();

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        wait.until(ExpectedConditions.visibilityOf(pom.faceIcon));
        Assert.assertTrue(pom.faceIcon.isDisplayed(), "Facebook icon is not diplayed");
        wait.until(ExpectedConditions.elementToBeClickable(pom.faceClick)).click();
        wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/technostudy.turkiye"));

        driver.navigate().back();

        wait.until(ExpectedConditions.visibilityOf(pom.instaIcon));
        Assert.assertTrue(pom.instaIcon.isDisplayed(), "Instagram icon is not diplayed");
        wait.until(ExpectedConditions.elementToBeClickable(pom.instaClick)).click();
        wait.until(ExpectedConditions.urlToBe("https://www.instagram.com/technostudy.tr/"));

        driver.navigate().back();

        wait.until(ExpectedConditions.visibilityOf(pom.youtubeIcon));
        Assert.assertTrue(pom.youtubeIcon.isDisplayed(), "Youtube icon is not diplayed");
        wait.until(ExpectedConditions.elementToBeClickable(pom.youtubeClick)).click();
        wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/@TechnoStudyTR"));

        driver.navigate().back();

        wait.until(ExpectedConditions.visibilityOf(pom.inIcon));
        Assert.assertTrue(pom.inIcon.isDisplayed(), "LinkedIn icon is not diplayed");
        wait.until(ExpectedConditions.elementToBeClickable(pom.inClick)).click();
        wait.until(ExpectedConditions.urlToBe("https://www.linkedin.com/company/techno-study-tr/"));

        driver.navigate().back();

        Assert.assertEquals(currentUrl,"https://techno.study/tr/","Home page is not diplayed");

    }
}
