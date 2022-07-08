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
    @FindBy(xpath = "//li[contains(.,'Address successfully added!')]")
    private WebElement popUp;
    public void notePopUp(){
        popUp.click();
        System.out.println(popUp.getText());
    }
    public String getPopUp(){
        return popUp.getText();
    }

    @FindBy(xpath = "//div[@class='address-body']")
    private WebElement addressBody;
    public void addressInfo() {
        addressBody.click();
        System.out.println(addressBody.getText());
    }

    @FindBy(xpath = "//a[@data-link-action='delete-address']")
    private WebElement deleteAddress;
    public void cleanAddresses() {
        deleteAddress.click();
    }
    @FindBy(xpath = "//aside[@id='notifications']/div/article")
    private WebElement confirmLabel;
    public void labelConf(){
        confirmLabel.click();
        System.out.println(confirmLabel.getText());
    }

    public String getConfirmation(){
        return confirmLabel.getText();
    }


}
