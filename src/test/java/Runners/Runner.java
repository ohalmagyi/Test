package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/PLAYG-T60.feature",
		glue = "Automation",
		plugin = "json:target/cucumber/LoginResult.json"
		)

public class Runner {

}
