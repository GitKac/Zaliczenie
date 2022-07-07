package Shop.shopping;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/Shopping.feature",
        plugin = {"pretty", "html:report/shop/shopping/result.html"}
)
public class ShoppingTest {
}