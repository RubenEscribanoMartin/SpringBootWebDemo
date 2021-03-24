package com.springWeb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springWeb.demo.service.DemoService;

/**
 * This is the main controller of the project
 * @RestController interface has @Controller & @ResponseBody
 * @author ruben
 *
 */
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	// constructor
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}

	@RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
	public String welcome(@PathVariable("userName") String userName) {
		return demoService.welcome(userName);
	}

}
