package com.Test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Get404 extends BaseClass{
	
	
	@BeforeMethod
	public void setup() {
		client = HttpClientBuilder.create().build();
	}
	
	@AfterMethod
	public void closeResources() throws IOException {
		client.close();
		response.close();
	} 
	
	
	@Test
	 public void nonExistingUrlReturns404() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/nonexistingurl");
	    response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		Assert.assertEquals(actualStatus, 404);
	}

}
