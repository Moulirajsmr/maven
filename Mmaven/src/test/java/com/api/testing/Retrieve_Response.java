package com.api.testing;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Retrieve_Response {
	
	@Test
	public void api_testing() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		ResponseBody body = response.getBody();
		
		String asString = body.asString();
		
		System.out.println("Response body :" + asString);
		
		String statusLine = response.getStatusLine();
		
		System.out.println("Status Line :" + statusLine);
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(200 , statusCode);
		
		System.out.println("Status Code :" + statusCode);
		
		System.out.println("Validation Successful ");
	}
}
