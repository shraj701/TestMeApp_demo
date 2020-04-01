package com.demo.Cucumber_Demo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shout {
	
	Person sean= new Person();
	
	@Given("Sean and Lucia are {int} meters away")
	public void sean_and_Lucia_are_meters_away(Integer distance) {
	    // Write code here that turns the phrase above into concrete actions
		sean.setDistance(distance);
	}

	@When("Sean shouts {string} to Lucia")
	public void sean_shouts_to_Lucia(String message) {
	    // Write code here that turns the phrase above into concrete actions
	    sean.setmessage(message);
	}

	@Then("Lucia listens to the message")
	public void lucia_listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
		String message=sean.getmessage();
		Assert.assertEquals("free coffee",message);
	}



}
