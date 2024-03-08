package org.ravi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DiscountServiceTest {

    DiscountService discountService = null;
    String percentage = "";

    @Given("Execute DiscountService Business")
    public void execute_discount_service_business() {
        discountService = new DiscountService();
    }
    @When("amount is {int}")
    public void amount_is(Integer int1) {
        percentage = discountService.getDiscount(int1);
    }
    @Then("The discount is ten percent")
    public void the_discount_is_ten_percent() {
        Assert.assertEquals("10%", percentage);
    }

    @Then("The discount is fifteen percent")
    public void the_discount_is_fifteen_percent() {
        Assert.assertEquals("15%", percentage);
    }

}
