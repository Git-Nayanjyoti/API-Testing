package com.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpOptions;
import org.testng.annotations.Test;

import com.Main.ResponseUtils;

public class Options204 extends BaseClass{
	@Test
	public void optionsReturnsCorrectMethodsList() throws ClientProtocolException, IOException {
		String header = "Access-Control-Allow-Methods";
		String expectedReply = "GET, POST, PATCH, PUT, DELETE";
		HttpOptions request = new HttpOptions(BASE_ENDPOINT);
		response = client.execute(request);
		String actualValue = ResponseUtils.getHeader(response, header);
		assertEquals(actualValue, expectedReply);
	}

}
