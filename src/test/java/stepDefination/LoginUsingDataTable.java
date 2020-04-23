package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginUsingDataTable {
	  
	WebDriver driver;
	
	@Given("^User on the home page$")
	public void user_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.automationtesting.in/my-account/");
	}

	@When("^User enter the username and password$")
	public void user_enter_the_username_and_password(DataTable values) throws InterruptedException {
		
             List<List<String>> data= values.raw();
               
		 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    // Thread.sleep(2);
		 driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		 //Thread.sleep(2);
	   
	}

	@Then("^User click on login button$")
	public void user_click_on_login_button() {
	    
		 driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
	    driver.close();
	}

}
