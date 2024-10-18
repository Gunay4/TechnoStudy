package US03;


import Utilities.BaseDriverParameter;
import Utilities.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US03_TC01 extends BaseDriverParameter {


    @Test
    public void Booking(){
        Pom3 pom3=new Pom3(driver);

        driver.get("https://techno.study/tr/");

        wait.until(ExpectedConditions.elementToBeClickable(pom3.apply)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom3.name)).sendKeys("Test_Aslan");
        wait.until(ExpectedConditions.visibilityOf(pom3.email)).sendKeys("Test_aslan@mailsitesi.com");
        wait.until(ExpectedConditions.elementToBeClickable(pom3.TelCode)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom3.cAndorra)).click();
        wait.until(ExpectedConditions.visibilityOf(pom3.telnumberInput)).sendKeys("9102345");
        wait.until(ExpectedConditions.visibilityOf(pom3.age)).sendKeys("36");
        wait.until(ExpectedConditions.visibilityOf(pom3.job)).sendKeys("worker");
        wait.until(ExpectedConditions.elementToBeClickable(pom3.eduSelect)).click();
        Select education= new Select(pom3.eduSelect);
        education.selectByValue("Üniversite");
        wait.until(ExpectedConditions.elementToBeClickable(pom3.countrySelect)).click();
        Select country=new Select(pom3.countrySelect);
        country.selectByValue("Andorra");
        wait.until((ExpectedConditions.elementToBeClickable(pom3.courseSelect))).click();
        Select course=new Select(pom3.courseSelect);
        course.selectByValue("SDET Türkçe");
        wait.until(ExpectedConditions.elementToBeClickable(pom3.surveySelect)).click();
        Select survey=new Select(pom3.surveySelect);
        survey.selectByValue("Facebook");
        wait.until(ExpectedConditions.elementToBeClickable(pom3.checkboxSelect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom3.submitBtn)).click();
        Tools.wait(6);
        wait.until(ExpectedConditions.visibilityOf(pom3.infoBox));
        Assert.assertTrue(pom3.infoBox.getText().contains("Başvurunuz alınmıştır"),"Başvuru işlemleri hatalıdır");


    }


}
