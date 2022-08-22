package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;



public class guru99 {

	Scenario scenario;
	
	@Before
	public void SetUp(Scenario s) {
		scenario = s;
	}
	
	@Given("I open the Browser and Navigate to the URL {string}")
	public void i_open_the_Browser_and_Navigate_to_the_URL(String string) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/jaisuryas/eclipse-workspace/driver/Chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.get(string);
		scenario.write("Opened the Browser with URL: " + string);
		
	}
	
}


