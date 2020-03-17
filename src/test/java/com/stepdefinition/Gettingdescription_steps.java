package com.stepdefinition;

import com.pages.gettingdescription;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gettingdescription_steps {
	gettingdescription gd = new gettingdescription();
	
	@Given("^the user opens the demoblaze site Application from the  browser$")
	public void the_user_opens_the_demoblaze_site_Application_from_the_browser()  {
	   gd.demoblaze_homePage();
	   
	}

	@When("^the user scroll down that page$")
	public void the_user_scroll_down_that_page() throws InterruptedException  {
	    gd.Scrollby();
	}

	@Then("^the user checks the information available under aboutUs$")
	public void the_user_checks_the_information_available_under_aboutUs()  {
	    	gd.about();
	}

}
