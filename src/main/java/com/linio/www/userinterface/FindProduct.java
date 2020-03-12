package com.linio.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FindProduct {

	public static final Target FIND_PRODUCT= Target.the("product filter").locatedBy("//input[@name='q' and not(@id)]");
	public static final Target BUTTON_FIND= Target.the("Button find").locatedBy("//button[@type='submit' and contains(@class,'btn-search')]");
	public static final Target PRODUCT = Target.the("selected product").locatedBy("(//div[@id='catalogue-product-container']/div)[1]");
	
}
