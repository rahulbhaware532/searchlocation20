package com.searchlocation20.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlocation20.dto.Location;

public class LocationRestClient {

	public Location getLocationWS(long id) {
		RestTemplate rest = new RestTemplate();// use to consume json object
		Location location = rest.getForObject("http://localhost:8080/location/" + id, Location.class);

		return location;
	}
}
