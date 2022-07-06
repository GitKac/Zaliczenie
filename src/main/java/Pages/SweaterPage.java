package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweaterPage {
    private WebDriver driver;
    public SweaterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "group_1")
    private WebElement sizeInput;
    @FindBy(id = "quantity_wanted")
    private WebElement qntInput;
    @FindBy(css =".add-to-cart")
    private WebElement addToCardButton;

    public void clothesSize(){
        sizeInput.click();
        sizeInput.sendKeys("M");
    }
    public void clothesQuantity() {
        qntInput.click();
        qntInput.clear();
        qntInput.sendKeys("5");
    }
    public void goToCheckOutPage() {
        addToCardButton.click();
    }
}
