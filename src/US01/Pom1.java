package US01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

    public Pom1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
//
    @FindBy(xpath = "(//li[contains (@class,'list_item')]/a)[1]")
    public WebElement courses;

    @FindBy(xpath = "(//a[@role='menuitem'])[1]")
    public WebElement sdet;

    @FindBy(xpath = "//span[text()='Android Uygulama Geliştirme']")
    public WebElement androidDev;

    @FindBy(xpath = "//span[text()='Veri Bilimi']")
    public WebElement dataScience;

    @FindBy(xpath = "(//a[@role='menuitem'])[4]")
    public WebElement jobCenter;

    @FindBy(css = "[alt='TechnoStudy']")
    public WebElement technoStudybutton;

    @FindBy(xpath = "//div[text()='Yeni alanlar keşfet.']")
    public WebElement mainPageMessage;


}
