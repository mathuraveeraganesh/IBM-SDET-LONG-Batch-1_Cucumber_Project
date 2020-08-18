package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void LaunchTrainingSupportBrowser() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium/login-form");
		
	}
	
	@When("^User enters username and password$")
	public void enterUserandPwd() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterScenarioParameterUserandPwd(String User,String Pwd) {
		
		driver.findElement(By.id("username")).sendKeys(User);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	
	@Then("^Read the page title and confirmation message$")
	public void VerifypageTitle() {
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement eleConfirmMsg = driver.findElement(By.id("action-confirmation"));
		wait.until(ExpectedConditions.visibilityOf(eleConfirmMsg));
		
		String confirmMsg = eleConfirmMsg.getText();
		System.out.println("Page Title-"+driver.getTitle());
		System.out.println("Confirmation Message-"+confirmMsg);
		
		if(confirmMsg.contains("admin")) {
			Assert.assertEquals(confirmMsg,"Welcome Back, admin");
		} 
		else {
        Assert.assertEquals(confirmMsg,"Invalid Credentials");
		}

    }

	@And("^Close the Browser$")
	public void CloseBrowser() {
		driver.close();
	}

}
