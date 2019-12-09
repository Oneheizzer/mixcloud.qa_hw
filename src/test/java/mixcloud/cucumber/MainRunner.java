package mixcloud.cucumber;

import cucumber.api.CucumberOptions;
import mixcloud.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/")

public class MainRunner extends TestBase {

}