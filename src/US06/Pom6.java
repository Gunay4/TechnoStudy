package US06;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pom6 {
    public Pom6(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Kursunu seç']")
    public WebElement selectCourse;

    @FindBy(xpath = "//a[text()='Detaylı bilgi']")
    public List<WebElement> detailedInfo;

    @FindBy(css = "[alt='TechnoStudy']")
    public WebElement homePageButton;

    @FindBy(xpath = "//h1[text()='TEST UZMANI']")
    public WebElement sdet;

    @FindBy(xpath = "//strong[text()='Android Uygulama Geliştirme']")
    public WebElement appium;

    @FindBy(xpath = "//div[text()='Veri Bilimi Bootcamp']")
    public WebElement dataScience;
}
