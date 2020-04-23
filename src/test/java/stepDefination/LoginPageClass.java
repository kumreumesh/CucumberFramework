package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageClass {
	
	WebDriver driver;
	
	@Given("^Launch browser and open application URL$")
	public void launch_browser_and_open_application_URL() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.automationtesting.in/");
        
        Thread.sleep(7);
     
    }

	@When("^Click on my acccount link$")
	public void click_on_my_acccount_link() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		Thread.sleep(5);
	  
	}

	@Then("^Enter Username and Password$")
	public void enter_Username_and_Password() throws InterruptedException {
	    
	    driver.findElement(By.name("username")).sendKeys("umesh.kumre@ibrandtech.in");
     	Thread.sleep(2);
	    driver.findElement(By.id("password")).sendKeys("Kumreuk#09");
	    Thread.sleep(2);
	
	}
	@Then("^Select the remember me checkbox$")
	public void select_the_remember_me_checkbox() {
	  WebElement checkbox=driver.findElement(By.xpath("//input[@name='rememberme' and @type='checkbox']"));
	  checkbox.click();
	  
	  System.out.println(checkbox.isDisplayed());
	  
	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
	   
	}




}
