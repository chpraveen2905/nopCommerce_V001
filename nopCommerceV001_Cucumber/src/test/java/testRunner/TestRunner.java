package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features//",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		tags= {"@sanity, @regression"},
		plugin={"pretty","html:test-output"}
		)
public class TestRunner {

}
