package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
    private WebDriver driver;

    public AddressFormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "alias")
    private WebElement aliasInput;
    @FindBy(name = "address1")
    private WebElement addressInput;
    @FindBy(name = "postcode")
    private WebElement postcodeInput;
    @FindBy(name = "city")
    private WebElement cityInput;
    @FindBy(name = "id_country")
    private WebElement countrySelect;
    @FindBy(name = "phone")
    private WebElement phoneInput;
    @FindBy(xpath = "//section[@id='content']/div/div/form/footer/button")
    private WebElement saveButton;

    public void gotoUserSeesPage(String Alias, String Address, String City, String PostCode, String Country, String Phone){
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys(Alias);
        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(Address);
        postcodeInput.click();
        postcodeInput.clear();
        postcodeInput.sendKeys(PostCode);
        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(City);
        countrySelect.click();
        countrySelect.sendKeys(Country);
        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(Phone);
        saveButton.click();
    }
}
