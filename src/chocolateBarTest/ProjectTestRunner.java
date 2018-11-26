package chocolateBarTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.textui.TestRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@Scenario1"},
		features = {"Feature"},
		glue = {"stepDefinition"},
		format = { "pretty","html: cucumber-html-reports","json: cucumber-html-reports/cucumber.json" }
)
		
public class ProjectTestRunner extends TestRunner {

}