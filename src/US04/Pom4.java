package US04;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
    public Pom4() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

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


}
