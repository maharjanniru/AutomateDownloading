package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//java//resources//features",
        glue ="stepsdefinitions",
        dryRun = true,
        plugin = {"pretty",
              "html:test-output"}

)
public class TestRun {

}
