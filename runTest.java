package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)
@CucumberOptions
( 		features="classpath:Features",
		glue="",
		tags="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		dryRun=true
 
		)

public class runTest {

}
