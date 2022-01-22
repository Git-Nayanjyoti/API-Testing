package com.Test;


import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Get200 extends BaseClass {
	
	@Test
	 public void baseUrlReturns200() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT);
	    response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		Assert.assertEquals(actualStatus, 200);
	}
	
	//If we don't close the client and the response after each test then in that case some test may hang and not run
	@Test
	 public void rateLimitReturns200() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/rate_limit");
		CloseableHttpResponse response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		Assert.assertEquals(actualStatus, 200);
	}
	
	@Test
	 public void searchResponseReturns200() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASE_ENDPOINT + "/search/repositories?q=java");
		CloseableHttpResponse response = client.execute(get);
		int actualStatus = response.getStatusLine().getStatusCode();
		Assert.assertEquals(actualStatus, 200);
	}
}
