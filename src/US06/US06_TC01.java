package US06;


import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US06_TC01 extends BaseDriverParameter {
    @Test
    public void TC01() {
        Pom6 pom = new Pom6(driver);
        driver.get("https://techno.study/tr");
        js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);
        for (int i = 0; i < pom.detailedInfo.size(); i++) {
            js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", pom.detailedInfo.get(i));
            wait.until(ExpectedConditions.elementToBeClickable(pom.detailedInfo.get(i))).click();
            wait.until(ExpectedConditions.elementToBeClickable(pom.homePageButton));
            String curURL = driver.getCurrentUrl();
            if (curURL.contains("sdet")) {
                Assert.assertTrue(pom.sdet.getText().toLowerCase().contains("test"));
            } else if (curURL.contains("androidapp")) {
                Assert.assertTrue(pom.appium.getText().toLowerCase().contains("android"));
            } else if (curURL.contains("veribilimi")) {
                Assert.assertTrue(pom.dataScience.getText().toLowerCase().contains("veri bilimi"));
            }
            pom.homePageButton.click();
            js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);
        }
    }
}
