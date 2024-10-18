package US05;

import Utilities.BaseDriverParameter;
import Utilities.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC01 extends BaseDriverParameter {
    @Test
    public void TC01() {
        Pom5 pom = new Pom5(driver);
        driver.get("https://techno.study/tr/");
        wait.until(ExpectedConditions.elementToBeClickable(pom.apply));
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(pom.sMElements.get(0)));

        for (int i = 0; i < pom.sMElements.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(pom.apply));
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            wait.until(ExpectedConditions.elementToBeClickable(pom.sMElements.get(0)));
            Assert.assertTrue(pom.sMElements.get(i).isDisplayed());
            pom.sMElements.get(i).click();
            wait.until(ExpectedConditions.urlContains(pom.sMLinks(i)));
            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(pom.sMLinks(i)));
            driver.navigate().back();
        }

    }
}
