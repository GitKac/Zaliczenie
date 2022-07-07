package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AccountPage1 {
    private WebDriver driver;
    public AccountPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().defaultContent();
    }
    @FindBy(xpath = "//input[@name='s']")
    private WebElement storeLink;
    @FindBy(xpath = "//i[@class='material-icons search']")
    private WebElement submitButton;
    public void searchBar(String name) {
        storeLink.click();
        storeLink.clear();
        storeLink.sendKeys(name);
    }
        public void goToClothesPage() {
        submitButton.click();
    }
}
