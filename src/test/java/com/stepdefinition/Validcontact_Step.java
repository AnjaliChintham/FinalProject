package com.stepdefinition;

import java.io.IOException;

import com.pages.validcontactdetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Validcontact_Step {
	
	validcontactdetails de=new validcontactdetails();

	@Given("^user launched the DemoblazeApplication$")
	public void user_launched_the_DemoblazeApplication()  {
	  de.demoblaze_homePage();
	}
	@When("^the user clicks on  contact link$")
	public void the_user_clicks_on_contact_link() {
	  de.clickcontact();
	}

	@Then("^the user fill the valid information from excelsheet$")
	public void the_user_fill_the_valid_information_from_excelsheet() throws IOException  {
		
		
	    de.details();
	}

	@Then("^user clicks on send message button$")
	public void user_clicks_on_send_message_button() throws InterruptedException  {
	    
		de.send();
	}
}
