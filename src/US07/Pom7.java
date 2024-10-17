package US07;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pom7 {
    public Pom7() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath= "//*[@data-elem-type='form']")
    public WebElement scrollToForm;

    @FindBy(xpath = "//a[text()='Kullanım Şartlarını']")
    public WebElement termOfUse;

    @FindBy(xpath = "//strong")
    public List<WebElement> articles;

    @FindBy(css = "[field='title']>div")
    public WebElement title;
}