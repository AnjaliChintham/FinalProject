package com.stepdefinition;

import com.pages.Clickingonmonitors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Clickingonmanitors_steps {
	Clickingonmonitors cm = new Clickingonmonitors();
	
	@Given("^the user opens the demoblaze site$")
	public void the_user_opens_the_demoblaze_site()  {
		cm.url();
	    
	}

	@When("^the user clicks the Monitors under catagories$")
	public void the_user_clicks_the_Monitors_under_catagories()  {
	    cm.categeory();
	}

	@Then("^the user select the particular  Monitors$")
	public void the_user_select_the_particular_Monitors()  {
	   cm.monitors();
	}

	@Then("^Monitors will be added to the cart$")
	public void monitors_will_be_added_to_the_cart() throws InterruptedException  {
	    cm.cart();
	}

}
