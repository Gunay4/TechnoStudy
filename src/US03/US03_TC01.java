package US03;


import POM.POM;
import Utilities.BaseDriverParameter;
import Utilities.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US03_TC01 extends BaseDriverParameter {


    @Test
    public void Booking(){
        POM pom=new POM(driver);

        driver.get("https://techno.study/tr/");

        wait.until(ExpectedConditions.elementToBeClickable(pom.apply)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom.name)).sendKeys("Test_Aslan");
        wait.until(ExpectedConditions.visibilityOf(pom.email)).sendKeys("Test_aslan@mailsitesi.com");
        wait.until(ExpectedConditions.elementToBeClickable(pom.TelCode)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom.cAndorra)).click();
        wait.until(ExpectedConditions.visibilityOf(pom.telnumberInput)).sendKeys("9102345");
        wait.until(ExpectedConditions.visibilityOf(pom.age)).sendKeys("36");
        wait.until(ExpectedConditions.visibilityOf(pom.job)).sendKeys("worker");
        wait.until(ExpectedConditions.elementToBeClickable(pom.eduSelect)).click();
        Select education= new Select(pom.eduSelect);
        education.selectByValue("Üniversite");
        wait.until(ExpectedConditions.elementToBeClickable(pom.countrySelect)).click();
        Select country=new Select(pom.countrySelect);
        country.selectByValue("Andorra");
        wait.until((ExpectedConditions.elementToBeClickable(pom.courseSelect))).click();
        Select course=new Select(pom.courseSelect);
        course.selectByValue("SDET Türkçe");
        wait.until(ExpectedConditions.elementToBeClickable(pom.surveySelect)).click();
        Select survey=new Select(pom.surveySelect);
        survey.selectByValue("Facebook");
        wait.until(ExpectedConditions.elementToBeClickable(pom.checkboxSelect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom.submitBtn)).click();
        Tools.wait(6);
        wait.until(ExpectedConditions.visibilityOf(pom.infoBox));
        Assert.assertTrue(pom.infoBox.getText().contains("Başvurunuz alınmıştır"),"Başvuru işlemleri hatalıdır");


    }


}
