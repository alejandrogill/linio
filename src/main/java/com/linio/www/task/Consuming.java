package com.linio.www.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Consuming implements Task{

	private String endPoint;
	private String resource;
	private String parameters;
	
	
	public Consuming(String endPoint) {
		this.endPoint = endPoint;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		Response response =RestAssured.given().headers("Content-Type","application/json;charset=UTF-8","Accept-Encoding","gzip,deflate").
				relaxedHTTPSValidation("TLS").when().get(endPoint+resource+parameters).then().extract().response();		
		        actor.remember("response", String.valueOf(response.getStatusCode()));
		        System.out.println(response.getBody().asString());
		        Serenity.recordReportData().withTitle("Response").andContents(response.getBody().asString());
	}
	public static Consuming theService(String endPoint) {
		return Tasks.instrumented(Consuming.class,endPoint);
	}
	public Consuming inResource(String resource) {
		this.resource=resource;
		return this;
	}
	public Consuming withParameters(String parameters) {
		this.parameters=parameters;
		return this;
	}

}
