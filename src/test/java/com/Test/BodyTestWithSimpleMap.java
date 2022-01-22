package com.Test;

import static org.testng.Assert.assertEquals;
import static com.entities.User.LOGIN;
import static com.entities.User.ID;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class BodyTestWithSimpleMap extends BaseClass{
	
	@Test
	public void returnsCorrectLogin() throws ParseException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/andrejss88");
		response = client.execute(get);
		String jsonBody = EntityUtils.toString(response.getEntity());
		JSONObject jsonObject = new JSONObject(jsonBody);
		String loginValue = (String) getValueFor(jsonObject, LOGIN);
		assertEquals(loginValue, "andrejss88");
	}
	
	@Test
	public void returnsCorrectId() throws ParseException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/andrejss88");
		response = client.execute(get);
		String jsonBody = EntityUtils.toString(response.getEntity());
		JSONObject jsonObject = new JSONObject(jsonBody);
		Integer loginValue = (Integer) getValueFor(jsonObject, ID);
		assertEquals(loginValue, Integer.valueOf(11834443));
	 }
	
	private Object getValueFor(JSONObject jsonObject, String key) {
		return jsonObject.get(key);
	}
}
