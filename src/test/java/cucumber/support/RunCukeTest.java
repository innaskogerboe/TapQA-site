package cucumber.support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/homepage.feature",
		plugin={"pretty"},
		glue = {"cucumber.steps",
                "cucumber.support"},
		tags = {})
public class RunCukeTest {


}
