package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersSeesPage {
    private WebDriver driver;

    public UsersSeesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='address-body']")
    private static WebElement addressBody;

    public void addressInfo() {

        addressBody.click();

        System.out.println(addressBody.getText());
    }
    @FindBy(xpath = "//a[@data-link-action='delete-address']")
    private static WebElement deleteAddress;

    public void cleanAddresses() {
        deleteAddress.click();
    }
}
