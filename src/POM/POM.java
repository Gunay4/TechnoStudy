package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM {
    public POM(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

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

    //

    @FindBy(xpath = "//a[text()='Campus Login']")
    public WebElement campusLoginButton;

    //

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

    //

    @FindBy(xpath= "//*[@id=\"rec684017893\"]/div/div/div[4]/a/img")
    public WebElement faceIcon;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/technostudy.turkiye']")
    public WebElement faceClick;


    @FindBy(xpath= "//*[@id=\"rec684017893\"]/div/div/div[5]/a/img")
    public WebElement instaIcon;

    @FindBy(xpath= "//a[@href='https://www.instagram.com/technostudy.tr/']")
    public WebElement instaClick;

    @FindBy(xpath= "//*[@id=\"rec684017893\"]/div/div/div[6]/a/img")
    public WebElement youtubeIcon;

    @FindBy(xpath= "//a[@href='https://www.youtube.com/@TechnoStudyTR']")
    public WebElement youtubeClick;

    @FindBy(xpath= "//*[@id=\"rec684017893\"]/div/div/div[7]/a/img")
    public WebElement inIcon;

    @FindBy(xpath= "//a[@href='https://www.linkedin.com/company/techno-study-tr/']")
    public WebElement inClick;

    //

    @FindBy(css= "[role='menuitem']>span")
    public List<WebElement> menus;

    @FindBy(css= "[alt='TechnoStudy']")
    public WebElement homePageButton;

    @FindBy(css = "[class*='centercontainer']>[role='list']>li>a")
    public WebElement dDMenu;

    //

    @FindBy(xpath = "//span[text()='Kursunu seç']")
    public WebElement selectCourse;

    @FindBy(xpath = "//a[text()='Detaylı bilgi']")
    public List<WebElement> detailedInfo;

    @FindBy(xpath = "//span[text()='SDET ']")
    public WebElement sdetText;

    @FindBy(xpath = "//strong[text()='Android Uygulama Geliştirme']")
    public WebElement appium;

    @FindBy(xpath = "//h2[text()='Techno Study ile Veri Bilimci Olun']")
    public WebElement dataScienceText;

    //

    @FindBy(xpath = "//a[text()='Kullanım Şartlarını']")
    public WebElement termOfUse;

    @FindBy(xpath = "//strong")
    public List<WebElement> articles;

    @FindBy(css = "[field='title']>div")
    public WebElement title;


}
