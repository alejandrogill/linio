package com.linio.www.task;

import static com.linio.www.userinterface.AddToCar.BUTTON_ADD_TO_CAR;
import static com.linio.www.userinterface.AddToCar.GO_THE_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BUTTON_ADD_TO_CAR),
				Click.on(GO_THE_CART));
	}
	
	public static AddToCar forPurchase() {
		return Tasks.instrumented(AddToCar.class);
	}

}
