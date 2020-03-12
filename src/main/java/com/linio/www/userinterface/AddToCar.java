package com.linio.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCar {

	public static final Target BUTTON_ADD_TO_CAR=Target.the("Button add to car").locatedBy("//button[@id='buy-now']");
	public static final Target GO_THE_CART=Target.the("Go the cart").locatedBy("//a[text()='Ir al carrito']");
	public static final Target PRODUCT_IN_THE_CART=Target.the("Product in the cart").locatedBy("(//div[@class='cart-item row']//a[@href])[2]");
}
