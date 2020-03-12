package com.linio.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(	features="src/test/resources/features/add_to_cart.feature"
,glue="com.linio.www.stepdefinitions"
,snippets=SnippetType.CAMELCASE

		)

public class AddToCart {

}
