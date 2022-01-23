package com.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.testng.annotations.Test;

import com.entities.Credentials;

public class DeleteAndPost extends BaseClass{
	@Test
	public void deleteIsSuccessful() throws ClientProtocolException, IOException {
		HttpDelete request = new HttpDelete("https://api.github.com/repos/andrejss88/deleteme");
		//with line 18 commented the test will fail as it need to authorize before deleting the file.
		//creat a class Credentials and store the token as TOKEN
		//request.setHeader(HttpHeaders.AUTHORIZATION, "token" + Credentials.TOKEN);
		response = client.execute(request);
		int actualStatusCode = response.getStatusLine().getStatusCode();
		assertEquals(actualStatusCode, 204);
	}
	
	@Test(description = "This test will work only if you set valid email + password in the Credentials Class")
	//will work for Web APIs that support Basic Authentication
	public void createRepoReturns201() throws ClientProtocolException, IOException {
		//Create an HttpPost with a valied Endpoint
		HttpPost request = new HttpPost("http://api.github.com/user/repos");

		//Set the Basic Auth Header
		String auth = Credentials.EMAIL + ":" + Credentials.PASSWORD;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.ISO_8859_1));
		String authHeader = "Basic" + new String(encodedAuth);
		request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
		
		//Define Json to Post and set as Entity
		String json = "{\"name\":\"deleteme\"}";
		request.setEntity(new StringEntity(json,ContentType.APPLICATION_JSON));
		
		//Send
		response = client.execute(request);
		int actualStatusCode = response.getStatusLine().getStatusCode();
		assertEquals(actualStatusCode, 201);
	}
	
	@Test
	//will work with out any date or time limit 
	public void createRepoReturns201WebToken() throws ClientProtocolException, IOException {
		//Create an HttpPost with a valied Endpoint
		HttpPost request = new HttpPost("http://api.github.com/user/repos");

		//Set the Basic Auth Header
		
		request.setHeader(HttpHeaders.AUTHORIZATION, "token" + Credentials.TOKEN);
		
		//Define Json to Post and set as Entity
		String json = "{\"name\":\"deleteme\"}";
		request.setEntity(new StringEntity(json,ContentType.APPLICATION_JSON));
		
		//Send
		response = client.execute(request);
		int actualStatusCode = response.getStatusLine().getStatusCode();
		assertEquals(actualStatusCode, 201);
	}
}
