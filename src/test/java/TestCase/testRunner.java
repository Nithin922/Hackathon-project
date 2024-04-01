package TestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\2320234\\eclipse-workspace\\ar1\\FeatureFiles", glue = "stepDefinition",
plugin = { "pretty",
		"html:reports/myCucumberReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun=true,//to check mapping between steps and step def methods with no execution of application
publish=true//to publish the cucumber report on cucmuber junit server and generate a sharable url of cucumber report		

)
public class testRunner {

}