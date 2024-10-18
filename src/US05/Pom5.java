package US05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Pom5 {
    public Pom5(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css= "[role='menuitem']>span")
    public List<WebElement> menus;

    @FindBy(css= "[alt='TechnoStudy']")
    public WebElement homePageButton;

    @FindBy(css = "[class*='centercontainer']>[role='list']>li>a")
    public WebElement dDMenu;


}
