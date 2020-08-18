package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//Features"
				,glue="stepDefinitions",tags = "@activity2_5"
				,strict = true,monochrome = true)
public class Activities2_5Runner {

}
