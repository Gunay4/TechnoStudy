package US02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
    WebDriver driver;

    public Pom2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Campus Login']")
    public WebElement campusLoginButton;

    public void clickCampusLogin() {
        campusLoginButton.click();
    }

    public boolean isAtCampusLoginPage() {
        return driver.getCurrentUrl().contains("campus");
    }
}
