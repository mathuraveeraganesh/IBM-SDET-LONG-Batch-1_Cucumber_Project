package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void launchGoogleBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("The Title of the page-"+driver.getTitle());
	}

	@When("^User types in Cheese and hits ENTER$")
	public void EnterValue_GoogleSearch() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cheese",Keys.ENTER);
		
	}

	@Then("^Show how many search results were shown$")
	public void GoogleSearchShown() {
		wait=new WebDriverWait(driver,5);
		WebElement eleresult = driver.findElement(By.id("result-stats"));
		wait.until(ExpectedConditions.visibilityOfAllElements(eleresult));
		System.out.println("Search result-"+eleresult.getText());
	}
	
	@And("^Close the browser$")
	public void CloseBrowser() {
		driver.close();
	}

}
