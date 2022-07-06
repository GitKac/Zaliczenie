package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage1 {
    private WebDriver driver;
    public AccountPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "s")
    private WebElement storeLink;
    @FindBy(xpath = "//i[@class='material-icons search']")
    private WebElement submitButton;
    public void goToClothesPage(){
        storeLink.click();
        storeLink.clear();
        storeLink.sendKeys("Hummingbird Printed Sweater");
        submitButton.click();
    }
}
