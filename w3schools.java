package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaisuryas/eclipse-workspace/driver/Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/sql_syntax.asp");


	}

}
