package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarAndBikeInsurance {

	@When("I click on carInsurance button")
	public void i_click_on_car_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on carInsurance");
	    
	}

	@When("I provide valid RTO Number and click on view quote button")
	public void i_provide_valid_rto_number_and_click_on_view_quote_button() {
	    // Write code here that turns the phrase above into concrete actions
     System.out.println("I provide valid RTO Number and click on view quote button");
	}

	@When("I provide valid details and click on view quote button")
	public void i_provide_valid_details_and_click_on_view_quote_button() {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("I provide valid details and click on view quote button");
	}

	@Then("I should get plan details")
	public void i_should_get_plan_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should get plan details");
	 
	}

	@When("I click on BikeInsurance button")
	public void i_click_on_bike_insurance_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("I click on BikeInsurance button");
	   
	}


	
	



}
