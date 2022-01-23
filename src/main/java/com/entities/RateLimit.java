package com.entities;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateLimit {
	
	private int coreLimit;
	private String searchLimit;
	public int getCoreLimit() {
		return coreLimit;
	}
	public String getSearchLimit() {
		return searchLimit;
	}
	
	//dealing with nested json entities
	@JsonProperty("resources")
	private void unmarshallNested(Map<String, Object> resources) {
		@SuppressWarnings("unchecked")
		Map<String, Integer> core = (Map<String, Integer>) resources.get("core");
		coreLimit = core.get("limit");
		
		@SuppressWarnings("unchecked")
		Map<String, String> search = (Map<String, String>) resources.get("search");
		searchLimit = String.valueOf(search.get("limit"));
	}

}
