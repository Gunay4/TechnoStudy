package US07;

import Utilities.BaseDriver;
import Utilities.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;

public class US07_TC01 extends BaseDriver {

    @Test
    public void TC01() {
        Pom7 pom = new Pom7();
        driver.get("https://techno.study/tr/");
        String homeID = driver.getWindowHandle();
        js.executeScript("arguments[0].scrollIntoView();", pom.scrollToForm);
        pom.termOfUse.click();
        Set<String> tabIds = driver.getWindowHandles();
        for (String e : tabIds)
            if (!e.equals(homeID))
                driver.switchTo().window(e);
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/terms"));
        Assert.assertFalse(pom.articles.isEmpty());
        for (WebElement articles : pom.articles) {
            Assert.assertFalse(articles.getText().isEmpty());
        }
        Assert.assertTrue(pom.title.getText().equalsIgnoreCase("kullanım şartları"));
    }
}
