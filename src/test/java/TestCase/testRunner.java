package TestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\2320234\\eclipse-workspace\\ar1\\FeatureFiles", glue = "stepDefinition", plugin = { "pretty",
		"html:reports/myCucumberReport.html" })
public class testRunner {

}