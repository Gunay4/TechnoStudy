package US06;


import POM.POM;
import Utilities.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US06_TC01 extends BaseDriverParameter {
    @Test(groups = {"Smoke Test"})
    public void TC01() {
        POM pom = new POM(driver);
        driver.get("https://techno.study/tr");
        wait.until(ExpectedConditions.elementToBeClickable(pom.homePageButton));
        js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);
        for (int i = 0; i < pom.detailedInfo.size(); i++) {
            js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", pom.detailedInfo.get(i));
            wait.until(ExpectedConditions.elementToBeClickable(pom.detailedInfo.get(i))).click();
            wait.until(ExpectedConditions.elementToBeClickable(pom.homePageButton));
            String curURL = driver.getCurrentUrl();
            switch (curURL){
                case "https://techno.study/tr/veribilimi":Assert.assertTrue(pom.dataScienceText.getText().toLowerCase().contains("veri"));break;
                case "https://techno.study/tr/androidapp":Assert.assertTrue(pom.appium.getText().toLowerCase().contains("android"));break;
                case "https://techno.study/tr/sdet":Assert.assertTrue(pom.sdetText.getText().toLowerCase().contains("sdet"));break;
            }
            pom.homePageButton.click();
            wait.until(ExpectedConditions.urlToBe("https://techno.study/tr"));
            js.executeScript("arguments[0].scrollIntoView();", pom.selectCourse);

        }
    }
}
