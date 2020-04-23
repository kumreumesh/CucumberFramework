package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataDriven {
	
WebDriver driver;
	
	@Given("^Launch browser then open application URL$")
	public void launch_browser_and_open_application_URL() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");	
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.automationtesting.in/");
        
        Thread.sleep(7);
     
    }

	@When("^Click over my acccount link$")
	public void click_on_my_acccount_link() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		Thread.sleep(5);
	  
	}

	@Then("^Enter \"(.*)\" and \"(.*)\"$")
	public void enter_Username_and_Password(String username,String password ) throws InterruptedException {
	    
	    driver.findElement(By.name("username")).sendKeys(username);
     	Thread.sleep(2);
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(2);
	
	}
	@Then("^Select remember me checkbox$")
	public void select_the_remember_me_checkbox() {
	  WebElement checkbox=driver.findElement(By.xpath("//input[@name='rememberme' and @type='checkbox']"));
	  checkbox.click();
	  
	  System.out.println(checkbox.isDisplayed());
	  
	}

	@Then("^Click over login button$")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
	   
	}
	
	@Then("^Click over logout button$")
	public void click_on_logout_button(){
      driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
	}

}
