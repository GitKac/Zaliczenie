package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage {
    private WebDriver driver;
    public PersonalInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "confirm-addresses")
    private WebElement addressButton;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement deliveryButton;

    @FindBy(id = "payment-option-1")
    private WebElement paymentInp;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement approveBox;

    @FindBy(xpath = "(//button[@type='submit'])[9]")
    private WebElement submitButton;

    public void confirmAddress() {
        addressButton.click();
    }
    public void confirmDelivery() {
        deliveryButton.click();
    }
    public void howToPay() {
        paymentInp.click();
    }
    public void termsAndConditions() {
        approveBox.click();
    }
    public void goToOrderConfirmationPage() {
        submitButton.click();
    }
}
