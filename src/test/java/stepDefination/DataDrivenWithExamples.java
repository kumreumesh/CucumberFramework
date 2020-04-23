package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenWithExamples {
	
	WebDriver driver;
	
	@Given("^Open an application url$")
	public void open_an_application_url() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("http://practice.automationtesting.in/my-account/");
	        
	       // Thread.sleep(7);
	  
	}

	@When("^Please enter \"(.*)\" and \"(.*)\"$")
	public void please_enter_and(String username, String password) throws InterruptedException {
		
		    driver.findElement(By.name("username")).sendKeys(username);
	     	Thread.sleep(2);
		    driver.findElement(By.id("password")).sendKeys(password);
		    Thread.sleep(2);
	    
	}
	
	@Then("^Click login button$")
	public void click_the_browser() {
		
		 driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
	    
	}


	@Then("^Close the browser$")
	public void close_the_browser() {
		
		driver.close();
	    
	}

}
