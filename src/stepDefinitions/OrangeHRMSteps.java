package stepDefinitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on OrangeHRMUrl Login Page$")
	public void user_is_on_OrangeHRMUrl_Login_Page() throws Throwable {
		driver=new FirefoxDriver();
	    driver.get("http://alchemy.hguy.co/orangehrm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@And("^User enters HRM UserNames and Passwords$")
	public void user_enters_HRM_UserNames_and_Passwords() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
	    driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@And("^Navigate to the Recruitment page and Click on the Vacancies$")
	public void navigate_to_the_Recruitment_page() throws Throwable {
		/*wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//b[text()='Recruitment']"))));
	    Actions builder=new Actions(driver);
	    builder.moveToElement(driver.findElement(By.xpath("//b[text()='Recruitment']")))
	    	.pause(900).click(driver.findElement(By.xpath("//a[text()='Vacancies']"))).perform();
	    */
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.xpath("//b[text()='Recruitment']")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.xpath("//a[text()='Vacancies']")));
	}

	
	@And("^Click on the Add button to navigate to the Add Job Vacancy form$")
	public void click_on_the_Add_button_to_navigate_to_the_Add_Job_Vacancy_form() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnAdd"))));
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();
	}

	@And("^Fill out the necessary details$")
	public void fill_out_the_necessary_details() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("addJobVacancy_jobTitle"))));
		
	    Select title=new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
	    title.selectByVisibleText("Android Developer");
	    driver.findElement(By.id("addJobVacancy_name")).sendKeys("Developer vacancy1");
	    driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys("Test Tester");
	    driver.findElement(By.id("addJobVacancy_noOfPositions")).sendKeys("10");
	    driver.findElement(By.id("addJobVacancy_description")).sendKeys("Test Description");
	  
	}
	
	@Given("^Fill out the following Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" details$")
	public void fill_out_the_following_Details_and_details(String JobTitle, String Vacany, String Manager, String NoOfPosition, String Description) throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("addJobVacancy_jobTitle"))));
		
	    Select title=new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
	    title.selectByVisibleText(JobTitle);
	    driver.findElement(By.id("addJobVacancy_name")).sendKeys(Vacany);
	    driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys(Manager);
	    driver.findElement(By.id("addJobVacancy_noOfPositions")).sendKeys(NoOfPosition);
	    driver.findElement(By.id("addJobVacancy_description")).sendKeys(Description);
	  
	}
	@And("^Click the Save button to save the vacancy$")
	public void click_the_Save_button_to_save_the_vacancy() throws Throwable {
		  driver.findElement(By.id("btnSave")).click();
	}

	@When("^Verify that the vacancy was created$")
	public void verify_that_the_vacancy_was_created() throws Throwable {
	    String sVacany = driver.findElement(By.id("addJobVacancy_name")).getAttribute("disabled");
	    if(sVacany.contains("true")) {
	    	System.out.println("Verify that the vacancy was created");
	    }
	    else
	    {
	    	System.out.println("Verification Failed that the vacancy was not created");
	    }
	}

	@Then("^Close the HRMbrowser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}
	
	@Given("^Navigate to the Recruitment page and click on the Add button$")
	public void navigate_to_the_Recruitment_page_and_click_on_the_Add_button() throws Throwable {
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.xpath("//b[text()='Recruitment']")));
	
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnAdd"))));
		driver.findElement(By.id("btnAdd")).click();
	    	
	}

	@And("^Fill in the details of the candidate$")
	public void fill_in_the_details_of_the_candidate() throws Throwable {
		
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("addCandidate_firstName"))));
		
		driver.findElement(By.id("addCandidate_firstName")).sendKeys("mathura1");
		driver.findElement(By.id("addCandidate_lastName")).sendKeys("Ganesh1");
		driver.findElement(By.id("addCandidate_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("addCandidate_contactNo")).sendKeys("9987654398");
		
	    Select Vacancy=new Select(driver.findElement(By.id("addCandidate_vacancy")));
	    Vacancy.selectByVisibleText("Test Vacancy");
	    
	}

	@And("^Upload a resume to the form$")
	public void upload_a_resume_to_the_form() throws Throwable {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.id("addCandidate_resume")));
	    String filePath="C:\\Users\\MathuraveeraganeshMe\\Desktop\\Ibm_Session\\BDD Project_Report\\Resume.docx";
	    Robot rb=new Robot();
	    
	    rb.setAutoDelay(2000);
	    StringSelection sc=new StringSelection(filePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@And("^Click Save$")
	public void click_Save() throws Throwable {
	    driver.findElement(By.id("btnSave")).click();
	}

	@When("^Navigate back to the Recruitments page to confirm candidate entry$")
	public void navigate_back_to_the_Recruitments_page_to_confirm_candidate_entry() throws Throwable {
	    driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
	
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("candidateSearch_candidateName"))));
		driver.findElement(By.id("candidateSearch_candidateName")).clear();
		driver.findElement(By.id("candidateSearch_candidateName")).sendKeys("mathura1 Ganesh1");
		driver.findElement(By.id("btnSrch")).click();
		Thread.sleep(4000);
		
		String sCandidateName = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//td[3]/a")).getText();
		if(sCandidateName.contains("mathura1 Ganesh1")) {
			System.out.println("confirm candidate entry");
			driver.findElement(By.xpath("//table[@id='resultTable']//tbody//td[1]")).click();
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			Thread.sleep(5000);
		}
		else {
			System.out.println("confirmation Failed for candidate entry");
		}
		
	}
	
	@Given("^Find the PIM option in the menu and click it$")
	public void find_the_PIM_option_in_the_menu_and_click_it() throws Throwable {
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.xpath("//b[text()='PIM']")));
	}

	@And("^Click the Add button to add a new Employee$")
	public void click_the_Add_button_to_add_a_new_Employee() throws Throwable {
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnAdd"))));
		driver.findElement(By.id("btnAdd")).click();
	}

	@And("^Make sure the Create Login Details checkbox is checked$")
	public void make_sure_the_Create_Login_Details_checkbox_is_checked() throws Throwable {
	    WebElement eleChkLogin = driver.findElement(By.id("chkLogin"));
	    if (eleChkLogin.isSelected()==false){
	    	eleChkLogin.click();
	    }
	}

	@And("^^Fill in the required fields using the \\\"([^\\\"]*)\\\" \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\" data from the Examples table$$")
	public void fill_in_the_required_fields_using_the_data_from_the_Examples_table(String fname,String lname,String sEmployeeId) throws Throwable {
	    driver.findElement(By.id("firstName")).sendKeys(fname);
	    driver.findElement(By.id("lastName")).sendKeys(lname);
	    driver.findElement(By.id("employeeId")).clear();
	    driver.findElement(By.id("employeeId")).sendKeys(sEmployeeId);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()"
				,driver.findElement(By.id("photofile")));
	    String filePath="C:\\Users\\MathuraveeraganeshMe\\Desktop\\Ibm_Session\\BDD Project_Report\\Photo.png";
	    Robot rb=new Robot();
	    
	    rb.setAutoDelay(2000);
	    StringSelection sc=new StringSelection(filePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@And("^Enter \"([^\"]*)\" and \"([^\"]*)\" to create the login$")
	public void enter_and_to_create_the_login(String uName, String pwd) throws Throwable {
		driver.findElement(By.id("user_name")).sendKeys(uName);
	    driver.findElement(By.id("user_password")).sendKeys(pwd);
	    driver.findElement(By.id("re_password")).sendKeys(pwd);
	}
	
	@When("^Verify that the employees have been created\\.$")
	public void verify_that_the_employees_have_been_created() throws Throwable {
		
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("personal_txtEmpFirstName"))));
		
	    String FirstName = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("disabled");
	    //System.out.println(FirstName);
	    if(FirstName.contains("true")) {
	    	System.out.println("Verify that the employees have been created");
	    }
	    else {
	    	System.out.println("Verification Failed for that the employees have been created");
	    }
	}





}
