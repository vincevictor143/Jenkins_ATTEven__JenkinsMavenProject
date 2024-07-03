package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\login.feature"},
		glue= {"stepdef"},
		plugin= {"pretty"}
)

public class Login_RunnerClass extends AbstractTestNGCucumberTests
{

}
