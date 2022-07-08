package Shop.address;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddAddressSteps {
    WebDriver driver;
    private long userAddAddressDetails;

    @Given("User is logged to the account")
    public void userIsLoggedToTheAccount() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://mystore-testlab.coderslab.pl");

        MainPage mainPage = new MainPage(driver);
        mainPage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToAccountPage("vkvtibckgyouuwqreq@kvhrs.com", "Pass11");
    }

    @And("he goes to address form page")
    public void heWentToFormPage() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.goToAddressesPage();

        AddressesPage addressesPage = new AddressesPage(driver);
        addressesPage.goToAddressFormPage();
    }

    @When("User add {}, {}, {}, {}, {} and {} details to account")
    public void userAddAddressDetails(String Alias, String Address, String City, String PostCode, String Country, String Phone) throws Throwable {
        AddressFormPage addressFormPage = new AddressFormPage(driver);
        addressFormPage.userAdd(Alias, Address, City, PostCode, Country, Phone);
        addressFormPage.goToUserSeePage();
    }

    @Then("User can double check all details")
    public void userSees() throws Throwable {
        UsersSeesPage usersSeesPage = new UsersSeesPage(driver);
        usersSeesPage.notePopUp();
        Assert.assertTrue(usersSeesPage.getPopUp().contains("Address successfully added!"));
        usersSeesPage.addressInfo();


        usersSeesPage.cleanAddresses();
        usersSeesPage.labelConf();
        usersSeesPage.getConfirmation();
        Assert.assertTrue(usersSeesPage.getConfirmation().contains("Address successfully deleted!"));
    }
    @And("he can close browser")
    public void closeBrowser() {

        driver.quit();
    }
}


