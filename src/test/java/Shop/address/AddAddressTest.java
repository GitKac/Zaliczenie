package Shop.address;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/AddAddress.feature",
        plugin = {"pretty", "html:report/shop/address/result.html"}
)
public class AddAddressTest {
}
