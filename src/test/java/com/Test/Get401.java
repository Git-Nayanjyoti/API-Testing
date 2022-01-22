package com.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Get401 extends BaseClass {
	
	
	@DataProvider
	private Object[][] endpoints(){
		return new Object[][] {
			{"/user"},
			{"/user/followers"}, 
			{"/notifications"}
			
		};
	}
	
	//refactoring test
	@Test(dataProvider = "endpoints")
	 public void userReturns401(String endpoint) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + endpoint);
	    response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		assertEquals(actualStatus, 401);
	}
	
}
