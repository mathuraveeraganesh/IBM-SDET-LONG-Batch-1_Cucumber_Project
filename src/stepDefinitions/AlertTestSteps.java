package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertTestSteps {

	WebDriver driver;
	WebDriverWait wait;
	Alert sAlert;
	
	@Given("^User is on the page$")
	public void AlertPage() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		
	}
	
	@When("^User clicks the Simple Alert button$")
	public void ClickSimpleAlert() {
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void ClickConfirmAlert() {
		driver.findElement(By.xpath("//button[text()='Confirmation']")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void ClickPromptAlert() {
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
	}
	
	@Then("^Alert opens$")
	public void AlertOpen() {
		sAlert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void ReadText() {
		String text = sAlert.getText();
		System.out.println(text);
	}
	
	@And("^Close the alert$")
	public void CloseAlert() {
		sAlert.accept();
	}
	
	@And("^Read the result text$")
	public void ReadResult() {
		String text = driver.findElement(By.xpath("//div[@class='content']")).getText();
		System.out.println(text);
	}
	
	@And("^Write a custom message in it$")
	public void CustomMsg() {
		sAlert.sendKeys("Ganesh");
	}
	
	@And("^Close the alert with Cancel$")
	public void CloseAlertCancel() {
		sAlert.dismiss();
	}
	
	@And("^Close Alert Browser$")
	public void CloseAlertBrowser() {
		driver.close();
	}
}
