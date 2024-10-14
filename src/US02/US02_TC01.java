package US02;

import Utilities.BaseDriver;
import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US02_TC01 extends BaseDriverParameter {

    @Test
    public void testCampusLoginRedirect() {

        driver.get("https://techno.study/tr/");

        Pom2 pom2 = new Pom2(driver);

        wait.until(ExpectedConditions.elementToBeClickable(pom2.campusLoginButton)).click();

        wait.until(ExpectedConditions.urlContains("campus"));

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        Assert.assertTrue(currentUrl.contains("campus"), "Yönlendirme başarısız! Campus Girişi sayfasına ulaşılamadı.");
    }
}
