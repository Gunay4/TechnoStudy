package US05;

import POM.POM;
import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC01 extends BaseDriverParameter {
    @Test
    public void TC01() {
        POM pom=new POM(driver);
        driver.get("https://techno.study/tr");

        for (int i = 0; i < pom.menus.size(); i++) {
            wait.until(ExpectedConditions.urlToBe("https://techno.study/tr"));
            wait.until(ExpectedConditions.elementToBeClickable(pom.dDMenu));
            actions.moveToElement(pom.dDMenu).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(pom.menus.get(i))).click();
            wait.until(ExpectedConditions.elementToBeClickable(pom.homePageButton));
            Assert.assertTrue(pom.homePageButton.isDisplayed());
            pom.homePageButton.click();
        }

    }
}
