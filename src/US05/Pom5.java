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

    @FindBy(xpath = "//div[@data-elem-type='image']/a/img")
    public List<WebElement> sMElements;

    @FindBy(xpath = "(//div[@data-elem-type='button']/a)[1]")
    public WebElement apply;



    public String sMLinks(int n){
        List<String> links=new ArrayList<>();
        links.add("facebook");
        links.add("instagram");
        links.add("youtube");
        links.add("linkedin");

        return links.get(n);
    }
}
