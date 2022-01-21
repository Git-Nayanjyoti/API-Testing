package com.Test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;

public class BaseClass {
	public static final String BASE_ENDPOINT = "https://api.github.com";
	CloseableHttpClient client;
	CloseableHttpResponse response;
}
