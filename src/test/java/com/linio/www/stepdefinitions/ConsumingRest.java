package com.linio.www.stepdefinitions;

import static com.linio.www.exception.IncorrectCodeResponse.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import com.linio.www.exception.IncorrectCodeResponse;
import com.linio.www.question.CodeResponse;
import com.linio.www.task.Consuming;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConsumingRest {
	@When("^the (.*) consuming service$")
	public void theUserConsumingService(String name) {
		OnStage.theActorCalled(name).attemptsTo(Consuming.theService("https://gorest.co.in").inResource("/public-api/users").withParameters("?access-token=5GEJt_65v8DINudMYr_mMbvkKHFYYE1lHpkN&first_name=Gil"));
	}


	@Then("^he should see the code response (.*)$")
	public void heShouldSeeTheCodeResponse(String code) {
	    theActorInTheSpotlight().should(seeThat(CodeResponse.theService(), is(code)).orComplainWith(IncorrectCodeResponse.class,MESSAGE));
	}

}
