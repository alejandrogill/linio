package com.linio.www.task;

import static com.linio.www.userinterface.FindProduct.BUTTON_FIND;
import static com.linio.www.userinterface.FindProduct.FIND_PRODUCT;
import static com.linio.www.userinterface.FindProduct.PRODUCT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Find implements Task{

	private String product;
	
	public Find(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(product).into(FIND_PRODUCT)
				, Click.on(BUTTON_FIND)
				,Click.on(PRODUCT));
	}
	
	public static Find theProduct(String product) {
		return Tasks.instrumented(Find.class, product);
	}

}
