package com.stepdefinition;

import com.pages.loginandlogout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginandlogout_step {
	loginandlogout  ob8 = new  loginandlogout();
	
	
	@Given("^user launched chromebrowser$")
	public void user_launched_chromebrowser() 
	{
	  ob8.url();  
	}

	@When("^user opened  Demoblaze website$")
	public void user_opened_Demoblaze_website()  {
	   ob8.demoblaze_homePage();
	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() throws InterruptedException  {
	    ob8.userclick("Ramya", "ramya");
	}

	@Then("^the user logouts the page$")
	public void the_user_logouts_the_page()  {
	   ob8.logout();
	}

}
