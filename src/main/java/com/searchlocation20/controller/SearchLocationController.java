package com.searchlocation20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlocation20.dto.Location;

@Controller
public class SearchLocationController {

	@RequestMapping("/searchLocation")
	public String showSearchLocationPage() {
		return "searchLocation";
	}

	@RequestMapping("/getLocation")
	public String getLocationById(@RequestParam("id") long id, ModelMap modelMap) {
		LocationRestClient restClient = new LocationRestClient();
		Location location = restClient.getLocationWS(id);
		modelMap.addAttribute("location", location);
		return "searchResult";
	}
}
