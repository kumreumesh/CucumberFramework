package stepDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginUsingMap {
	
	WebDriver driver;
	
	@Given("^User currently on the home page$")
	public void user_currently_on_the_home_page() {
	
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.automationtesting.in/my-account/");
	}

	@When("^User need to enter the username and password$")
	public void user_need_to_enter_the_username_and_password(DataTable dataTab) {
		
	for(Map<String,String>	getdata:dataTab.asMaps(String.class,String.class)) {
		
		
		driver.findElement(By.name("username")).sendKeys(getdata.get("username"));
	    // Thread.sleep(2);
		 driver.findElement(By.id("password")).sendKeys(getdata.get("password"));
	}
		
		
		

	}

	@Then("^User need to click on login button$")
	public void user_need_to_click_on_login_button() {
		
		 driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
	    
	}

	@Then("^User finally close the browser$")
	public void user_finally_close_the_browser() {
	  
		 driver.quit();
	}


}
