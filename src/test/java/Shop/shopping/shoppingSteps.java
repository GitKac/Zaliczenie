package Shop.shopping;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class shoppingSteps {

    WebDriver driver;

    @Given("User is logged to the account")
    public void userIsLoggedToTheAccount() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://mystore-testlab.coderslab.pl");

        MainPage1 mainPage1 = new MainPage1(driver);
        mainPage1.goToLoginPage1();

        LoginPage1 loginPage1 = new LoginPage1(driver);
        loginPage1.goToAccountPage1("vkvtibckgyouuwqreq@kvhrs.com", "Pass11");
    }
     @And("he choose a clothes")
    public void heChooseClothes() {
         AccountPage1 accountPage1 = new AccountPage1(driver);
         accountPage1.searchBar("Hummingbird Printed Sweater");
         accountPage1.goToClothesPage();

         ClothesPage clothesPage = new ClothesPage(driver);
         clothesPage.goToSweaterPage();
     }
     @And("he choose a size")
    public void heChooseSize() {
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.clothesSize();
     }
     @And("he choose a quantity")
    public void heChooseQnt() {
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.clothesQuantity();
     }
     @And("he add stuff to the trolley")
    public void heAddToCart() {
         SweaterPage sweaterPage = new SweaterPage(driver);
         sweaterPage.goToCheckOutPage();
     }

     @When("User goes to checkout")
    public void userCheckout() {
             CheckOutPage checkOutPage = new CheckOutPage(driver);
             checkOutPage.goToShoppingCart();

             ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
             shoppingCartPage.goToPersonalInformationPage();
         }

     @And("he confirm his address")
    public void heConfirmAddress() {
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.confirmAddress();
     }
     @And("he choose how he will collect it")
    public void howToCollect() {
         PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
         personalInformationPage.confirmDelivery();
     }
     @Then("User will choose how to pay")
    public void howToPay() {
         PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
         personalInformationPage.howToPay();
     }
     @And("he will order with an obligation to pay")
    public void obligationToPay() {
         PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
         personalInformationPage.termsAndConditions();
         personalInformationPage.goToOrderConfirmationPage();
     }
     @And("he make a screenshot")
    public void makeScreenshot() {
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.takeScreenshot();

     }
     @And("he can close browser")
    public void closeBrowser() {
        driver.quit();
     }
}
