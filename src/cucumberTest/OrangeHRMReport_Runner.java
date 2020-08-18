package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//Features"
				,glue="stepDefinitions"
				,tags = "@OrangeHRM"
				,plugin = {"pretty","html:Report//HTML_Report","junit:Report//JUNIT_Report"}
				,strict = true,monochrome = true)
public class OrangeHRMReport_Runner {

}
