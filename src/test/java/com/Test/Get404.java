package com.Test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get404 extends BaseClass{
	
	

	
	@Test
	 public void nonExistingUrlReturns404() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/nonexistingurl");
	    response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		Assert.assertEquals(actualStatus, 404);
	}

}
