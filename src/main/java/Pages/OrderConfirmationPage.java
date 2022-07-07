package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class OrderConfirmationPage {
    private WebDriver driver;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//section[@id='content-hook_payment_return']/div/div/div/p")
    private WebElement paymentReturn;
    public void content() {
        paymentReturn.click();
    }
    public void takeScreenshot()
    {
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("ScreenshotOfOrder.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
