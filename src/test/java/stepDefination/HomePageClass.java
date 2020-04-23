package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageClass {
	
	WebDriver driver;
	
	@Given("^Launch browser and open Application URL$")
	public void launch_browser_and_open_Application_URL() {
		
		
        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		
        System.out.println("==========Launch browser====================");
        
		driver=new ChromeDriver();
		
		
		driver.get("https://crbtech.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		}
		
	@When("^Now User on homepage$")
	public void now_User_on_homepage() {
		
		
		System.out.println("======User on Home Page Now===========");
	}
	  
	@Then("^Verify that title of the home page$")
	public void verify_that_title_of_the_home_page() {
		
		String actualTitle=driver.getTitle();
		String expTitle="CRBtech - Best Training & Placement Institute | 100% Job Guarantee";
		
		if(actualTitle.equals(expTitle))
		{
			System.out.println("Testcase Passed");
		}else {
			System.out.println("TestCase Failed");
		}
		
	}

	@Then("^Close that browser$")
	public void close_that_browser() {
	  
		driver.close();
		System.out.println("==============close browser=================");
	}
	
	



}
