package stepDefination;

import io.cucumber.java.en.Given;

public class TaggingClass {
	
	
	@Given("^User enter home page$")
	public void user_enter_home_page() {
		
		System.out.println("==User enter home page==");
	  
	}
	
	
	@Given("^User on the contact us page$")
    public void user_on_the_contact_us_page() {
		
		System.out.println("===User on the contact us page ===");
 
    }

    @Given("^User on the about us page$")
    public void user_on_the_about_us_page() {
	
	    System.out.println("===User on the about us page ===");
    
    }

    @Given("^User verify the home page title$")
    public void user_verify_the_home_page_title() {
	
	    System.out.println("===User verify the home page title===");
    
    }
 
    @Given("^User on the career page$")
    public void user_on_the_career_page() {
	
	    System.out.println("===User on the career page===");
   
    }

    @Given("^User on the our services page$")
    public void user_on_the_our_services_page() {
	
	    System.out.println("===User on the our services page===");
 
    }

}
