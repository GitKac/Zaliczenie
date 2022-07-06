package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
    private WebDriver driver;
    public LoginPage1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit-login")
    private WebElement submitLogin;
    public void goToAccountPage1(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitLogin.click();
    }
}
