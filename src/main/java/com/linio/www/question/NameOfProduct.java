package com.linio.www.question;

import static com.linio.www.userinterface.AddToCar.PRODUCT_IN_THE_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NameOfProduct implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PRODUCT_IN_THE_CART).viewedBy(actor).asString();
	}
	
	public static NameOfProduct ofLinio() {
		return new NameOfProduct();
	}

}
