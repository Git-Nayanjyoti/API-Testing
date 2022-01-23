package com.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;

import com.Main.ResponseUtils;
import com.entities.NotFound;
import com.entities.RateLimit;
import com.entities.User;

public class BodyTestWithJackson extends BaseClass{

	@Test
	public void returnCorrectLogin() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/andrejss88");
		response = client.execute(get);
		User user = ResponseUtils.unmarshallGeneric(response, User.class);
		assertEquals(user.getLogin(), "andrejss88");
	}
	
	@Test
	public void returnCorrectId() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/andrejss88");
		response = client.execute(get);
		User user = ResponseUtils.unmarshallGeneric(response, User.class);
		assertEquals(user.getId(), 11834443);
	}
	
	@Test
	public void notFoundMessageIsCorrect() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/nonexistingendpoint");
		response = client.execute(get);
		NotFound notFoundMessage = ResponseUtils.unmarshallGeneric(response, NotFound.class);
		assertEquals(notFoundMessage.getMessage(), "Not Found");
	}
	
	//dealing with nested json entities
	@Test
	public void correctRateLimitsAreSet() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/rate_limit");
		response = client.execute(get);
		RateLimit rateLimits = ResponseUtils.unmarshallGeneric(response, RateLimit.class);
		assertEquals(rateLimits.getCoreLimit(), 60);
		assertEquals(rateLimits.getSearchLimit(), "10");
	}
	
	
}
