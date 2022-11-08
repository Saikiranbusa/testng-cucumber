package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features={"src/test/resources/login/login.feature"} ,glue = {"defination"}, tags = "@NegativeTesting", plugin = {"html:testng/runner.html"}) 
public class testrunner2   extends  AbstractTestNGCucumberTests {
	

}
