package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuiteCRMSteps {
	WebDriver driver;
	
	@Given("^User is on SuiteCRMUrl Login Page$")
	public void user_is_on_SuiteCRMUrl_Login_Page() throws Throwable {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Launch Browser
		driver.get("http://alchemy.hguy.co/crm");
	}

	@And("^User enters SuiteCRM UserNames and Passwords$")
	public void user_enters_SuiteCRM_UserNames_and_Passwords() throws Throwable {
		
		//Login into the Application
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);
	}

	@When("^Count the number of Dashlets and Print the No and title of each Dashlet$")
	public void count_the_number_of_Dashlets_and_Print_the_No_and_title_of_each_Dashlet() throws Throwable {
	    
	    List<WebElement> eleDashlets = driver.findElements(By.xpath("//td[@class='dashlet-title']/h3/span[2]"));
	    
	    int sDashlets = eleDashlets.size();
	    
	    System.out.println("Number of Dashlets-"+sDashlets);
	    System.out.println("--------Dashlets----------");
	    for (int i = 0; i < eleDashlets.size(); i++) {
	    	String Dashlets = eleDashlets.get(i).getText();
	    	System.out.println(Dashlets);
			
		}
	    
	}

	@Then("^Close the CRMbrowser\\.$")
	public void close_the_CRMbrowser() throws Throwable {
	    driver.close();
	}
	
	@Given("^Navigate to Sales -> Leads -> Create Lead$")
	public void navigate_to_Sales_Leads_Create_Lead() throws Throwable {
		//Navigate to Leads Page
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",		
		driver.findElement(By.xpath("(//a[text()='Leads'])[3]")));
		Thread.sleep(2000);
		
		//Create Lead
		driver.findElement(By.xpath("//div[text()='Create Lead']")).click();
		Thread.sleep(2000);
	}

	@Given("^And Fill in the required Create Lead fields using the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" data from the Examples table$")
	public void and_Fill_in_the_required_Create_Lead_fields_using_the_and_data_from_the_Examples_table
	(String salutation,String fName, String lName, String pWork, String pMobile) throws Throwable {
		
		Select salution=new Select(driver.findElement(By.id("salutation")));
		salution.selectByVisibleText(salutation);
		driver.findElement(By.id("first_name")).sendKeys(fName);
		driver.findElement(By.id("last_name")).sendKeys(lName);
		driver.findElement(By.id("phone_work")).sendKeys(pWork);
		driver.findElement(By.id("phone_mobile")).sendKeys(pMobile);
	    
	}

	@And("^Click Save to finish$")
	public void click_Save_to_finish() throws Throwable {
		driver.findElement(By.id("SAVE")).click();
		Thread.sleep(5000);
	}

	@When("^Navigate to the View Leads page to see results \"([^\"]*)\"$")
	public void navigate_to_the_View_Leads_page_to_see_results(String sFirstName) throws Throwable {
		driver.findElement(By.xpath("//div[text()='View Leads']")).click();
		Thread.sleep(5000);
		String sResult = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody//td/b/a")).getText();
		if(sResult.contains(sFirstName)) {
			System.out.println("Verified View Leads page contains Created Lead");
		}
		else {
			System.out.println("Verification Failed for View Leads page contains Create Lead");
		}
	}
	
	@Given("^Navigate to Activities -> Meetings -> Schedule a Meeting$")
	public void navigate_to_Activities_Meetings_Schedule_a_Meeting() throws Throwable {
		//Navigate to Activities Page
		driver.findElement(By.xpath("//a[text()='Activities']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",		
		driver.findElement(By.xpath("//a[text()='Meetings']")));
		Thread.sleep(4000);
		
		//Schedule a Meeting
		driver.findElement(By.xpath("//div[text()='Schedule Meeting']")).click();
		Thread.sleep(2000);
	}

	@And("^Enter the Subject \"([^\"]*)\" of the meeting\\.$")
	public void enter_the_details_of_the_meeting(String sSubject) throws Throwable {
	   driver.findElement(By.id("name")).sendKeys(sSubject);
	   
	}

	@And("^Search for members \"([^\"]*)\" and add them to the meeting$")
	public void search_for_members_and_add_them_to_the_meeting(String fname) throws Throwable {
		driver.findElement(By.id("assigned_user_name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("assigned_user_name")).sendKeys(fname);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[text()='"+fname+"']")).click();
	}
	
	@And("^Click Save Meeting to finish$")
	public void click_Save_Meeting_to_finish() throws Throwable {
		driver.findElement(By.id("SAVE_HEADER")).click();
		Thread.sleep(5000);
	}
	
	@When("^Navigate to View Meetings page and confirm creation of the meeting for \"([^\"]*)\"$")
	public void navigate_to_View_Meetings_page_and_confirm_creation_of_the_meeting(String sSubject) throws Throwable {
		driver.findElement(By.xpath("//div[text()='View Meetings']")).click();
		Thread.sleep(5000);
		String sGetsubject = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody//td[@field='name']/b/a")).getText();
		if(sGetsubject.contains(sSubject)) {
			System.out.println("confirm creation of the meeting for Subject");
		}
		else {
			System.out.println("confirmation Failed for creation of the meeting for Subject");
		}
		
	}
	
	@Given("^Navigate to All -> Products-> Create Product$")
	public void navigate_to_All_Products_Create_Product() throws Throwable {
		//Navigate to All Products Page
		driver.findElement(By.xpath("//a[text()='All']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",		
		driver.findElement(By.xpath("//a[text()='Products']")));
		Thread.sleep(4000);
		
		//Create Product
		driver.findElement(By.xpath("//div[text()='Create Product']")).click();
		Thread.sleep(2000);
	}

	@And("^Enter the productName \"([^\"]*)\" and Price \"([^\"]*)\"$")
	public void enter_the_productName_and_Price(String sProduct, String sPrice) throws Throwable {
	   driver.findElement(By.id("name")).sendKeys(sProduct);
	   driver.findElement(By.id("price")).sendKeys(sPrice);
	}

	@And("^Click Save To Create Product$")
	public void click_Save_To_Create_Product() throws Throwable {
	    driver.findElement(By.xpath("(//input[@id='SAVE'])[2]")).click();
	    Thread.sleep(5000);
	}

	@When("^Go to the View Products page to see product \"([^\"]*)\" listed$")
	public void go_to_the_View_Products_page_to_see_product_listed(String sProduct) throws Throwable {
	   driver.findElement(By.xpath("//div[text()='View Products']")).click();
	   Thread.sleep(5000);
		String sGetproduct = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody//td[@field='name']/b/a")).getText();
		if(sGetproduct.contains(sProduct)) {
			System.out.println("confirm products listed in View Product");
		}
		else {
			System.out.println("confirmation Failed products listed in View Product");
		}
	}


}
