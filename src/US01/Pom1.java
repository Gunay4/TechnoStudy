package US01;

import Utilities.BaseDriver;
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

    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement androidDev;

    @FindBy(xpath = "(//a[@role='menuitem'])[3]")
    public WebElement dataScience;

    @FindBy(xpath = "(//a[@role='menuitem'])[4]")
    public WebElement jobCenter;
}
