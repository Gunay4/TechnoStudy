package US07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pom7 {
    public Pom7(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Kullanım Şartlarını']")
    public WebElement termOfUse;

    @FindBy(xpath = "//strong")
    public List<WebElement> articles;

    @FindBy(css = "[field='title']>div")
    public WebElement title;
}