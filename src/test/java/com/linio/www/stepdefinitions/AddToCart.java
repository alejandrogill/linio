package com.linio.www.stepdefinitions;

import static com.linio.www.exception.NameNotIsCorrect.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import com.linio.www.exception.NameNotIsCorrect;
import com.linio.www.question.NameOfProduct;
import com.linio.www.task.AddToCar;
import com.linio.www.task.Find;
import com.linio.www.utils.MyChrome;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddToCart {
	@Before
	public void before() {
		OnStage.setTheStage(OnlineCast.ofStandardActors());
		
	}
	
	@Given("^that (.*) is on the linio page$")
	public void thatTheUserIsOnTheLinioPage(String user) {
		theActorCalled(user).whoCan(BrowseTheWeb.with(MyChrome.inThePage("https://www.linio.com.pe/")));

	}


	@When("^he adds the item (.*) to the cart$")
	public void heAddsTheItemImpresoraToTheCart(String product) {
		theActorInTheSpotlight().attemptsTo(Find.theProduct(product),AddToCar.forPurchase());
	}

	@Then("^he will be able to see the article (.*) entered$")
	public void heWillBeAbleToSeeTheArticleImpresoraEntered(String product) {
		 theActorInTheSpotlight().should(seeThat(NameOfProduct.ofLinio(), containsString(product)).orComplainWith(NameNotIsCorrect.class,MESSAGE));
	}

}
