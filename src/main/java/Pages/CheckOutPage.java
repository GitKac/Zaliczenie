package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private WebDriver driver;
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//a[contains(@href, '//mystore-testlab.coderslab.pl/index.php?controller=cart&action=show')])[2]")
    private WebElement proceedCheckOut;

    public void goToShoppingCart() {
        proceedCheckOut.click();
    }
}
