package pages.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.Login;
import pageobject.LoginPage;

public class Step_definition {
	
	WebDriver driver;
	public Step_definition() {
		
		this.driver=Hooks.driver;
	}
	
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {
	   
		driver.get("http://srssprojects.in/home.aspx");
		
	}

	@When("^check the tittle with \"([^\"]*)\" data$")
	public void check_the_tittle_with_data(String exp) throws Throwable {
	   
		String acttittle=driver.getTitle();
		
		if(acttittle.equals(exp))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

	@Then("^username field should be displayed$")
	public void username_field_should_be_displayed() throws Throwable {
	    
	
	}

	@Then("^close site$")
	public void close_site() throws Throwable {
	    driver.close();
	}

	@When("^enter the userid with \"([^\"]*)\" data and enter the password with \"([^\"]*)\" data and click on login$")
	public void enter_the_userid_with_data_and_enter_the_password_with_data_and_click_on_login(String arg1, String arg2) throws Throwable {
	   
		PageFactory.initElements(driver, LoginPage.class);
		
		Login.loginexe(arg1,arg2);
	}
	

	@Then("^branches button should be displayed$")
	public void branches_button_should_be_displayed() throws Throwable {
	    
	}



}
