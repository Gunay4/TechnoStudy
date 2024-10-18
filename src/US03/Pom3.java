package US03;

import Utilities.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
    public Pom3(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[class='tn-atom js-click-zero-stat']")
    public WebElement apply;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(css = "[class='t-input-phonemask__select']")
    public  WebElement TelCode;

    @FindBy(id = "t-phonemask_ad")
    public  WebElement cAndorra;

    @FindBy(name = "tildaspec-phone-part[]")
    public WebElement telnumberInput;

    @FindBy(name = "Input")
    public WebElement age;

    @FindBy(name = "Input_2")
    public WebElement job;

    @FindBy(name = "country")
    public WebElement eduSelect;

    @FindBy(name = "country_2")
    public WebElement countrySelect;

    @FindBy(name = "course")
    public WebElement courseSelect;

    @FindBy(name = "survey")
    public WebElement surveySelect;

    @FindBy(css = "[class='t-checkbox__indicator']")
    public WebElement checkboxSelect;

    @FindBy(css = "[class='t-submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "(//div[@id='tildaformsuccesspopuptext']//span)[1]")
    public WebElement infoBox;




}
