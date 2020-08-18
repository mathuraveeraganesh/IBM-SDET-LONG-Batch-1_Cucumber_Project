package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Features"
				,glue="stepDefinitions"
				//,tags = "@SmokeTest"
				//,tags="@SimpleAlert,@ConfirmAlert"
				//,tags="@PromptAlert"
				,tags="@activity1_3"
				,strict = true,monochrome = true)

public class Activities1_3Runner {

}
