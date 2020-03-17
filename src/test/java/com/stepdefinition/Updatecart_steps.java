package com.stepdefinition;

import com.pages.updatecart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Updatecart_steps {
	updatecart uc = new updatecart();

	
	@Given("^user launched DemoblazeApplication$")
	public void user_launched_DemoblazeApplication()  {
       uc.url();
		
	}

	@When("^the user selects  the multiple products and addedtothecart$")
	public void the_user_selects_the_multiple_products_and_addedtothecart() throws InterruptedException {
	   uc.cart();
	}

	@Then("^the user click on Cart button$")
	public void the_user_click_on_Cart_button() throws InterruptedException {
	    uc.select();
	}

	@Then("^user checks the updated price and print on the console window$")
	public void user_checks_the_updated_price_and_print_on_the_console_window() {
	    uc.price();
	}

}
