package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlchemyJobsSteps {
	WebDriver driver;
	WebDriverWait wait;
		
	@Given("^User is on AlchemyUrl Login Page$")
	public void user_is_on_AlchemyUrl_Login_Page() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@And("^User enters UserNames and Passwords$")
	public void user_enters_UserNames_and_Passwords() throws Throwable {
	    driver.findElement(By.id("user_login")).sendKeys("root");
	    driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	    driver.findElement(By.id("wp-submit")).click();
	}

	@And("^Locate the left hand menu and click the menu item that says Users$")
	public void locate_the_left_hand_menu_and_click_the_menu_item_that_says_Users() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Users']"))));
	    
	   driver.findElement(By.xpath("//div[text()='Users']")).click();
	   
	   
	}
	
	@And("^Locate the Add New button and click it$")
	public void locate_the_Add_New_button_and_click_it() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[text()='Add New'])[7]"))));
	    
	   driver.findElement(By.xpath("(//a[text()='Add New'])[7]")).click();
	}
	
	@And("^Fill in the necessary details$")
	public void fill_in_the_necessary_details() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_login"))));
		
	    driver.findElement(By.id("user_login")).sendKeys("mathura_ganesh");
	    driver.findElement(By.id("email")).sendKeys("mathura_ganesh@gmail.com");
	    driver.findElement(By.id("first_name")).sendKeys("mathura");
	    driver.findElement(By.id("last_name")).sendKeys("ganesh");
	    driver.findElement(By.id("url")).sendKeys("https://alchemy.hguy.co/jobs/wp-admin/mathura_ganesh");
	    
	    
	}

	@And("^Click the Add New User button$")
	public void click_the_Add_New_User_button() throws Throwable {
		driver.findElement(By.id("createusersub")).click();
		Thread.sleep(4000);
	}

	@When("^Verify that the user was created$")
	public void verify_that_the_user_was_created() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user-search-input"))));
		driver.findElement(By.id("user-search-input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("user-search-input")).sendKeys("mathura_ganesh");
		driver.findElement(By.id("search-submit")).click();
		Thread.sleep(4000);
		String sUserName = driver.findElement(By.xpath("//tbody[@id='the-list']//td/strong/a")).getText();
		if(sUserName.contains("mathura_ganesh")) {
			System.out.println("Verify that the user was created");
		}
		else {
			System.out.println("Verification Failed for the user was created");
		}
		
	}

	@Then("^Close the AlchemyBrowser$")
	public void close_the_AlchemyBrowser() throws Throwable {
		driver.close();
	}
	
	@Given("^User is on AlchemyJobUrl Login Page$")
	public void user_is_on_AlchemyJobUrl_Login_Page() throws Throwable {
		driver=new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/jobs/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@And("^navigate to Jobs page$")
	public void navigate_to_Jobs_page() throws Throwable {
	   driver.findElement(By.xpath("//a[text()='Jobs']")).click();
	   Thread.sleep(4000);
	}

	@And("^Find the Keywords search input field and Type in keywords to search for jobs$")
	public void find_the_Keywords_search_input_field() throws Throwable {
		driver.findElement(By.id("search_keywords")).clear();
		driver.findElement(By.id("search_keywords")).sendKeys("testing");
	}

	@And("^Find the filter using XPath and filter job type to show only Full Time jobs$")
	public void find_the_filter_using_XPath_and_filter_job_type_to_show_only_Full_Time_jobs() throws Throwable {
		driver.findElement(By.id("job_type_freelance")).click();
	    driver.findElement(By.id("job_type_internship")).click();
	    driver.findElement(By.id("job_type_part-time")).click();
	    driver.findElement(By.id("job_type_temporary")).click();
	    Thread.sleep(4000);
	}

	@When("^Find the title of the job listing and print and Click on the Apply$")
	public void find_the_title_of_the_job_listing_using_XPath_and_print_it_to_the_console() throws Throwable {
		List<WebElement> eleJobList = driver.findElements(By.xpath("//li[contains(@class,'job_listing status')]//div/h3"));
	    int iApplyJob=0;
		for (int i = 0; i < eleJobList.size(); i++) {
	    	String sJobList = eleJobList.get(i).getText();
	    	if(sJobList.equalsIgnoreCase("Senior Quality Analyst")) {
	    		iApplyJob=i;
	    	}
			System.out.println("JobList-"+sJobList);
		}
		eleJobList.get(iApplyJob).click();
	}
	
	@Given("^Go to Post a Job page$")
	public void go_to_Post_a_Job_page() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
	}

	@And("^Enter the Email \"([^\"]*)\"$")
	public void enter_the_Email(String email) throws Throwable {
		
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("create_account_email"))));
		
		driver.findElement(By.id("create_account_email")).sendKeys(email);
	       
	}

	@And("^Enter the JobTitle \"([^\"]*)\"$")
	public void enter_the_JobTitle(String Title) throws Throwable {
		driver.findElement(By.id("job_title")).sendKeys(Title);
	   
	}
	
	@And("^Enter the JobDescription \"([^\"]*)\"$")
	public void enter_the_JobDescription(String Description) throws Throwable {
	    driver.switchTo().frame("job_description_ifr");
	    driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys(Description);
	    driver.switchTo().defaultContent();
	}

	@And("^Enter the ApplicationUrl \"([^\"]*)\"$")
	public void enter_the_ApplicationUrl(String ApplicationUrl) throws Throwable {
	    driver.findElement(By.id("application")).sendKeys(ApplicationUrl);
	}
	
	@And("^Enter the CompanyName \"([^\"]*)\"$")
	public void enter_the_CompanyName(String companyname) throws Throwable {
		 driver.findElement(By.id("company_name")).sendKeys(companyname);
	}
	@And("^Click submit$")
	public void click_submit() throws Throwable {
		 driver.findElement(By.name("submit_job")).click();
		 wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("job_preview_submit_button"))));
			
		 driver.findElement(By.id("job_preview_submit_button")).click();
	}

	@And("^Go to the Jobs page$")
	public void go_to_the_Jobs_page() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Job Dashboard']")).click();
	    Thread.sleep(4000);
	}

	@When("^Confirm job listing is shown on page\\.$")
	public void confirm_job_listing_is_shown_on_page() throws Throwable {
	   String confirmation = driver.findElement(By.xpath("//table[@class='job-manager-jobs']//tbody//td/small")).getText();
	   Actions builder=new Actions(driver);
	   if(confirmation.contains("Pending")) {
		   System.out.println("Confirm job listing is shown on page");
		   builder.moveToElement(driver.findElement(By.xpath("//table[@class='job-manager-jobs']//tbody//td/small")))
		   	.pause(900).click(driver.findElement(By.xpath("//a[text()='Delete']"))).perform();
		   driver.switchTo().alert().accept();
		   Thread.sleep(4000);
	   }
	   else {
		   System.out.println("Confirmation Failed job listing is not shown on page");
	   }
	}


	

}
