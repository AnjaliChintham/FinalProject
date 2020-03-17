package com.stepdefinition;

import com.pages.Invalidcontactdetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalidcontact_step {
	Invalidcontactdetails c=new Invalidcontactdetails();
	@Given("^user opens the demoblazeApplication in the chromebrowser$")
	public void user_opens_the_demoblazeApplication_in_the_chromebrowser()  {
		c.demoblaze_homePage();
	    
	}

	@When("^the user clicks on the contact link$")
	public void the_user_clicks_on_the_contact_link()  {
	    c.clickcontact();
	}

	@Then("^the user gives the invalid data$")
	public void the_user_gives_the_invalid_data() {
	   c.details();
	}

	@Then("^user clicks on the send message button$")
	public void user_clicks_on_the_send_message_button() throws InterruptedException  {
	   c.send();
	}

}
