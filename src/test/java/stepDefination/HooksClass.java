package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;

public class HooksClass {
	
	

	
	@Given("^I am on hooks concept1$")
	public void i_am_on_hooks_concept1() {
		
		System.out.println("HOoks 1");
	   
	}

	@Given("^I am on hooks concept2$")
	public void i_am_on_hooks_concept2() {
	 
		System.out.println("HOoks 2");
	}
	@Before
	@Given("^I am on hooks concept3$")
	public void i_am_on_hooks_concept3() {
	 
		System.out.println("HOoks 3");
	}
	
	@After
	@Given("^I am on hooks concept4$")
	public void i_am_on_hooks_concept4() {
	 
		System.out.println("HOoks 4");
	}

}
