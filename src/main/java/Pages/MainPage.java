package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MainPage {
    private WebDriver driver;
    public MainPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement signInButton;
        public void goToLoginPage() {
            signInButton.click();
    }
}
