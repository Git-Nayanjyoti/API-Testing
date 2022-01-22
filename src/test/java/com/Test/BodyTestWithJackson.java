package com.Test;

import org.apache.http.client.methods.HttpGet;

public class BodyTestWithJackson extends BaseClass{

	@Test
	public void returnCorrectLogin() {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/andrejss88");
	}
}
